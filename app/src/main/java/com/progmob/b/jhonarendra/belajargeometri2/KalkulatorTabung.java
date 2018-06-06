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

public class KalkulatorTabung extends AppCompatActivity {

    EditText editJariTabung, editTinggiTabung;
    TextView textLuasTabung, textVolumeTabung;

    Double jari,tinggi, volume, luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_tabung);

        editJariTabung = (EditText) findViewById(R.id.editJariTabung);
        editTinggiTabung = (EditText) findViewById(R.id.editTinggiTabung);
        textVolumeTabung = (TextView) findViewById(R.id.text_volume_tabung);
        textLuasTabung = (TextView) findViewById(R.id.text_luas_tabung);

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

    public void HitungVolumeTabung(View view){
        jari = Double.parseDouble(editJariTabung.getText().toString());
        tinggi = Double.parseDouble(editTinggiTabung.getText().toString());
        volume = 3.14*jari*jari*tinggi;
        textVolumeTabung.setText(String.valueOf(volume));
    }
    public void HitungLuasTabung(View view){
        jari = Double.parseDouble(editJariTabung.getText().toString());
        tinggi = Double.parseDouble(editTinggiTabung.getText().toString());
        luas = 2*(3.14*jari*jari)+(2*3.14*jari)*tinggi;
        textLuasTabung.setText(String.valueOf(luas));
    }
}

