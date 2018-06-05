package com.progmob.b.jhonarendra.belajargeometri2;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Jhonarendra on 6/2/2018.
 */

public class KalkulatorLingkaran extends AppCompatActivity {

    EditText editJariJari;
    TextView textKllLingkaran;
    TextView textLuasLingkaran;

    Double jariJari;
    Double kllLingkaran;
    Double luasLingkaran;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_lingkaran);

        editJariJari = (EditText)findViewById(R.id.editJariLingkaran);
        textKllLingkaran = (TextView)findViewById(R.id.text_kll_lingkaran);
        textLuasLingkaran = (TextView)findViewById(R.id.text_luas_lingkaran);

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
    public void HitungKllLingkaran(View view){
        jariJari = Double.parseDouble(editJariJari.getText().toString());
        kllLingkaran = 2* 3.14 * jariJari;

        textKllLingkaran.setText(String.valueOf(kllLingkaran));
    }
    public void HitungLuasLingkaran(View view){
        jariJari = Double.parseDouble(editJariJari.getText().toString());
        luasLingkaran = 3.14 * jariJari * jariJari;

        textLuasLingkaran.setText(String.valueOf(luasLingkaran));
    }
}
