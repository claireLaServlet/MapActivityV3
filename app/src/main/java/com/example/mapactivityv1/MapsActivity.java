package com.example.mapactivityv1;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, LocationListener {

    private GoogleMap mMap;
    private LocationManager lm;
    private Location location;
    private double lat;
    private double lon;
    private Marker myMarkerPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        //On récupère le service de localisation
        lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        //on recupere la position via le gps
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(lat,lon), 15));
    }

    @Override
    public void onLocationChanged(Location location) {
        this.location = location;
        //repositionnement de la carte apres changement de coordonnées
        lat = location.getLatitude();
        lon = location.getLongitude();

        LatLng ville = new LatLng(lat, lon);

        mMap.animateCamera(CameraUpdateFactory.newLatLng(new
                LatLng(lat,lon)), 1000, null);

        aficherMarquer();
    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {
    }

    @Override
    public void onProviderEnabled(String s) {
    }

    @Override
    public void onProviderDisabled(String s) {
    }

    private void aficherMarquer() {
        if(myMarkerPosition == null)
        {
            MarkerOptions markstop = new MarkerOptions().position(new LatLng(-3.88,151.21)).title("Position");
            myMarkerPosition = mMap.addMarker(markstop);
        }
        else {
            myMarkerPosition.setPosition(new LatLng(lat, lon));
        }

        Marker mar;
        MarkerOptions marci = new MarkerOptions().position(new LatLng(-3.88,151.21)).title("Position");

    }
}
