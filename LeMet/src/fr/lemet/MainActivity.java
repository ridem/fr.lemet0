package fr.lemet;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    public final static String plans = "com.example.lemet.plans";
    public final static String horaires = "com.example.lemet.horaires";
    public final static String itineraire = "com.example.lemet.itineraire";



    private Button passerellePlans = null;
    private Button passerelleHoraires = null;
    private Button passerelleItineraire = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        passerellePlans = (Button) findViewById(R.id.plans);
        passerelleHoraires = (Button) findViewById(R.id.horaires);
        passerelleItineraire = (Button) findViewById(R.id.itineraire);



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


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    // Tests

}