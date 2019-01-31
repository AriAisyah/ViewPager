package com.aisyah.viewpager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class ViewPagerAdapter extends PagerAdapter {
    Context context;
    String[] nama;
    int[] gambar;

    public ViewPagerAdapter(Context context, String[] nama, int[] gambar, String[] isi) {
        this.context = context;
        this.nama = nama;
        this.gambar = gambar;
        this.isi = isi;
    }

    String[] isi;

    @Override
    public int getCount() {
        return gambar.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == ((ScrollView)o);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        TextView judul, isii;
        ImageView imageView;

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = layoutInflater.inflate(R.layout.viewitem, container, false);
        judul = v.findViewById(R.id.judulitem);
        imageView = v.findViewById(R.id.gambar);
        isii = v.findViewById(R.id.isiitem);

        judul.setText(nama[position]);
        isii.setText(isi[position]);
        imageView.setImageResource(gambar[position]);
        ((ViewPager)container).addView(v);
        return v;

    };

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ((ViewPager)container).removeView((ScrollView)object);
    }
}
