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

public class KalkulatorLayangLayang extends AppCompatActivity {

    EditText editD1LayangLayang, editD2LayangLayang, editSisiPendekLayangLayang, editSisiPanjangLayangLayang;
    TextView textKllLayangLayang, textLuasLayangLayang;
    Double D1, D2, sisiPendek, sisiPanjang, kllLayangLayang, luasLayangLayang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_layanglayang);

        editD1LayangLayang = (EditText) findViewById(R.id.editD1LayangLayang);
        editD2LayangLayang = (EditText) findViewById(R.id.editD2LayangLayang);
        editSisiPendekLayangLayang = (EditText) findViewById(R.id.editSisiPendekLayangLayang);
        editSisiPanjangLayangLayang = (EditText) findViewById(R.id.editSisiPanjangLayangLayang);
        textKllLayangLayang = (TextView) findViewById(R.id.text_kll_layanglayang);
        textLuasLayangLayang = (TextView) findViewById(R.id.text_luas_layanglayang);

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
    public void HitungKllLayangLayang(View view){
        sisiPanjang = Double.parseDouble(editSisiPanjangLayangLayang.getText().toString());
        sisiPendek = Double.parseDouble(editSisiPendekLayangLayang.getText().toString());

        kllLayangLayang = 2 * (sisiPendek + sisiPanjang);
        textKllLayangLayang.setText(String.valueOf(kllLayangLayang));

    }
    public void HitungLuasLayangLayang(View view){
        D1 = Double.parseDouble(editD1LayangLayang.getText().toString());
        D2 = Double.parseDouble(editD2LayangLayang.getText().toString());

        luasLayangLayang = (D1 * D2) / 2;
        textLuasLayangLayang.setText(String.valueOf(luasLayangLayang));
    }
}

