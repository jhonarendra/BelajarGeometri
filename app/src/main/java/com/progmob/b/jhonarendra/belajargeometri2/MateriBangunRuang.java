package com.progmob.b.jhonarendra.belajargeometri2;

import android.content.Intent;
import android.os.Bundle;
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
        String descBangunRuang = intent.getExtras().getString("descBangunRuang");
        int thumbBangunRuang = intent.getExtras().getInt("whiteThumbBangunRuang");
        String luasBangunRuang = intent.getExtras().getString("luasBangunRuang");
        String volumeBangunRuang = intent.getExtras().getString("volumeBangunRuang");

        TextView namaMateriBangunRuang = (TextView)findViewById(R.id.namaMateriBangunRuang);
        ImageView thumbMateriBangunRuang = (ImageView)findViewById(R.id.imageMateriBangunRuang);
        TextView descMateriBangunRuang = (TextView)findViewById(R.id.descBangunRuang);
        TextView materiLuasBangunRuang = (TextView)findViewById(R.id.textLuasBangunRuang);
        TextView materiVolumeBangunRuang = (TextView)findViewById(R.id.textVolumeBangunRuang);
        Button btnKalkulator = (Button)findViewById(R.id.btnKalkulator);

        namaMateriBangunRuang.setText(namaBangunRuang);
        thumbMateriBangunRuang.setImageResource(thumbBangunRuang);
        descMateriBangunRuang.setText(descBangunRuang);
        materiVolumeBangunRuang.setText(volumeBangunRuang);
        materiLuasBangunRuang.setText(luasBangunRuang);

        btnKalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KalkulatorBangunRuang.class);
                intent.putExtra("namabangunruang", namaBangunRuang);

                startActivity(intent);
            }
        });
    }
}


