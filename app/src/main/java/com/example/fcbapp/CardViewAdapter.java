package com.example.fcbapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.CardViewViewHolder> {


    private ArrayList<Player> listPlayer;

    public CardViewAdapter(ArrayList<Player> list){

        this.listPlayer = list;

    }


    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_player, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {
        Player player = listPlayer.get(position);
        final int itemPosition = holder.getAdapterPosition();

        final String itemName = player.getName();
        final String itemDetail = player.getDetail();
        final int itemPhoto = player.getPhoto();

        Glide.with(holder.itemView.getContext())
                .load(player.getPhoto())
                .apply(new RequestOptions().override(350, 450))
                .into(holder.imgPhoto);

       holder.plName.setText(player.getName());
       holder.plDetail.setText(player.getDetail());

        holder.btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intent to detail page
                Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                Bundle b = new Bundle();

                String textName = itemName;
                String textDetail = itemDetail;
                int playerPhoto = itemPhoto;

                intent.putExtra("text", textName);
                intent.putExtra("detail", textDetail);
                b.putInt("photo", playerPhoto);
                intent.putExtra("position", itemPosition);
                intent.putExtras(b);

                holder.itemView.getContext().startActivity(intent);
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
//                onItemClickCallback.onItemClicked(listPlayer.get(holder.getAdapterPosition()));
//                Toast.makeText(holder.itemView.getContext(), "You choose " + listPlayer.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                Bundle b = new Bundle();

                String textName = itemName;
                String textDetail = itemDetail;
                int playerPhoto = itemPhoto;

                intent.putExtra("text", textName);
                intent.putExtra("detail", textDetail);
                b.putInt("photo", playerPhoto);
                intent.putExtra("position", itemPosition);
                intent.putExtras(b);

                holder.itemView.getContext().startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return listPlayer.size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView plName, plDetail;
        Button btnDetail;

        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            plName = itemView.findViewById(R.id.tv_item_name);
            plDetail = itemView.findViewById(R.id.tv_item_detail);
            btnDetail = itemView.findViewById(R.id.btnDetail);
        }
    }

}
