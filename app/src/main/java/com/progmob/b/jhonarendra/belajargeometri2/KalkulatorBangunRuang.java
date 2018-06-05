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
        final int imageRumusBangunRuang = intent.getExtras().getInt("rumusBangunRuang");

        switch (namaBangunRuang){
            case "Kubus":
                Intent i1 = new Intent(getApplicationContext(), KalkulatorKubus.class);

                i1.putExtra("namaBangunRuang", namaBangunRuang);
                i1.putExtra("descBangunRuang", descBangunRuang);
                i1.putExtra("whiteThumbBangunRuang", whiteThumbBangunRuang);
                i1.putExtra("luasBangunRuang", luasBangunRuang);
                i1.putExtra("volumeBangunRuang", volumeBangunRuang);
                i1.putExtra("imageRumusBangunRuang", imageRumusBangunRuang);

                startActivity(i1);
                break;
            default:
                setContentView(R.layout.activity_main);
        }
    }
}