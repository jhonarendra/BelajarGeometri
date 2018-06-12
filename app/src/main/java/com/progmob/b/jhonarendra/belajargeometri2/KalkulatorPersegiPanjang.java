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

public class KalkulatorPersegiPanjang extends AppCompatActivity {

    EditText editPanjangPP, editLebarPP;
    TextView textKllPP;
    TextView textLuasPP;

    Double panjang, lebar, kllPP, luasPP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_persegi_panjang);

        editPanjangPP = (EditText) findViewById(R.id.editPanjangPP);
        editLebarPP = (EditText) findViewById(R.id.editLebarPP);
        textLuasPP = (TextView) findViewById(R.id.text_luas_persegipanjang);
        textKllPP = (TextView) findViewById(R.id.text_kll_persegipanjang);

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

    public void HitungKllPersegiPanjang(View view){
        panjang = Double.parseDouble(editPanjangPP.getText().toString());
        lebar = Double.parseDouble(editLebarPP.getText().toString());
        kllPP = 2 * (panjang + lebar);

        textKllPP.setText(String.valueOf(kllPP));

    }
    public void HitungLuasPersegiPanjang(View view){
        panjang = Double.parseDouble(editPanjangPP.getText().toString());
        lebar = Double.parseDouble(editLebarPP.getText().toString());
        luasPP = panjang * lebar;

        textLuasPP.setText(String.valueOf(luasPP));

    }


}

