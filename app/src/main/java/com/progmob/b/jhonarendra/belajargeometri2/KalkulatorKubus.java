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

public class KalkulatorKubus extends AppCompatActivity {

    EditText editSisiKubus;
    TextView textVolumeKubus;
    TextView textLuasKubus;

    Double sisi;
    Double volumeKubus;
    Double luasKubus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_kubus);

        editSisiKubus = (EditText) findViewById(R.id.editsisikubus);
        textVolumeKubus = (TextView) findViewById(R.id.text_volume_kubus);
        textLuasKubus = (TextView) findViewById(R.id.text_luas_kubus);

        Intent intent = getIntent();

        final String namaBangunRuang = intent.getExtras().getString("namaBangunRuang");
        final String descBangunRuang = intent.getExtras().getString("descBangunRuang");
        final int whiteThumbBangunRuang = intent.getExtras().getInt("whiteThumbBangunRuang");
        final String luasBangunRuang = intent.getExtras().getString("luasBangunRuang");
        final String volumeBangunRuang = intent.getExtras().getString("volumeBangunRuang");
        final int imageRumusBangunRuang = intent.getExtras().getInt("rumusBangunRuang");

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
                intent.putExtra("imageRumusBangunRuang", imageRumusBangunRuang);

                startActivity(intent);
            }
        });

    }

    public void HitungVolumeKubus(View view){
        sisi = Double.parseDouble(editSisiKubus.getText().toString());
        volumeKubus = sisi * sisi * sisi;

        textVolumeKubus.setText(String.valueOf(volumeKubus));

    }
    public void HitungLuasKubus(View view){
        sisi = Double.parseDouble(editSisiKubus.getText().toString());
        luasKubus = 6 * sisi * sisi;

        textLuasKubus.setText(String.valueOf(luasKubus));

    }


}

