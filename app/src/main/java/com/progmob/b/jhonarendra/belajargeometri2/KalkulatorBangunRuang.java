package com.progmob.b.jhonarendra.belajargeometri2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Jhonarendra on 6/1/2018.
 */

public class KalkulatorBangunRuang extends AppCompatActivity {
    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();

        final String namaBangunRuang = intent.getExtras().getString("namaBangunRuang");
        final String descBangunRuang = intent.getExtras().getString("descBangunRuang");
        final int whiteThumbBangunRuang = intent.getExtras().getInt("whiteThumbBangunRuang");
        final String luasBangunRuang = intent.getExtras().getString("luasBangunRuang");
        final String volumeBangunRuang = intent.getExtras().getString("volumeBangunRuang");
        final int rumusBangunRuang = intent.getExtras().getInt("rumusBangunRuang");

        switch (namaBangunRuang){
            case "Kubus":
                Intent i1 = new Intent(getApplicationContext(), KalkulatorKubus.class);

                i1.putExtra("namaBangunRuang", namaBangunRuang);
                i1.putExtra("descBangunRuang", descBangunRuang);
                i1.putExtra("whiteThumbBangunRuang", whiteThumbBangunRuang);
                i1.putExtra("luasBangunRuang", luasBangunRuang);
                i1.putExtra("volumeBangunRuang", volumeBangunRuang);
                i1.putExtra("rumusBangunRuang", rumusBangunRuang);

                startActivity(i1);
                break;
            case "Balok":
                Intent i2 = new Intent(getApplicationContext(), KalkulatorBalok.class);

                i2.putExtra("namaBangunRuang", namaBangunRuang);
                i2.putExtra("descBangunRuang", descBangunRuang);
                i2.putExtra("whiteThumbBangunRuang", whiteThumbBangunRuang);
                i2.putExtra("luasBangunRuang", luasBangunRuang);
                i2.putExtra("volumeBangunRuang", volumeBangunRuang);
                i2.putExtra("rumusBangunRuang", rumusBangunRuang);

                startActivity(i2);
                break;
            case "Kerucut":
                Intent i3 = new Intent(getApplicationContext(), KalkulatorKerucut.class);

                i3.putExtra("namaBangunRuang", namaBangunRuang);
                i3.putExtra("descBangunRuang", descBangunRuang);
                i3.putExtra("whiteThumbBangunRuang", whiteThumbBangunRuang);
                i3.putExtra("luasBangunRuang", luasBangunRuang);
                i3.putExtra("volumeBangunRuang", volumeBangunRuang);
                i3.putExtra("rumusBangunRuang", rumusBangunRuang);

                startActivity(i3);
                break;
            case "Limas Segiempat":
                Intent i4 = new Intent(getApplicationContext(), KalkulatorLimasSegiempat.class);

                i4.putExtra("namaBangunRuang", namaBangunRuang);
                i4.putExtra("descBangunRuang", descBangunRuang);
                i4.putExtra("whiteThumbBangunRuang", whiteThumbBangunRuang);
                i4.putExtra("luasBangunRuang", luasBangunRuang);
                i4.putExtra("volumeBangunRuang", volumeBangunRuang);
                i4.putExtra("rumusBangunRuang", rumusBangunRuang);

                startActivity(i4);
                break;
            case "Limas Segitiga":
                Intent i5 = new Intent(getApplicationContext(), KalkulatorLimasSegitiga.class);

                i5.putExtra("namaBangunRuang", namaBangunRuang);
                i5.putExtra("descBangunRuang", descBangunRuang);
                i5.putExtra("whiteThumbBangunRuang", whiteThumbBangunRuang);
                i5.putExtra("luasBangunRuang", luasBangunRuang);
                i5.putExtra("volumeBangunRuang", volumeBangunRuang);
                i5.putExtra("rumusBangunRuang", rumusBangunRuang);

                startActivity(i5);
                break;
            case "Bola":
                Intent i6 = new Intent(getApplicationContext(), KalkulatorBola.class);

                i6.putExtra("namaBangunRuang", namaBangunRuang);
                i6.putExtra("descBangunRuang", descBangunRuang);
                i6.putExtra("whiteThumbBangunRuang", whiteThumbBangunRuang);
                i6.putExtra("luasBangunRuang", luasBangunRuang);
                i6.putExtra("volumeBangunRuang", volumeBangunRuang);
                i6.putExtra("rumusBangunRuang", rumusBangunRuang);

                startActivity(i6);
                break;
            case "Prisma Segitiga":
                Intent i7 = new Intent(getApplicationContext(), KalkulatorPrisma.class);

                i7.putExtra("namaBangunRuang", namaBangunRuang);
                i7.putExtra("descBangunRuang", descBangunRuang);
                i7.putExtra("whiteThumbBangunRuang", whiteThumbBangunRuang);
                i7.putExtra("luasBangunRuang", luasBangunRuang);
                i7.putExtra("volumeBangunRuang", volumeBangunRuang);
                i7.putExtra("rumusBangunRuang", rumusBangunRuang);

                startActivity(i7);
                break;
            case "Tabung":
                Intent i8 = new Intent(getApplicationContext(), KalkulatorTabung.class);

                i8.putExtra("namaBangunRuang", namaBangunRuang);
                i8.putExtra("descBangunRuang", descBangunRuang);
                i8.putExtra("whiteThumbBangunRuang", whiteThumbBangunRuang);
                i8.putExtra("luasBangunRuang", luasBangunRuang);
                i8.putExtra("volumeBangunRuang", volumeBangunRuang);
                i8.putExtra("rumusBangunRuang", rumusBangunRuang);

                startActivity(i8);
                break;
            default:
                setContentView(R.layout.activity_main);
        }
    }
}