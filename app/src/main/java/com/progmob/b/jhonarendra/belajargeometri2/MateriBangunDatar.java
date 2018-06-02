package com.progmob.b.jhonarendra.belajargeometri2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Jhonarendra on 6/1/2018.
 */

public class MateriBangunDatar extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_bangun_datar);

        Intent intent = getIntent();
        final String namaBangunDatar = intent.getExtras().getString("namaBangunDatar");
        String descBangunDatar = intent.getExtras().getString("descBangunDatar");
        int thumbBangunDatar = intent.getExtras().getInt("whiteThumbBangunDatar");
        String luasBangunDatar = intent.getExtras().getString("luasBangunDatar");
        String kelilingBangunDatar = intent.getExtras().getString("kelilingBangunDatar");

        TextView namaMateriBangunDatar = (TextView)findViewById(R.id.namaMateriBangunDatar);
        ImageView thumbMateriBangunDatar = (ImageView)findViewById(R.id.imageMateriBangunDatar);
        TextView descMateriBangunDatar = (TextView)findViewById(R.id.descBangunDatar);
        TextView materiLuasBangunDatar = (TextView)findViewById(R.id.textLuasBangunDatar);
        TextView materiKelilingBangunDatar = (TextView)findViewById(R.id.textKelilingBangunDatar);
        Button btnKalkulator = (Button)findViewById(R.id.btnKalkulator);

        namaMateriBangunDatar.setText(namaBangunDatar);
        thumbMateriBangunDatar.setImageResource(thumbBangunDatar);
        descMateriBangunDatar.setText(descBangunDatar);
        materiKelilingBangunDatar.setText(kelilingBangunDatar);
        materiLuasBangunDatar.setText(luasBangunDatar);

        btnKalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KalkulatorBangunDatar.class);
                intent.putExtra("namaBangunDatar", namaBangunDatar);

                startActivity(intent);
            }
        });
    }
}
