package com.progmob.b.jhonarendra.belajargeometri2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Jhonarendra on 6/2/2018.
 */

public class KalkulatorPersegi extends AppCompatActivity {

    EditText editSisiPersegi;
    TextView textKllPersegi;
    TextView textLuasPersegi;
    Button btnMateri;

    Double sisi;
    Double kllPersegi;
    Double luasPersegi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_persegi);

        editSisiPersegi = (EditText) findViewById(R.id.editsisipersegi);
        textKllPersegi = (TextView) findViewById(R.id.text_kll_persegi);
        textLuasPersegi = (TextView) findViewById(R.id.text_luas_persegi);
        btnMateri = (Button) findViewById(R.id.btnMateri);

        btnMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    public void HitungKllPersegi(View view){
        sisi = Double.parseDouble(editSisiPersegi.getText().toString());
        kllPersegi = sisi * 4;

        textKllPersegi.setText(String.valueOf(kllPersegi));

    }
    public void HitungLuasPersegi(View view){
        sisi = Double.parseDouble(editSisiPersegi.getText().toString());
        luasPersegi = sisi * sisi;

        textLuasPersegi.setText(String.valueOf(luasPersegi));

    }


}

