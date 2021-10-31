package com.complete.project_nabishop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    ViewFlipper slide;
    FrameLayout danhmuc, nut1,nut2,nut3,nut4, sp1, tkiem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        danhmuc = (FrameLayout) findViewById(R.id.fr_dm);
        slide = (ViewFlipper) findViewById(R.id.slide_anh);
        nut1 = (FrameLayout) findViewById(R.id.item1);
        nut2 = (FrameLayout) findViewById(R.id.item2);
        nut3 = (FrameLayout) findViewById(R.id.item3);
        nut4 = (FrameLayout) findViewById(R.id.item4);
        sp1 = (FrameLayout) findViewById(R.id.sp1);
        tkiem = (FrameLayout) findViewById(R.id.timkiem);
        slide.setFlipInterval(3000);
        slide.setAutoStart(true);
        danhmuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, category.class);
                startActivity(intent);
            }
        });
        nut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, wishlist.class);
                startActivity(intent);
            }
        });
        nut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        nut3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Cart1.class);
                startActivity(intent);
            }
        });
        nut4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, User.class);
                startActivity(intent);
            }
        });
        sp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, product_detail.class);
                startActivity(intent);
            }
        });
        tkiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, search.class);
                startActivity(intent);
            }
        });
    }
}