package fr.lemet;

import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapController;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.ScaleBarOverlay;
import org.osmdroid.views.overlay.SimpleLocationOverlay;
import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.os.Bundle;
import android.widget.Toast;


public class MapActivity extends Activity implements LocationListener {
        private MapView mapView;
        private MapController mapController;

        private LocationManager lm;

        private double latitude;
        private double longitude;
        private double altitude;
        private float accuracy;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.map_activity);

            mapView = (MapView) this.findViewById(R.id.mapview);
            mapView.setBuiltInZoomControls(true);
            mapView.setMultiTouchControls(true);
            mapController = this.mapView.getController();
            mapController.setZoom(25);
        }

        @Override
        protected void onResume() {
            super.onResume();
            lm = (LocationManager) this.getSystemService(LOCATION_SERVICE);
            if (lm.isProviderEnabled(LocationManager.GPS_PROVIDER))
                lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 10000, 0, this);
                lm.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 10000, 0, this);
        }

        @Override
        protected void onPause() {
            super.onPause();
            lm.removeUpdates(this);
        }


        protected boolean isRouteDisplayed() {
            return false;
        }

        @Override
        public void onLocationChanged(Location location) {
            latitude = location.getLatitude() + 0.0014;
            longitude = location.getLongitude()+ 0.0035;
            altitude = location.getAltitude();
            accuracy = location.getAccuracy();

            String msg = String.format(
                    getResources().getString(R.string.new_location), latitude,
                    longitude, altitude, accuracy);
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show();

            GeoPoint p = new GeoPoint((int) (latitude * 1E6), (int) (longitude * 1E6));
            mapController.animateTo(p);
            mapController.setCenter(p);
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
}
