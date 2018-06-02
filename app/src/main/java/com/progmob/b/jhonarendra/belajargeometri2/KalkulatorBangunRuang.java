package com.progmob.b.jhonarendra.belajargeometri2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Jhonarendra on 6/1/2018.
 */

public class KalkulatorBangunRuang extends AppCompatActivity {
    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String namaBangunRuang = intent.getExtras().getString("namabangunruang");

        switch (namaBangunRuang){
            case "Kubus":
                Intent i = new Intent(getApplicationContext(), KalkulatorKubus.class);
                startActivity(i);
                break;
            default:
                setContentView(R.layout.activity_main);
        }
    }
}