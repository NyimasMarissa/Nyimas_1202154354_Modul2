package com.example.marissagift.nyimas_1202154354_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import static android.widget.AdapterView.*;

public class DineIn extends AppCompatActivity implements OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        // Buat ArrayAdapter menggunakan array string dan layout spinner default.
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.tables_array, android.R.layout.simple_spinner_item);

        // Tentukan tata letak yang akan digunakan saat daftar pilihan muncul
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        // Terapkan adaptor ke spinner
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
    public void onClickOrder(View view) {
        Intent intent = new Intent(this,DaftarMenu.class);
        startActivity(intent);
    }
}