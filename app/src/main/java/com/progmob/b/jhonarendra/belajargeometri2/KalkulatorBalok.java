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

public class KalkulatorBalok extends AppCompatActivity {

    EditText editPanjangBalok;
    EditText editLebarBalok;
    EditText editTinggiBalok;
    TextView textVolumeBalok;
    TextView textLuasBalok;

    Double panjang, lebar, tinggi, volumeBalok, luasBalok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_balok);

        editPanjangBalok = (EditText) findViewById(R.id.editPanjangBalok);
        editLebarBalok = (EditText) findViewById(R.id.editLebarBalok);
        editTinggiBalok = (EditText) findViewById(R.id.editTinggiBalok);
        textVolumeBalok = (TextView) findViewById(R.id.text_volume_balok);
        textLuasBalok = (TextView) findViewById(R.id.text_luas_balok);

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

    public void HitungVolumeBalok(View view){
        panjang = Double.parseDouble(editPanjangBalok.getText().toString());
        lebar = Double.parseDouble(editLebarBalok.getText().toString());
        tinggi = Double.parseDouble(editTinggiBalok.getText().toString());
        volumeBalok = panjang * lebar * tinggi;

        textVolumeBalok.setText(String.valueOf(volumeBalok));

    }
    public void HitungLuasBalok(View view){
        panjang = Double.parseDouble(editPanjangBalok.getText().toString());
        lebar = Double.parseDouble(editLebarBalok.getText().toString());
        tinggi = Double.parseDouble(editTinggiBalok.getText().toString());
        luasBalok = 2*(panjang*lebar)+2*(panjang*tinggi)+2*(tinggi*lebar);

        textLuasBalok.setText(String.valueOf(luasBalok));

    }


}

