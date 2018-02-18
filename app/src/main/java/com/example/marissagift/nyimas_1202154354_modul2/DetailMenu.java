package com.example.marissagift.nyimas_1202154354_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMenu extends AppCompatActivity {
    ImageView gambar;
    TextView menuMakan, hargaMakan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        //inisiasi
        gambar = findViewById(R.id.foto);
        menuMakan = findViewById(R.id.nama_menu);
        hargaMakan = findViewById(R.id.harga_menu);

        Intent i = this.getIntent();

        //cek apakah ada data yang dikirim
        if (getIntent().hasExtra("image_res") && getIntent().hasExtra("menu") && getIntent().hasExtra("harga")) {
            //terima data
            int imgRes = i.getExtras().getInt("image_res");
            String menu = i.getExtras().getString("menu");
            String harga = i.getExtras().getString("harga");

            //kalo ada set datanya
            gambar.setImageResource(imgRes);
            menuMakan.setText(menu);
            hargaMakan.setText(harga);
        }
    }
}