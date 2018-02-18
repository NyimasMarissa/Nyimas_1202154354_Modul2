package com.example.marissagift.nyimas_1202154354_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    String[] Menu, Harga;
    int[] Img_res = {R.drawable.appletart, R.drawable.cheesecake, R.drawable.doublechocolate, R.drawable.redvelvet, R.drawable.tiramisu,
            R.drawable.vanilla, R.drawable.mango, R.drawable.blueberry, R.drawable.rainbow};
    ArrayList<Menu>listMenu = new ArrayList<Menu>();
    private MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        mRecyclerView = findViewById(R.id.recyclerview);
        Menu = getResources().getStringArray(R.array.namaMenu); //mengambil data dari string
        Harga = getResources().getStringArray(R.array.namaHarga);

        int i = 0;
        for (String nama : Menu){  //mengisi data arraylist
            Menu menu = new Menu(Img_res[i], nama, "Harga: Rp " + Harga[i]);
            listMenu.add(menu);
            i++;
        }

        //menset recyclerView
        mAdapter  = new MenuAdapter(this, listMenu);
        mRecyclerView.setAdapter(mAdapter);

        //recyclerView sebagai pengelola tata letak default
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}