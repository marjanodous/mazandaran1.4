package com.example.mazandaran;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.mazandaran.adapter.AdapterMusic;
import com.example.mazandaran.model.Music;

import java.util.ArrayList;

public class ahang extends Fragment {

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    ArrayList<Music> musicList;
    AdapterMusic adapterMusic;

    public ahang() {
        /*empty*/
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_ahang, null);

        recyclerView = rootView.findViewById(R.id.recycler_view_soalat);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        setMusic();
        setupRecyclerAdapter(musicList);


        return rootView;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    /*method to set items array*/
    public void setMusic() {
        musicList = new ArrayList<>();
        musicList.add(new Music("موسیقی محلی اول"));
        musicList.add(new Music("موسیقی محلی دوم"));
        musicList.add(new Music(" موسیقی محلی سوم"));
        musicList.add(new Music("موسیقی محلی چهارم"));
    }

    /*method get array parametr and set from RecyclerAdapter*/
    private void setupRecyclerAdapter(ArrayList<Music> list) {
        adapterMusic = new AdapterMusic(getActivity(), list);
        linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setAdapter(adapterMusic);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    @Override
    public void onResume() {
        super.onResume();
//        Toast.makeText(getActivity(), "test  : ", Toast.LENGTH_LONG).show();

    }
}
