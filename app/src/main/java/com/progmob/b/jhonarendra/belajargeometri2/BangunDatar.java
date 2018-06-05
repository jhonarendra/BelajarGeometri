package com.progmob.b.jhonarendra.belajargeometri2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jhonarendra on 6/1/2018.
 */

public class BangunDatar extends AppCompatActivity {

    RecyclerView recyclerView;
    BangunDatarAdapter adapter;
    List<BangunDatarItem> bangunDatarList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangun_datar);

        bangunDatarList = new ArrayList<>();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));


        bangunDatarList.add(new BangunDatarItem(
                "Persegi",
                "Persegi adalah bangun datar yang dibangun dengan 4 sisi yang sama panjang. Sudut pada tiap titik selalu 90 derajat.",
                R.drawable.persegi,
                R.drawable.white_persegi,
                "4 x s",
                "s x s",
                R.drawable.rumus_persegi
        ));
        bangunDatarList.add(new BangunDatarItem(
                "Persegi Panjang",
                "Persegi panjang adalah bangun datar dengan 4 sisi yang tiap sisi memiliki sepasang sisi yang sama panjang yaitu panjang (p) dan lebar (l) yang posisinya sejajar.",
                R.drawable.persegipanjang,
                R.drawable.white_persegipanjang,
                "2 x (p + l)",
                "p x l",
                R.drawable.rumus_persegipanjang
        ));
        bangunDatarList.add(new BangunDatarItem(
                "Lingkaran",
                "Lingkaran adalah bangun datar yang hanya memiliki satu sisi yang melingkar dan bidang tengah dapat dihitung dengan jari-jari lingkaran atau diameter.",
                R.drawable.lingkaran,
                R.drawable.white_lingkaran,
                "2 x phi x r atau phi x d",
                "phi x r x r",
                R.drawable.rumus_lingkaran
        ));
        bangunDatarList.add(new BangunDatarItem(
                "Segitiga Sama Sisi",
                "Segitiga sama sisi adalah bangun datar yang memiliki 3 sisi yang sama panjang dan tiap titik sudut selalu membentuk 60 derajat.",
                R.drawable.segitigasamasisi,
                R.drawable.white_segitigasamasisi,
                "s1 + s2 + s3",
                "(a x t) / 2",
                R.drawable.rumus_segitigasamasisi
        ));
        bangunDatarList.add(new BangunDatarItem(
                "Segitiga Sama Kaki",
                "Segitiga sama kaki adalah bangun datar dengan 3 sisi yang 2 sisinya sama panjang dan 1 sisi berbeda yang menjadi alas segitiga.",
                R.drawable.segitigasamakaki,
                R.drawable.white_segitigasamakaki,
                "s1 + s2 + s3",
                "(a x t) / 2",
                R.drawable.rumus_segitigasamakaki
        ));
        bangunDatarList.add(new BangunDatarItem(
           "Segitiga Siku Siku",
                "Segitiga siku siku merupakan bangun datar yang pasti memiliki satu buah sudut siku siku atau 90 derajat dengan panjang sisi yang tidak teratur.",
                R.drawable.segitigasikusiku,
                R.drawable.white_segitigasikusiku,
                "s1 + s2 + s3",
                "(a x t) / 2",
                R.drawable.rumus_segitigasikusiku
        ));
        bangunDatarList.add(new BangunDatarItem(
                "Belah Ketupat",
                "Belah ketupat merupakan bangun datar yang memiliki 4 sisi yang sama panjang, tetapi sudut pada tiap titik tidak 90 derajat.",
                R.drawable.belahketupat,
                R.drawable.white_belahketupat,
                "s1 + s2 + s3 + s4",
                "(d1 x d2) / 2",
                R.drawable.rumus_belahketupat
        ));
        bangunDatarList.add(new BangunDatarItem(
                "Layang Layang",
                "Layang layang adalah bangun datar dengan 2 pasang sisi yang sama panjang yaitu 2 sisi pendek dan 2 sisi panjang.",
                R.drawable.layanglayang,
                R.drawable.white_layanglayang,
                "s1 + s2 + s3 + s4",
                "(d1 x d2) / 2",
                R.drawable.rumus_layanglayang
        ));
        bangunDatarList.add(new BangunDatarItem(
                "Trapesium",
                "Trapesium adalah bangun datar yang memiliki sepasang sisi sejajar dan sisi lainnya menghubungkan sisi sejajar.",
                R.drawable.trapesium,
                R.drawable.white_trapesium,
                "s1 + s2 + s3 + s4",
                "{(a + b) x t} / 2",
                R.drawable.rumus_trapesium
        ));


        adapter = new BangunDatarAdapter(this, bangunDatarList);
        recyclerView.setAdapter(adapter);

        FloatingActionButton fab = findViewById(R.id.fabBack);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent2);
            }
        });
    }
}
