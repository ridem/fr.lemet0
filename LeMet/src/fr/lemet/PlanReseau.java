package fr.lemet;

import android.app.Activity;
import android.os.Bundle;

public class PlanReseau extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plan_reseau);
        TouchImageView img = (TouchImageView) findViewById(R.id.plansortie);
        img.setImageResource(R.drawable.testm);
        img.setMaxZoom(4f);
    }
}