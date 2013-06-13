package fr.lemet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class PlanLigne14 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plan_reseau);

        WebView planweb = (WebView)findViewById(R.id.webview);

        //...on active JavaScript...
        WebSettings planSettings = planweb.getSettings();
        planSettings.setSupportZoom(true);
        planSettings.setBuiltInZoomControls(true);

        //...et on charge la page
        planweb.loadUrl("file:///android_asset/ligne1vertical.jpg");
    }
}
