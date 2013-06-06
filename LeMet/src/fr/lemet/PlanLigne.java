package fr.lemet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class PlanLigne extends Activity {

    public final static String planLigneBus1 = "com.example.lemet.planLigneBus1";
    private Button passerellePlanLigneBus1 = null;

    public final static String planLigneBus2 = "com.example.lemet.planLigneBus2";
    private Button passerellePlanLigneBus2 = null;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plan_ligne);

        passerellePlanLigneBus1 = (Button) findViewById(R.id.bus_1);
        passerellePlanLigneBus2 = (Button) findViewById(R.id.bus_2);

        passerellePlanLigneBus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent activitePlanLigneBus1 = new Intent(PlanLigne.this, PlanLigne1.class);
                activitePlanLigneBus1.putExtra(planLigneBus1, 5);
                startActivity(activitePlanLigneBus1);
            }
        });

        passerellePlanLigneBus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent activitePlanLigneBus2 = new Intent(PlanLigne.this, PlanLigne2.class);
                activitePlanLigneBus2.putExtra(planLigneBus2, 6);
                startActivity(activitePlanLigneBus2);
            }
        });
    }
}