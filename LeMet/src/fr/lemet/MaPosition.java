package fr.lemet;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MaPosition extends Activity {

    public final static String positionGps = "com.example.lemet.positionGps";
    private Button passerellePositionGps = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ma_position);

        passerellePositionGps = (Button) findViewById(R.id.position_gps);

        // On rajoute un extra
        passerellePositionGps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Le premier paramètre est le nom de l'activité actuelle
                // Le second est le nom de l'activité de destination
                Intent activitePositionGps = new Intent(MaPosition.this, Gps.class);

                activitePositionGps.putExtra(positionGps, 31);

                // Puis on lance l'intent
                startActivity(activitePositionGps);

            }
        });


    }
}