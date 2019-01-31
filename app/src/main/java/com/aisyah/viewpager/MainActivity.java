package com.aisyah.viewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;

    String[] nama = {
            "v", "v2", "v3","v4"
    };
    int[] gambar = {
            R.drawable.v, R.drawable.v2, R.drawable.v3, R.drawable.v4
    };
    String []isi = {
            "Dia dari Daegu", "Dia punya kepribadian 4D", "Dia suka warna abu abu", "Dia lahir tahun 1995"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewpager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getApplicationContext(), nama, gambar, isi);
        viewPager.setAdapter(adapter);

    }
}
