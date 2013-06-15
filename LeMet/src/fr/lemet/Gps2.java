package fr.lemet;

/**
 * Created by guigui on 15/06/13.
 */

import java.io.IOException;
import java.util.List;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
public class Gps2 {
/*
    private void sendMyPosition() {
        LocationManager lManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);

        lManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,0, 0,(LocationListener) this);
        Location location = lManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);

        double latitude = location.getLatitude();
        double longitude = location.getLongitude();

        String toSendLat = Double.toString(latitude);
        String toSendLong = Double.toString(longitude);

        SharedPreferences mprefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editeur = mprefs.edit();
        String login = mprefs.getString("login", "user inconnu");

        HttpClient httpclient = new DefaultHttpClient();
        HttpContext localContext = new BasicHttpContext();
        HttpPost httppost = new HttpPost("http://10.0.2.2:8888/HH/sendPosition.php");

        try {
            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);

            nameValuePairs.add(new BasicNameValuePair("type", type));
            nameValuePairs.add(new BasicNameValuePair("login", login));
            nameValuePairs.add(new BasicNameValuePair("latitude", toSendLat));
            nameValuePairs.add(new BasicNameValuePair("longitude", toSendLong));

            httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs, HTTP.UTF_8));
            httpclient.execute(httppost, localContext);

            editeur.putString("latitude", toSendLat);
            editeur.putString("longitude", toSendLong);
            editeur.commit();

            Toast.makeText(getBaseContext(), "Position envoyée", Toast.LENGTH_SHORT).show();
        }

        catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(getBaseContext(), "Erreur de transmission de la position", Toast.LENGTH_SHORT).show();
        }*/
    }


