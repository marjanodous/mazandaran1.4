package com.example.mazandaran;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnTarikhche, btnMarasem, btnAkhlaghi, btnEteghadi, btnZeiarati, btnGhaza,
            btnShirini, btnAhang, btnfilm, btnabout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTarikhche = findViewById(R.id.tarikhche);
        btnMarasem = findViewById(R.id.marasem);
        btnAkhlaghi = findViewById(R.id.akhlaqi);
        btnEteghadi = findViewById(R.id.eteqadt);
        btnZeiarati = findViewById(R.id.makan_ziarati);
        btnGhaza = findViewById(R.id.qaza);
        btnShirini = findViewById(R.id.shirini);
        btnAhang = findViewById(R.id.ahang);
        btnfilm = findViewById(R.id.film);
        btnabout = findViewById(R.id.about);


        btnTarikhche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tabs.flag_tarikhche=true;
                startActivity(new Intent(MainActivity.this, tabs.class));
            }
        });
        btnMarasem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tabs.flag_marasem=true;
                startActivity(new Intent(MainActivity.this, tabs.class));
            }
        });
        btnAkhlaghi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tabs.flag_akhlaqi=true;
                startActivity(new Intent(MainActivity.this, tabs.class));
            }
        });
        btnEteghadi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tabs.flag_eteqadat=true;
                startActivity(new Intent(MainActivity.this, tabs.class));
            }
        });
        btnZeiarati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tabs.flag_makan_ziarati=true;
                startActivity(new Intent(MainActivity.this, tabs.class));
            }
        });
        btnGhaza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tabs.flag_qaza=true;
                startActivity(new Intent(MainActivity.this, tabs.class));
            }
        });
        btnShirini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tabs.flag_shirini=true;
                startActivity(new Intent(MainActivity.this, tabs.class));
            }
        });
        btnAhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tabs.flag_ahang=true;
                startActivity(new Intent(MainActivity.this, tabs.class));
            }
        });
        btnfilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, film.class));
            }
        });
        btnabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              startActivity(new Intent(MainActivity.this,about.class));
            }
        });
    }
}
