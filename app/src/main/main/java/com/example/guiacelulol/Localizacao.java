package com.example.guiacelulol;

import android.location.Location;
import android.location.LocationListener;

public class Localizacao implements LocationListener {

    public static double latitude;
    public static double longitude;
    @Override
    public void onLocationChanged(Location location) {
        latitude  = location.getLatitude();
        longitude = location.getLongitude();
    }
}
