package fr.lemet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlanReseau extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plan_reseau);
        TouchImageView img = (TouchImageView) findViewById(R.id.testm);
        img.setImageResource(R.drawable.testm);
        img.setMaxZoom(4f);


    }
}
