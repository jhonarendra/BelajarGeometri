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

public class KalkulatorLimasSegitiga extends AppCompatActivity {

    EditText editTinggiLimasS3, editTSLimasS3, editTALimasS3, editSALimasS3;
    TextView textLuasLimasS3, textVolumeLimasS3;

    Double tinggiAlas, tinggiLimas, sisiAlas, tinggiSisi, volume, luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_limassegitiga);

        editTinggiLimasS3 = (EditText) findViewById(R.id.editTinggiLimasS3);
        editTSLimasS3 = (EditText) findViewById(R.id.editTSLimasS3);
        editTALimasS3 = (EditText) findViewById(R.id.editTALimasS3);
        editSALimasS3 = (EditText) findViewById(R.id.editSALimasS3);
        textVolumeLimasS3 = (TextView) findViewById(R.id.text_volume_limassegitiga);
        textLuasLimasS3 = (TextView) findViewById(R.id.text_luas_limassegitiga);

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

    public void HitungVolumeLimasSegitiga(View view){
        tinggiAlas = Double.parseDouble(editTALimasS3.getText().toString());
        sisiAlas = Double.parseDouble(editSALimasS3.getText().toString());
        tinggiLimas = Double.parseDouble(editTinggiLimasS3.getText().toString());
        volume = (tinggiAlas*sisiAlas*tinggiLimas)/6;
        textVolumeLimasS3.setText(String.valueOf(volume));
    }
    public void HitungLuasLimasSegitiga(View view){
        tinggiAlas = Double.parseDouble(editTALimasS3.getText().toString());
        sisiAlas = Double.parseDouble(editSALimasS3.getText().toString());
        tinggiSisi = Double.parseDouble(editTSLimasS3.getText().toString());
        luas = (tinggiAlas*sisiAlas)/2 + 3*(sisiAlas*tinggiSisi)/2;
        textLuasLimasS3.setText(String.valueOf(luas));
    }
}

