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
import android.os.Bundle;


public class MapActivity extends Activity {
    private LocationManager lManager;
    private MapView mapView;
    private MapController mapController;
    private ScaleBarOverlay mScaleBarOverlay;
    private SimpleLocationOverlay mMyLocationOverlay;
    private double latitude;
    private double longitude;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);

        mapView = (MapView) this.findViewById(R.id.mapview);
        mapView.setBuiltInZoomControls(true);
        mapView.setMultiTouchControls(true);
        mapController = this.mapView.getController();
        mapController.setZoom(30);
        mapController.setCenter(new GeoPoint(49104566, 6220053));
    }


}