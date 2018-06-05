package com.progmob.b.jhonarendra.belajargeometri2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;

/**
 * Created by Jhonarendra on 6/2/2018.
 */

public class KalkulatorSegitigaSikuSiku extends AppCompatActivity {
    EditText editAlasSegitigaSikuSiku;
    EditText editTinggiSegitigaSikuSiku;
    EditText editSisiSegitigaSikuSiku;
    TextView textKllSegitigaSikuSiku;
    TextView textLuasSegitigaSikuSiku;

    Double alas;
    Double sisi;
    Double tinggi;
    Double kllSegitigaSikuSiku;
    Double luasSegitigaSikuSiku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_segitiga_sikusiku);

        editAlasSegitigaSikuSiku = (EditText) findViewById(R.id.editAlasSegitigaSikuSiku);
        editTinggiSegitigaSikuSiku = (EditText) findViewById(R.id.editTinggiSegitigaSikuSiku);
        editSisiSegitigaSikuSiku = (EditText) findViewById(R.id.editSisiSegitigaSikuSiku);
        textKllSegitigaSikuSiku = (TextView) findViewById(R.id.text_kll_segitigasikusiku);
        textLuasSegitigaSikuSiku = (TextView) findViewById(R.id.text_luas_segitigasikusiku);

        Intent intent = getIntent();
        final String namaBangunDatar = intent.getExtras().getString("namaBangunDatar");
        final String descBangunDatar = intent.getExtras().getString("descBangunDatar");
        final int whiteThumbBangunDatar = intent.getExtras().getInt("whiteThumbBangunDatar");
        final String luasBangunDatar = intent.getExtras().getString("luasBangunDatar");
        final String kelilingBangunDatar = intent.getExtras().getString("kelilingBangunDatar");
        final int imageRumusBangunDatar = intent.getExtras().getInt("rumusBangunDatar");

        FloatingActionButton fab = findViewById(R.id.fabBack);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MateriBangunDatar.class);
                intent.putExtra("namaBangunDatar", namaBangunDatar);
                intent.putExtra("whiteThumbBangunDatar", whiteThumbBangunDatar);
                intent.putExtra("descBangunDatar", descBangunDatar);
                intent.putExtra("kelilingBangunDatar", kelilingBangunDatar);
                intent.putExtra("luasBangunDatar", luasBangunDatar);
                intent.putExtra("rumusBangunDatar", imageRumusBangunDatar);

                startActivity(intent);
            }
        });

    }
    public void HitungKllSegitigaSikuSiku(View view){
        alas = Double.parseDouble(editAlasSegitigaSikuSiku.getText().toString());
        sisi = Double.parseDouble(editSisiSegitigaSikuSiku.getText().toString());
        tinggi = Double.parseDouble(editTinggiSegitigaSikuSiku.getText().toString());
        kllSegitigaSikuSiku = tinggi + sisi + alas;
        textKllSegitigaSikuSiku.setText(String.valueOf(kllSegitigaSikuSiku));
    }
    public void HitungLuasSegitigaSikuSiku(View view){
        alas = Double.parseDouble(editAlasSegitigaSikuSiku.getText().toString());
        tinggi = Double.parseDouble(editTinggiSegitigaSikuSiku.getText().toString());
        luasSegitigaSikuSiku = alas * tinggi / 2;

        textLuasSegitigaSikuSiku.setText(String.valueOf(luasSegitigaSikuSiku));

    }
}
