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

        WebView planweb = (WebView)findViewById(R.id.webview);
        WebSettings planSettings = planweb.getSettings();
        planSettings.setSupportZoom(true);
        planSettings.setBuiltInZoomControls(true);
        planSettings.setDefaultZoom(WebSettings.ZoomDensity.CLOSE);
        //planweb.loadUrl("file:///android_asset/planlemet.png");

        //planweb.loadDataWithBaseURL("file:///android_asset/","<html><center><img src=\"planlemet.png\" ali></html>","text/html","utf-8","");
        planweb.loadDataWithBaseURL("file:///android_asset/","<html><head><style type='text/css'>body{margin:auto auto;text-align:center;} img{width:auto;} </style></head><body><img src='planlemet.png'/></body></html>" ,"text/html",  "UTF-8","");
    }
}