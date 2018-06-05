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

public class KalkulatorSegitigaSamaKaki extends AppCompatActivity {
    EditText editAlasSegitigaSamaKaki;
    EditText editTinggiSegitigaSamaKaki;
    EditText editSisiSegitigaSamaKaki;
    TextView textKllSegitigaSamaKaki;
    TextView textLuasSegitigaSamaKaki;

    Double alas;
    Double sisi;
    Double tinggi;
    Double kllSegitigaSamaKaki;
    Double luasSegitigaSamaKaki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_segitiga_samakaki);

        editAlasSegitigaSamaKaki = (EditText) findViewById(R.id.editAlasSegitigaSamaKaki);
        editTinggiSegitigaSamaKaki = (EditText) findViewById(R.id.editTinggiSegitigaSamaKaki);
        editSisiSegitigaSamaKaki = (EditText) findViewById(R.id.editSisiSegitigaSamaKaki);
        textKllSegitigaSamaKaki = (TextView) findViewById(R.id.text_kll_segitigasamakaki);
        textLuasSegitigaSamaKaki = (TextView) findViewById(R.id.text_luas_segitigasamakaki);

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
    public void HitungKllSegitigaSamaKaki(View view){
        alas = Double.parseDouble(editAlasSegitigaSamaKaki.getText().toString());
        sisi = Double.parseDouble(editSisiSegitigaSamaKaki.getText().toString());
        kllSegitigaSamaKaki = 2 * sisi + alas;
        textKllSegitigaSamaKaki.setText(String.valueOf(kllSegitigaSamaKaki));
    }
    public void HitungLuasSegitigaSamaKaki(View view){
        alas = Double.parseDouble(editAlasSegitigaSamaKaki.getText().toString());
        tinggi = Double.parseDouble(editTinggiSegitigaSamaKaki.getText().toString());
        luasSegitigaSamaKaki = alas * tinggi / 2;

        textLuasSegitigaSamaKaki.setText(String.valueOf(luasSegitigaSamaKaki));

    }
}
