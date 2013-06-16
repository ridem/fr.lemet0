package fr.lemet;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class PlanReseau extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.different_plan);
        WebView planweb = (WebView)findViewById(R.id.webview);
        setTitle("Plan du réseau LeMet");
        //planweb.setPadding(0, 0, 0, 0);
        //planweb.setInitialScale(getScale());
        planweb.setInitialScale(70);

        WebSettings planSettings = planweb.getSettings();
        planSettings.setSupportZoom(true);
        planSettings.setBuiltInZoomControls(true);
        //planSettings.setLoadWithOverviewMode(true);
        planSettings.setUseWideViewPort(true);
        //planSettings.setDefaultZoom(WebSettings.ZoomDensity.FAR);
        planweb.loadUrl("file:///android_asset/planlemet.webp");
        //planSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        //planweb.loadDataWithBaseURL("file:///android_asset/","<html><center><img src=\"planlemet.png\" ali></html>","text/html","utf-8","");
        //planweb.loadDataWithBaseURL("file:///android_asset/","<html><head><style type='text/css'>body{margin:O 0; text-align:center;} img{border:0px; text-align:center;} </style></head><body><img src=\"planlemet.png\" /></body></html>" ,"text/html",  "UTF-8","");

        //planweb.setPictureListener(new MyPictureListener());
    }
/*    private int getScale(){z
        Display display = ((WindowManager) getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        int width = display.getWidth();
        Double val = new Double(width)/new Double(2312);
        val = val * 110d;
        return val.intValue();
    }*/
/*
    class MyPictureListener implements WebView.PictureListener {

        @Override
        public void onNewPicture(WebView view, Picture arg1) {
            Display display = getWindowManager().getDefaultDisplay();
            int width=display.getWidth();
            int height=display.getHeight();
            view.scrollTo(width/2, height/4);
        }
    }*/




}

