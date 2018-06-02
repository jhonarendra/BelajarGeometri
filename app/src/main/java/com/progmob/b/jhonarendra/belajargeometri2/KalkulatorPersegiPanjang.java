package com.progmob.b.jhonarendra.belajargeometri2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Jhonarendra on 6/2/2018.
 */

public class KalkulatorPersegiPanjang extends AppCompatActivity {

    EditText editPanjang;
    EditText editLebar;
    TextView textKll;
    TextView textLuas;
    Button btnMateri;

    Double panjang;
    Double lebar;
    Double kll;
    Double luas;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_persegi_panjang);

        editPanjang = (EditText)findViewById(R.id.editPanjang);
        editLebar = (EditText)findViewById(R.id.editLebar);
        textKll = (TextView)findViewById(R.id.text_kll_persegi_panjang);
        textLuas = (TextView)findViewById(R.id.text_luas_persegi_panjang);

        btnMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    public void HitungKllPersegiPanjang(View view){
        panjang = Double.parseDouble(editPanjang.getText().toString());
        lebar = Double.parseDouble(editLebar.getText().toString());
        kll = 2 * panjang + lebar;

        textKll.setText(String.valueOf(kll));

    }
    public void HitungLuasPersegiPanjang(View view){
        panjang = Double.parseDouble(editPanjang.getText().toString());
        lebar = Double.parseDouble(editLebar.getText().toString());
        luas = panjang * lebar;

        textLuas.setText(String.valueOf(luas));

    }
}
