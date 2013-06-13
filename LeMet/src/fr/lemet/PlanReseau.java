package fr.lemet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class PlanReseau extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plan_reseau);

        // Instanciation du WebView...
        WebView wvSite = (WebView)findViewById(R.id.webview);

        //...on active JavaScript...
        WebSettings webSettings = wvSite.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //...et on charge la page
        wvSite.loadUrl("file:///");
    }
}
