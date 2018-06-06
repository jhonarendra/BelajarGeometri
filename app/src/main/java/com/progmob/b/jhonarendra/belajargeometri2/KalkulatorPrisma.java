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

public class KalkulatorPrisma extends AppCompatActivity {

    EditText editPanjangPrisma, editLebarPrisma, editTinggiPrisma;
    TextView textLuasPrisma, textVolumePrisma;

    Double panjang,tinggi,lebar, volume, luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_prisma);

        editPanjangPrisma = (EditText) findViewById(R.id.editPanjangPrisma);
        editLebarPrisma = (EditText) findViewById(R.id.editLebarPrisma);
        editTinggiPrisma = (EditText) findViewById(R.id.editTinggiPrisma);
        textVolumePrisma = (TextView) findViewById(R.id.text_volume_prisma);
        textLuasPrisma = (TextView) findViewById(R.id.text_luas_prisma);

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

    public void HitungVolumePrisma(View view){
        panjang = Double.parseDouble(editPanjangPrisma.getText().toString());
        lebar = Double.parseDouble(editLebarPrisma.getText().toString());
        tinggi = Double.parseDouble(editTinggiPrisma.getText().toString());
        volume = (panjang*lebar*tinggi)/2;
        textVolumePrisma.setText(String.valueOf(volume));
    }
    public void HitungLuasPrisma(View view){
        panjang = Double.parseDouble(editPanjangPrisma.getText().toString());
        lebar = Double.parseDouble(editLebarPrisma.getText().toString());
        tinggi = Double.parseDouble(editTinggiPrisma.getText().toString());
        luas = (3*panjang*lebar)+(lebar*tinggi);
        textLuasPrisma.setText(String.valueOf(luas));
    }
}

