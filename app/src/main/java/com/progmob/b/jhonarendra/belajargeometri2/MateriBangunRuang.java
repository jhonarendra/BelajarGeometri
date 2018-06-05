package com.progmob.b.jhonarendra.belajargeometri2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Jhonarendra on 6/2/2018.
 */

public class MateriBangunRuang extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_bangun_ruang);

        Intent intent = getIntent();
        final String namaBangunRuang = intent.getExtras().getString("namaBangunRuang");
        final String descBangunRuang = intent.getExtras().getString("descBangunRuang");
        final int whiteThumbBangunRuang = intent.getExtras().getInt("whiteThumbBangunRuang");
        final String luasBangunRuang = intent.getExtras().getString("luasBangunRuang");
        final String volumeBangunRuang = intent.getExtras().getString("volumeBangunRuang");
        final int imageRumusBangunRuang = intent.getExtras().getInt("rumusBangunRuang");

        TextView namaMateriBangunRuang = (TextView)findViewById(R.id.namaMateriBangunRuang);
        ImageView thumbMateriBangunRuang = (ImageView)findViewById(R.id.imageMateriBangunRuang);
        TextView descMateriBangunRuang = (TextView)findViewById(R.id.descBangunRuang);
        TextView materiLuasBangunRuang = (TextView)findViewById(R.id.textLuasBangunRuang);
        TextView materiVolumeBangunRuang = (TextView)findViewById(R.id.textVolumeBangunRuang);
        ImageView materiImageRumusBangunRuang = (ImageView)findViewById(R.id.imageRumusBangunRuang);

        namaMateriBangunRuang.setText(namaBangunRuang);
        thumbMateriBangunRuang.setImageResource(whiteThumbBangunRuang);
        descMateriBangunRuang.setText(descBangunRuang);
        materiVolumeBangunRuang.setText(volumeBangunRuang);
        materiLuasBangunRuang.setText(luasBangunRuang);
        materiImageRumusBangunRuang.setImageResource(imageRumusBangunRuang);

        FloatingActionButton fabback = findViewById(R.id.fabBack);
        fabback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BangunRuang.class);
                startActivity(intent);
            }
        });
        FloatingActionButton fabcalc = findViewById(R.id.fabKalkulator);
        fabcalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KalkulatorBangunRuang.class);

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
}


