package fr.lemet;

import android.app.Activity;
import android.os.Bundle;

public class PinchImageActivity extends Activity {

    PinchImageView view;

    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plan_reseau);

        view = (PinchImageView) findViewById(R.id.testm);
        //new SqueezeView(webView);
    }


}