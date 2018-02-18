package com.example.marissagift.nyimas_1202154354_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MenuUtama extends AppCompatActivity {

    private static final String TAG_ACTIVITY = MenuUtama.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.dine_in:
                if (checked)
                    // Same day service
                    displayToast(getString(R.string.chosen) + getString(R.string.dine_in));
                break;

            case R.id.take_away:
                if (checked)
                    // Next day delivery
                    displayToast(getString(R.string.chosen) + getString(R.string.take_away));
                break;

            default:
                Log.d(TAG_ACTIVITY, getString(R.string.nothing_clicked));
                break;
        }
    }

    public void order(View view) {
            // Jika pilih Dine In dan klik pesan sekarang akan menampilkan pesan Dine In
            if (((RadioButton)findViewById(R.id.dine_in)).isChecked()){
                Intent intent = new Intent(this, DineIn.class);
                Toast.makeText(this, "Kamu akan Dine In", Toast.LENGTH_SHORT).show();
                startActivity(intent);

                // Jika pilih Take Away dan klik pesan sekarang akan menampilkan pesan Take Away
            }else if (((RadioButton)findViewById(R.id.take_away)).isChecked()){
                Intent intent = new Intent(this, TakeAway.class);
                Toast.makeText(this, "Kamu akan Take Away", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }else{
                Toast.makeText(this,"Pilih salah satu terlebih dahulu",Toast.LENGTH_SHORT).show();
            }
        }

}