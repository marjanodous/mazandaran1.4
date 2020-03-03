package com.example.mazandaran.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.mazandaran.ActivityAhang;
import com.example.mazandaran.R;
import com.example.mazandaran.model.Music;

import java.util.ArrayList;

public class AdapterMusic extends RecyclerView.Adapter<AdapterMusic.MyViewHolder> {

    private Context context;
    private ArrayList<Music> arrayList;

    public AdapterMusic(Context context, ArrayList<Music> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    /*how to show xml*/
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_music, viewGroup, false);
        return new MyViewHolder(view);
    }

    /*how to set data to items*/
    @Override
    public void onBindViewHolder( MyViewHolder holder, final int position) {

        /*set data to objects items*/
        holder.txtMusic.setText(arrayList.get(position).getMusicName());

        /*click on item recycler*/
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*intent item datas to Activity */
                int pos=position;
                Intent intent = new Intent(context, ActivityAhang.class);
                intent.putExtra("music_name", arrayList.get(position).getMusicName());
                intent.putExtra("pos", pos);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    /*create and linked object with xml file*/
    public class MyViewHolder extends RecyclerView.ViewHolder {

        /*create object for xml*/
        TextView txtMusic;
        RelativeLayout layout;

        public MyViewHolder(View itemView) {
            super(itemView);

            /* Get object from xml file*/
            txtMusic = itemView.findViewById(R.id.aya_midanid);
            layout = itemView.findViewById(R.id.layoutmusic);
        }
    }
}