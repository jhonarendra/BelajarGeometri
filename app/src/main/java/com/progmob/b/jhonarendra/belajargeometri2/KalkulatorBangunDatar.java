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
        final String namaBangunDatar = intent.getExtras().getString("namaBangunDatar");
        final String descBangunDatar = intent.getExtras().getString("descBangunDatar");
        final int whiteThumbBangunDatar = intent.getExtras().getInt("whiteThumbBangunDatar");
        final String luasBangunDatar = intent.getExtras().getString("luasBangunDatar");
        final String kelilingBangunDatar = intent.getExtras().getString("kelilingBangunDatar");
        final int imageRumusBangunDatar = intent.getExtras().getInt("rumusBangunDatar");

        switch (namaBangunDatar){
            case "Persegi":
                Intent i1 = new Intent(getApplicationContext(), KalkulatorPersegi.class);

                i1.putExtra("namaBangunDatar", namaBangunDatar);
                i1.putExtra("whiteThumbBangunDatar", whiteThumbBangunDatar);
                i1.putExtra("descBangunDatar", descBangunDatar);
                i1.putExtra("kelilingBangunDatar", kelilingBangunDatar);
                i1.putExtra("luasBangunDatar", luasBangunDatar);
                i1.putExtra("rumusBangunDatar", imageRumusBangunDatar);

                startActivity(i1);
                break;
            case "Persegi Panjang":
                Intent i2 = new Intent(getApplicationContext(), KalkulatorPersegiPanjang.class);

                i2.putExtra("namaBangunDatar", namaBangunDatar);
                i2.putExtra("whiteThumbBangunDatar", whiteThumbBangunDatar);
                i2.putExtra("descBangunDatar", descBangunDatar);
                i2.putExtra("kelilingBangunDatar", kelilingBangunDatar);
                i2.putExtra("luasBangunDatar", luasBangunDatar);
                i2.putExtra("rumusBangunDatar", imageRumusBangunDatar);

                startActivity(i2);
                break;
            case "Lingkaran":
                Intent i3 = new Intent(getApplicationContext(), KalkulatorLingkaran.class);

                i3.putExtra("namaBangunDatar", namaBangunDatar);
                i3.putExtra("whiteThumbBangunDatar", whiteThumbBangunDatar);
                i3.putExtra("descBangunDatar", descBangunDatar);
                i3.putExtra("kelilingBangunDatar", kelilingBangunDatar);
                i3.putExtra("luasBangunDatar", luasBangunDatar);
                i3.putExtra("rumusBangunDatar", imageRumusBangunDatar);

                startActivity(i3);
                break;
            case "Segitiga Sama Sisi":
                Intent i4 = new Intent(getApplicationContext(), KalkulatorSegitigaSamaSisi.class);

                i4.putExtra("namaBangunDatar", namaBangunDatar);
                i4.putExtra("whiteThumbBangunDatar", whiteThumbBangunDatar);
                i4.putExtra("descBangunDatar", descBangunDatar);
                i4.putExtra("kelilingBangunDatar", kelilingBangunDatar);
                i4.putExtra("luasBangunDatar", luasBangunDatar);
                i4.putExtra("rumusBangunDatar", imageRumusBangunDatar);

                startActivity(i4);
                break;
            case "Segitiga Sama Kaki":
                Intent i5 = new Intent(getApplicationContext(), KalkulatorSegitigaSamaKaki.class);

                i5.putExtra("namaBangunDatar", namaBangunDatar);
                i5.putExtra("whiteThumbBangunDatar", whiteThumbBangunDatar);
                i5.putExtra("descBangunDatar", descBangunDatar);
                i5.putExtra("kelilingBangunDatar", kelilingBangunDatar);
                i5.putExtra("luasBangunDatar", luasBangunDatar);
                i5.putExtra("rumusBangunDatar", imageRumusBangunDatar);

                startActivity(i5);
                break;
            case "Segitiga Siku Siku":
                Intent i6 = new Intent(getApplicationContext(), KalkulatorSegitigaSikuSiku.class);

                i6.putExtra("namaBangunDatar", namaBangunDatar);
                i6.putExtra("whiteThumbBangunDatar", whiteThumbBangunDatar);
                i6.putExtra("descBangunDatar", descBangunDatar);
                i6.putExtra("kelilingBangunDatar", kelilingBangunDatar);
                i6.putExtra("luasBangunDatar", luasBangunDatar);
                i6.putExtra("rumusBangunDatar", imageRumusBangunDatar);

                startActivity(i6);
                break;
            case "Belah Ketupat":
                Intent i7 = new Intent(getApplicationContext(), KalkulatorBelahKetupat.class);

                i7.putExtra("namaBangunDatar", namaBangunDatar);
                i7.putExtra("whiteThumbBangunDatar", whiteThumbBangunDatar);
                i7.putExtra("descBangunDatar", descBangunDatar);
                i7.putExtra("kelilingBangunDatar", kelilingBangunDatar);
                i7.putExtra("luasBangunDatar", luasBangunDatar);
                i7.putExtra("rumusBangunDatar", imageRumusBangunDatar);

                startActivity(i7);
                break;
            case "Layang Layang":
                Intent i8 = new Intent(getApplicationContext(), KalkulatorLayangLayang.class);

                i8.putExtra("namaBangunDatar", namaBangunDatar);
                i8.putExtra("whiteThumbBangunDatar", whiteThumbBangunDatar);
                i8.putExtra("descBangunDatar", descBangunDatar);
                i8.putExtra("kelilingBangunDatar", kelilingBangunDatar);
                i8.putExtra("luasBangunDatar", luasBangunDatar);
                i8.putExtra("rumusBangunDatar", imageRumusBangunDatar);

                startActivity(i8);
                break;
            case "Trapesium":
                Intent i9 = new Intent(getApplicationContext(), KalkulatorTrapesium.class);

                i9.putExtra("namaBangunDatar", namaBangunDatar);
                i9.putExtra("whiteThumbBangunDatar", whiteThumbBangunDatar);
                i9.putExtra("descBangunDatar", descBangunDatar);
                i9.putExtra("kelilingBangunDatar", kelilingBangunDatar);
                i9.putExtra("luasBangunDatar", luasBangunDatar);
                i9.putExtra("rumusBangunDatar", imageRumusBangunDatar);

                startActivity(i9);
                break;
            default:
                finish();
        }
    }
}