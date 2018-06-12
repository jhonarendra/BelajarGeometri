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
 * Created by Jhonarendra on 6/2/2018.
 */

public class BangunRuang extends AppCompatActivity {
    RecyclerView recyclerView;
    BangunRuangAdapter bangunRuangAdapter;
    List<BangunRuangItem> bangunRuangItemList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangun_ruang);

        bangunRuangItemList = new ArrayList<>();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerViewRuang);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        bangunRuangItemList.add(new BangunRuangItem(
                "Kubus",
                "Kubus adalah bangun ruang yang memiliki 12 rusuk sama panjang dan 6 bidang. Rusuk pada kubus di simbolkan \"s\" atau sisi.",
                R.drawable.kubus,
                R.drawable.white_kubus,
                "6 x R x R",
                "R x R x R",
                R.drawable.rumus_kubus
        ));
        bangunRuangItemList.add(new BangunRuangItem(
                "Balok",
                "Balok merupakan bangun ruang yang memiliki 12 rusuk dan 6 bidang. Rusuk pada balok yaitu panjang (p), lebar (l), dan tinggi (t).",
                R.drawable.balok,
                R.drawable.white_balok,
                "2 x (p x l) + 2 x (p x t) + 2 x (t x l)",
                "p x l x t",
                R.drawable.rumus_balok
        ));
        bangunRuangItemList.add(new BangunRuangItem(
                "Kerucut",
                "Kerucut merupakan bangun ruang yang memiliki alas berbentuk lingkaran dan mengerucut keatas dengan tinggi tertentu.",
                R.drawable.kerucut,
                R.drawable.white_kerucut,
                "(phi x r x r) + (phi x r x s)",
                "(phi x r x r x t) / 3",
                R.drawable.rumus_kerucut
        ));
        bangunRuangItemList.add(new BangunRuangItem(
                "Limas Segiempat",
                "Limas segiempat merupakan bangun ruang seperti \"piramida\" yang memiliki alas berbentuk segiempat dengan bidang samping berupa segitiga.",
                R.drawable.limassegiempat,
                R.drawable.white_limassegiempat,
                "(s x s) + 2 x (s x t)",
                "(s x s x t) / 3",
                R.drawable.rumus_limassegiempat
        ));
        bangunRuangItemList.add(new BangunRuangItem(
                "Limas Segitiga",
                "Limas segitiga merupakan bangun ruang yang yang memiliki semua sisi berbentuk segitiga.",
                R.drawable.limassegitiga,
                R.drawable.white_limassegitiga,
                "(a x t)/2 + 3x(a x T)/2",
                "T * (a x t)/2) / 3",
                R.drawable.rumus_limassegitiga
        ));
        bangunRuangItemList.add(new BangunRuangItem(
                "Bola",
                "Bola adalah bangun ruang dengan bentuk lingkaran sempurna yang melengkung menyelimuti semua sisi sehingga berbentuk bola.",
                R.drawable.bola,
                R.drawable.white_bola,
                "4 x phi x r x r",
                "(4 x phi x r x r x r) / 3",
                R.drawable.rumus_bola
        ));
        bangunRuangItemList.add(new BangunRuangItem(
                "Prisma Segitiga",
                "Prisma segitiga merupakan bangun ruang yang memiliki 5 bidang dengan 2 bidang segitiga dan 3 bidang segiempat.",
                R.drawable.prisma,
                R.drawable.white_prisma,
                "(3 x p x l) + (l x t)",
                "(p x l x t)/ 2",
                R.drawable.rumus_prisma
        ));
        bangunRuangItemList.add(new BangunRuangItem(
                "Tabung",
                "Tabung adalah bangun ruang yang memiliki alas dan atap berbentuk lingkaran yang seukuran, dengan sisi segiempat yang menyelimuti kedua bidang.",
                R.drawable.tabung,
                R.drawable.white_tabung,
                "2 x phi x r x T + 2 x phi x r x r",
                "phi x r x r x T",
                R.drawable.rumus_tabung
        ));

        bangunRuangAdapter = new BangunRuangAdapter(this, bangunRuangItemList);
        recyclerView.setAdapter(bangunRuangAdapter);

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
