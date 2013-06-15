package fr.lemet;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import org.hsqldb.jdbc.JDBCDriver;

import fr.lemet.gtfs.GtfsBase;

public class MainActivity extends Activity {

    public final static String plans = "fr.lemet.plans";
    public final static String horaires = "fr.lemet.horaires";
    public final static String itineraire = "fr.lemet.itineraire";
    public final static String position = "fr.lemet.position";

    private Button passerellePlans = null;
    private Button passerelleHoraires = null;
    private Button passerelleItineraire = null;
    private Button passerellePosition = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        passerellePlans = (Button) findViewById(R.id.plans);
        passerelleHoraires = (Button) findViewById(R.id.horaires);
        passerelleItineraire = (Button) findViewById(R.id.itineraire);
        passerellePosition = (Button) findViewById(R.id.maposition);

        passerellePlans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Le premier paramètre est le nom de l'activité actuelle
                // Le second est le nom de l'activité de destination
                Intent activitePlans = new Intent(MainActivity.this, Plans.class);

                // On rajoute un extra
                activitePlans.putExtra(plans, 31);

                // Puis on lance l'intent
                startActivity(activitePlans);

            }
        });

         passerelleHoraires.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 // TODO Auto-generated method stub
                 Intent activiteHoraires = new Intent(MainActivity.this, Horaires.class);
                 activiteHoraires.putExtra(horaires, 2);
                 startActivity(activiteHoraires);
             }
         });

         passerelleItineraire.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent activiteItineraire = new Intent(MainActivity.this, Itineraire.class);
                activiteItineraire.putExtra(itineraire, 3);
                startActivity(activiteItineraire);
             }
         });

         passerellePosition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Le premier paramètre est le nom de l'activité actuelle
                // Le second est le nom de l'activité de destination
                Intent activitePosition = new Intent(MainActivity.this, MaPosition.class);

                // On rajoute un extra
                activitePosition.putExtra(position, 31);

                // Puis on lance l'intent
                startActivity(activitePosition);

            }
         });
    }
}