package com.progmob.b.jhonarendra.belajargeometri2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;

/**
 * Created by Jhonarendra on 6/2/2018.
 */

public class KalkulatorTrapesium extends AppCompatActivity {
    EditText editATrapesium;
    EditText editBTrapesium;
    EditText editTinggiTrapesium;
    EditText editS1Trapesium;
    EditText editS2Trapesium;
    TextView textKllTrapesium, textLuasTrapesium;

    Double sisi1;
    Double sisi2;
    Double tinggi;
    Double sisiA;
    Double sisiB;
    Double kllTrapesium;
    Double luasTrapesium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_trapesium);

        editATrapesium = (EditText) findViewById(R.id.editATrapesium);
        editBTrapesium = (EditText) findViewById(R.id.editBTrapesium);
        editTinggiTrapesium = (EditText) findViewById(R.id.editTinggiTrapesium);
        editS1Trapesium = (EditText) findViewById(R.id.editS1Trapesium);
        editS2Trapesium = (EditText) findViewById(R.id.editS2Trapesium);
        textKllTrapesium = (TextView) findViewById(R.id.text_kll_belahketupat);
        textLuasTrapesium = (TextView) findViewById(R.id.text_luas_belahketupat);

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
    public void HitungKllTrapesium(View view){
        sisi1 = Double.parseDouble(editS1Trapesium.getText().toString());
        sisi2 = Double.parseDouble(editS2Trapesium.getText().toString());
        sisiA = Double.parseDouble(editATrapesium.getText().toString());
        sisiB = Double.parseDouble(editBTrapesium.getText().toString());
        kllTrapesium = sisi1 + sisi2 + sisiA + sisiB;
        textKllTrapesium.setText(String.valueOf(kllTrapesium));
    }
    public void HitungLuasTrapesium(View view){
        sisiA = Double.parseDouble(editATrapesium.getText().toString());
        sisiB = Double.parseDouble(editBTrapesium.getText().toString());
        tinggi = Double.parseDouble(editTinggiTrapesium.getText().toString());
        luasTrapesium = ((sisiA + sisiB)*tinggi)/2;
        textLuasTrapesium.setText(String.valueOf(luasTrapesium));
    }
}
