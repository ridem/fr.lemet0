package fr.lemet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class PlanLigne13 extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.different_plan);

        WebView planweb = (WebView)findViewById(R.id.webview);
        planweb.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        planweb.loadUrl("file:///android_asset/ligne13.jpg");
    }
}