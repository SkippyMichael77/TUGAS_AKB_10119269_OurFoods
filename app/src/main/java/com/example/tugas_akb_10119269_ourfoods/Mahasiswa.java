package com.example.tugas_akb_10119269_ourfoods;

//10119269 Zuhair Rasyid Wafi IF7

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Mahasiswa extends AppCompatActivity {

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahasiswa);

        //PENTING
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.nav_mahasiswa);

        //inisialisasi
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.nav_home:
                    startActivity(new Intent(getApplicationContext()
                            ,MapsActivity.class));
                    overridePendingTransition(0,0);
                    return true;
                case R.id.nav_mahasiswa:
                    return true;
                case R.id.nav_about:
                    startActivity(new Intent(getApplicationContext()
                            , About.class));
                    overridePendingTransition(0,0);
                    return true;
            }
            return false;
        });
    }

}