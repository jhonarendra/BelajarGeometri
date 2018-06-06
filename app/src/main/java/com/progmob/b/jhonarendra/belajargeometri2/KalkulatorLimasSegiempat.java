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

public class KalkulatorLimasSegiempat extends AppCompatActivity {

    EditText editTSLimasS4;
    EditText editTinggiLimasS4;
    EditText editSisiLimasS4;
    TextView textVolumeLimasS4;
    TextView textLuasLimasS4;

    Double tinggiLimas, tinggiSisi, sisi, luas, volume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_limassegiempat);

        editTSLimasS4 = (EditText) findViewById(R.id.editTSLimasS4);
        editTinggiLimasS4 = (EditText) findViewById(R.id.editTinggiLimasS4);
        editSisiLimasS4 = (EditText) findViewById(R.id.editSisiLimasS4);
        textVolumeLimasS4 = (TextView) findViewById(R.id.text_volume_limassegiempat);
        textLuasLimasS4 = (TextView) findViewById(R.id.text_luas_limassegiempat);

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

    public void HitungVolumeLimasSegiempat(View view){
        sisi = Double.parseDouble(editSisiLimasS4.getText().toString());
        tinggiLimas = Double.parseDouble(editTinggiLimasS4.getText().toString());
        volume = (sisi * sisi * tinggiLimas) / 3;

        textVolumeLimasS4.setText(String.valueOf(volume));

    }
    public void HitungLuasLimasSegiempat(View view){
        sisi = Double.parseDouble(editSisiLimasS4.getText().toString());
        tinggiSisi = Double.parseDouble(editTinggiLimasS4.getText().toString());
        luas = 2*(sisi * tinggiSisi)+sisi*sisi;

        textLuasLimasS4.setText(String.valueOf(luas));

    }


}

