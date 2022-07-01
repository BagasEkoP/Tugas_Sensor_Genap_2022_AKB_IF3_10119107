package com.example.tugas_sensor_akb_10119107;

//Nama  : Bagas Eko Pambudi
//NIM   : 10119107
//Kelas : IF-3

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class TempatFragment extends Fragment {

    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        @Override
        public void onMapReady(GoogleMap googleMap) {
            LatLng lokasi1 = new LatLng(-6.9346884975549585, 107.76927269761127);
            googleMap.addMarker(new MarkerOptions().position(lokasi1).title("Waroeng Steak & Shake Jatinangor"));

            LatLng lokasi2 = new LatLng(-6.934384962531882, 107.76929147307432);
            googleMap.addMarker(new MarkerOptions().position(lokasi2).title("Ayam Crisbar Jatinangor"));

            LatLng lokasi3 = new LatLng(-6.934036163272662, 107.7712146169318);
            googleMap.addMarker(new MarkerOptions().position(lokasi3).title("Richeese Factory"));

            LatLng lokasi4 = new LatLng(-6.9342624834321205, 107.77153648201255);
            googleMap.addMarker(new MarkerOptions().position(lokasi4).title("Pizza Hut Jatinangor Town Square"));

            LatLng lokasi5 = new LatLng(-6.9346006321736615, 107.77157671514765);
            googleMap.addMarker(new MarkerOptions().position(lokasi5).title("KFC Jatinangor Town Square"));

            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lokasi3, 17));
        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tempat, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }
}