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

public class KalkulatorBelahKetupat extends AppCompatActivity {
    EditText editD1BelahKetupat;
    EditText editD2BelahKetupat;
    EditText editSisiBelahKetupat;
    TextView textKllBelahKetupat;
    TextView textLuasBelahKetupat;

    Double diagonal1;
    Double diagonal2;
    Double sisi;
    Double kllBelahKetupat;
    Double luasBelahKetupat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_belahketupat);

        editD1BelahKetupat = (EditText) findViewById(R.id.editD1BelahKetupat);
        editD2BelahKetupat = (EditText) findViewById(R.id.editD2BelahKetupat);
        editSisiBelahKetupat = (EditText) findViewById(R.id.editSisiBelahKetupat);
        textKllBelahKetupat = (TextView) findViewById(R.id.text_kll_belahketupat);
        textLuasBelahKetupat = (TextView) findViewById(R.id.text_luas_belahketupat);

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
    public void HitungKllBelahKetupat(View view){
        sisi = Double.parseDouble(editSisiBelahKetupat.getText().toString());
        kllBelahKetupat = 4 * sisi;
        textKllBelahKetupat.setText(String.valueOf(kllBelahKetupat));
    }
    public void HitungLuasBelahKetupat(View view){
        diagonal1 = Double.parseDouble(editD1BelahKetupat.getText().toString());
        diagonal2 = Double.parseDouble(editD2BelahKetupat.getText().toString());
        luasBelahKetupat = diagonal1 * diagonal2 / 2;

        textLuasBelahKetupat.setText(String.valueOf(luasBelahKetupat));

    }
}
