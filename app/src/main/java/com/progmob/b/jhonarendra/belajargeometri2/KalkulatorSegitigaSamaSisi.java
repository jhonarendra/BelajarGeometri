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

public class KalkulatorSegitigaSamaSisi extends AppCompatActivity {
    EditText editSisiSegitigaSamaSisi;
    TextView textKllSegitigaSamaSisi;
    TextView textLuasSegitigaSamaSisi;

    Double sisi;
    Double sisibagi2;
    Double tinggi;
    Double kllSegitigaSamaSisi;
    Double luasSegitigaSamaSisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_segitiga_samasisi);

        editSisiSegitigaSamaSisi = (EditText) findViewById(R.id.editSisiSegitigaSamaSisi);
        textKllSegitigaSamaSisi = (TextView) findViewById(R.id.text_kll_segitigasamasisi);
        textLuasSegitigaSamaSisi = (TextView) findViewById(R.id.text_luas_segitigasamasisi);

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
    public void HitungKllSegitigaSamaSisi(View view){
        sisi = Double.parseDouble(editSisiSegitigaSamaSisi.getText().toString());
        kllSegitigaSamaSisi = 3 * sisi;
        textKllSegitigaSamaSisi.setText(String.valueOf(kllSegitigaSamaSisi));
    }
    public void HitungLuasSegitigaSamaSisi(View view){
        sisi = Double.parseDouble(editSisiSegitigaSamaSisi.getText().toString());
        sisibagi2 = sisi / 2;
        tinggi = Math.sqrt(Math.pow(sisi, 2) - Math.pow(sisibagi2, 2));
        luasSegitigaSamaSisi = sisi * tinggi / 2;

        textLuasSegitigaSamaSisi.setText(String.valueOf(luasSegitigaSamaSisi));

    }
}
