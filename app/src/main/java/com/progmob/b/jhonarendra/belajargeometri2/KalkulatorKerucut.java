package com.progmob.b.jhonarendra.belajargeometri2;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Jhonarendra on 6/2/2018.
 */

public class KalkulatorKerucut extends AppCompatActivity {

    EditText editJariKerucut, editJSKerucut, editTinggiKerucut ;
    TextView textLuasKerucut, textVolumeKerucut;

    Double jari, jariSisi, tinggi, volume, luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_kerucut);

        editJariKerucut = (EditText) findViewById(R.id.editJariKerucut);
        editJSKerucut = (EditText) findViewById(R.id.editJSKerucut);
        editTinggiKerucut = (EditText) findViewById(R.id.editTinggiKerucut);
        textVolumeKerucut = (TextView) findViewById(R.id.text_volume_kerucut);
        textLuasKerucut = (TextView) findViewById(R.id.text_luas_kerucut);

        Intent intent = getIntent();

        final String namaBangunRuang = intent.getExtras().getString("namaBangunRuang");
        final String descBangunRuang = intent.getExtras().getString("descBangunRuang");
        final int whiteThumbBangunRuang = intent.getExtras().getInt("whiteThumbBangunRuang");
        final String luasBangunRuang = intent.getExtras().getString("luasBangunRuang");
        final String volumeBangunRuang = intent.getExtras().getString("volumeBangunRuang");
        final int rumusBangunRuang = intent.getExtras().getInt("rumusBangunRuang");

        FloatingActionButton fab = findViewById(R.id.fabBack);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MateriBangunRuang.class);

                intent.putExtra("namaBangunRuang", namaBangunRuang);
                intent.putExtra("descBangunRuang", descBangunRuang);
                intent.putExtra("whiteThumbBangunRuang", whiteThumbBangunRuang);
                intent.putExtra("luasBangunRuang", luasBangunRuang);
                intent.putExtra("volumeBangunRuang", volumeBangunRuang);
                intent.putExtra("rumusBangunRuang", rumusBangunRuang);

                startActivity(intent);
            }
        });
    }

    public void HitungVolumeKerucut(View view){
        jari = Double.parseDouble(editJariKerucut.getText().toString());
        tinggi = Double.parseDouble(editTinggiKerucut.getText().toString());
        volume = (3.14*jari*jari*tinggi)/3;
        textVolumeKerucut.setText(String.valueOf(volume));
    }
    public void HitungLuasKerucut(View view){
        jari = Double.parseDouble(editJariKerucut.getText().toString());
        jariSisi = Double.parseDouble(editJSKerucut.getText().toString());
        luas = (3.14*jari*jari)+(3.14*jari*jariSisi);
        textLuasKerucut.setText(String.valueOf(luas));
    }
}

