package fr.lemet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Plans extends Activity {
    public final static String planReseau = "com.example.lemet.planReseau";

    private Button passerellePlanReseau = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_plans);

        passerellePlanReseau = (Button) findViewById(R.id.plan_reseau);

        passerellePlanReseau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent activitePlanReseau = new Intent(Plans.this, PlanReseau.class);
                activitePlanReseau.putExtra(planReseau, 4);
                startActivity(activitePlanReseau);
            }
        });
    }
}