package com.progmob.b.jhonarendra.belajargeometri2;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


/**
 * Created by Jhonarendra on 6/1/2018.
 */

public class BangunDatarAdapter extends RecyclerView.Adapter<BangunDatarAdapter.BangunDatarViewHolder> {

    private Context mCtx;
    private List<BangunDatarItem> bangunDatarList;

    public BangunDatarAdapter(Context mCtx, List<BangunDatarItem> bangunDatarList){
        this.mCtx = mCtx;
        this.bangunDatarList = bangunDatarList;
    }

    @Override
    public BangunDatarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.item_bangun_datar, null);
        return new BangunDatarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BangunDatarViewHolder holder, final int position){
        final BangunDatarItem bangunDatarItem = bangunDatarList.get(position);

        holder.textViewBangunDatar.setText(bangunDatarItem.getNamaBangunDatar());
        holder.imageBangunDatar.setImageResource(bangunDatarItem.getThumbBangunDatar());

        holder.cardViewBangunDatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mCtx, MateriBangunDatar.class);
                intent.putExtra("namaBangunDatar", bangunDatarList.get(position).getNamaBangunDatar());
                intent.putExtra("thumbBangunDatar", bangunDatarList.get(position).getThumbBangunDatar());
                intent.putExtra("whiteThumbBangunDatar", bangunDatarList.get(position).getWhiteThumbBangunDatar());
                intent.putExtra("descBangunDatar", bangunDatarList.get(position).getDescBangunDatar());
                intent.putExtra("kelilingBangunDatar", bangunDatarList.get(position).getKelilingBangunDatar());
                intent.putExtra("luasBangunDatar", bangunDatarList.get(position).getLuasBangunDatar());

                mCtx.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount(){
        return bangunDatarList.size();
    }


    class BangunDatarViewHolder extends RecyclerView.ViewHolder{

        TextView textViewBangunDatar;
        ImageView imageBangunDatar;
        CardView cardViewBangunDatar;

        public BangunDatarViewHolder(View itemView) {
            super(itemView);

            textViewBangunDatar = itemView.findViewById(R.id.textViewBangunDatar);
            imageBangunDatar = itemView.findViewById(R.id.imageBangunDatar);
            cardViewBangunDatar = itemView.findViewById(R.id.cardViewBangunDatar);
        }

    }
}
