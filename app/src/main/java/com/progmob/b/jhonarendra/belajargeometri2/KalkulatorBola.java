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

public class KalkulatorBola extends AppCompatActivity {

    EditText editJariBola;
    TextView textLuasBola, textVolumeBola;

    Double jariBola, volume, luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_bola);

        editJariBola = (EditText) findViewById(R.id.editJariBola);
        textVolumeBola = (TextView) findViewById(R.id.text_volume_bola);
        textLuasBola = (TextView) findViewById(R.id.text_luas_bola);

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

    public void HitungVolumeBola(View view){
        jariBola = Double.parseDouble(editJariBola.getText().toString());
        volume = 4*(3.14*jariBola*jariBola*jariBola)/3;
        textVolumeBola.setText(String.valueOf(volume));
    }
    public void HitungLuasBola(View view){
        jariBola = Double.parseDouble(editJariBola.getText().toString());
        luas = 4*3.14*jariBola*jariBola;
        textLuasBola.setText(String.valueOf(luas));
    }
}

