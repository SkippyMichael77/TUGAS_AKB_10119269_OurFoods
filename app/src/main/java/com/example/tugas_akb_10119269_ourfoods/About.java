package com.example.tugas_akb_10119269_ourfoods;

//10119269 Zuhair Rasyid Wafi IF7

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

public class About extends AppCompatActivity {

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        DotsIndicator dotsIndicator = findViewById(R.id.dots_indicator);
        ViewPager2 viewPager2 = findViewById(R.id.viewPager2);
        AboutAdapter aboutAdapter = new AboutAdapter(ObjectAbout.createData());
        viewPager2.setAdapter(aboutAdapter);
        dotsIndicator.setViewPager2(viewPager2);

        //PENTING
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.nav_about);

        //inisialisasi
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.nav_home:
                    startActivity(new Intent(getApplicationContext()
                            ,MapsActivity.class));
                    overridePendingTransition(0,0);
                    return true;
                case R.id.nav_mahasiswa:
                    startActivity(new Intent(getApplicationContext()
                            ,Mahasiswa.class));
                    overridePendingTransition(0,0);
                    return true;
                case R.id.nav_about:
                    return true;
            }
            return false;
        });
    }
}