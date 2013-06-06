package fr.lemet;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.widget.Toast;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;

import fr.lemet.R;

public class HelloGoogleMapActivity extends MapActivity implements
        LocationListener {

    private MapView mapView;
    private MapController mc;

    private LocationManager lm;

    private double latitude;
    private double longitude;
    private double altitude;
    private float accuracy;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapView = (MapView) this.findViewById(R.id.mapView);
        mapView.setBuiltInZoomControls(true);

        mc = mapView.getController();
        mc.setZoom(17);
    }

    @Override
    protected void onResume() {
        super.onResume();
        lm = (LocationManager) this.getSystemService(LOCATION_SERVICE);
        if (lm.isProviderEnabled(LocationManager.GPS_PROVIDER))
            lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 10000, 0,
                    this);
        lm.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 10000, 0,
                this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        lm.removeUpdates(this);
    }

    @Override
    protected boolean isRouteDisplayed() {
        return false;
    }

    @Override
    public void onLocationChanged(Location location) {
        latitude = location.getLatitude();
        longitude = location.getLongitude();
        altitude = location.getAltitude();
        accuracy = location.getAccuracy();

        String msg = String.format(
                getResources().getString(R.string.new_location), latitude,
                longitude, altitude, accuracy);
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();

        GeoPoint p = new GeoPoint((int) (latitude * 1E6), (int) (longitude * 1E6));
        mc.animateTo(p);
        mc.setCenter(p);
    }

    @Override
    public void onProviderDisabled(String provider) {
        String msg = String.format(
                getResources().getString(R.string.provider_disabled), provider);
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onProviderEnabled(String provider) {
        String msg = String.format(
                getResources().getString(R.string.provider_enabled), provider);
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
        String newStatus = "";
        switch (status) {
            case LocationProvider.OUT_OF_SERVICE:
                newStatus = "OUT_OF_SERVICE";
                break;
            case LocationProvider.TEMPORARILY_UNAVAILABLE:
                newStatus = "TEMPORARILY_UNAVAILABLE";
                break;
            case LocationProvider.AVAILABLE:
                newStatus = "AVAILABLE";
                break;
        }
        String msg = String.format(
                getResources().getString(R.string.provider_disabled), provider,
                newStatus);
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    // Est-ce que tu vois cette modif ?s
    // et toi ?

}