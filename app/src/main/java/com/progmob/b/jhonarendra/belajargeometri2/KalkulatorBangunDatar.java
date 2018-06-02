package com.progmob.b.jhonarendra.belajargeometri2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Jhonarendra on 6/1/2018.
 */

public class KalkulatorBangunDatar extends AppCompatActivity {
    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String namaBangunDatar = intent.getExtras().getString("namaBangunDatar");

//        if(namaBangunDatar.equals("Persegi")){
//                Intent i1 = new Intent(getApplicationContext(), KalkulatorPersegi.class);
//                startActivity(i1);
//
//        } else if (namaBangunDatar.equals("Persegi Panjang")){
//                Intent i2 = new Intent(getApplicationContext(), KalkulatorPersegiPanjang.class);
//                startActivity(i2);
//
//        } else {
//            finish();
//        }


        switch (namaBangunDatar){
            case "Persegi":
                Intent i1 = new Intent(getApplicationContext(), KalkulatorPersegi.class);
                startActivity(i1);
                break;
            case "Persegi Panjang":
                Intent i2 = new Intent(getApplicationContext(), KalkulatorPersegiPanjang.class);
                startActivity(i2);
                break;
//            case "Lingkaran":
//                Intent i3 = new Intent(getApplicationContext(), KalkulatorLingkaran.class);
//                startActivity(i3);
//                break;
//            case "Segitiga Sama Sisi":
//                Intent i4 = new Intent(getApplicationContext(), KalkulatorSegitigaSamaSisi.class);
//                startActivity(i4);
//                break;
//            case "Segitiga Sama Kaki":
//                Intent i5 = new Intent(getApplicationContext(), KalkulatorSegitigaSamaKaki.class);
//                startActivity(i5);
//                break;
//            case "Segitiga Siku Siku":
//                Intent i6 = new Intent(getApplicationContext(), KalkulatorSegitigaSikuSiku.class);
//                startActivity(i6);
//                break;
//            case "Belah Ketupat":
//                Intent i7 = new Intent(getApplicationContext(), KalkulatorBelahKetupat.class);
//                startActivity(i7);
//                break;
//            case "Layang Layang":
//                Intent i8 = new Intent(getApplicationContext(), KalkulatorLayangLayang.class);
//                startActivity(i8);
//                break;
//            case "Trapesium":
//                Intent i9 = new Intent(getApplicationContext(), KalkulatorTrapesium.class);
//                startActivity(i9);
//                break;
            default:
                finish();
        }
    }
}