package com.example.mazandaran;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.mazandaran.adapter.AdapterSearch;

public class marasem extends Fragment {

    ScrollView scrollView;
    TextView marasem0, marasem1, marasem2, marasem3, marasem4, marasem5;

    public marasem() {
        /*empty*/
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_marasem, null);
        scrollView = rootView.findViewById(R.id.scrollmarasem);
        marasem0 = rootView.findViewById(R.id.title0);
        marasem1 = rootView.findViewById(R.id.title1);
        marasem2 = rootView.findViewById(R.id.title2);
        marasem3 = rootView.findViewById(R.id.title3);
        marasem4 = rootView.findViewById(R.id.title4);
        marasem5 = rootView.findViewById(R.id.title5);
        scrollView.post(new Runnable() {
            @Override
            public void run() {
                if (AdapterSearch.marasem6) {
                    scrollView.scrollTo(0, 0);
                    AdapterSearch.marasem6 = false;
                } else if (AdapterSearch.marasem0) {
                    scrollView.scrollTo(0, marasem0.getTop());
                    AdapterSearch.marasem0 = false;
                } else if (AdapterSearch.marasem1) {
                    scrollView.scrollTo(0, marasem1.getTop());
                    AdapterSearch.marasem1 = false;
                } else if (AdapterSearch.marasem2) {
                    scrollView.scrollTo(0, marasem2.getTop());
                    AdapterSearch.marasem2 = false;
                } else if (AdapterSearch.marasem3) {
                    scrollView.scrollTo(0, marasem3.getTop());
                    AdapterSearch.marasem3 = false;
                } else if (AdapterSearch.marasem4) {
                    scrollView.scrollTo(0, marasem4.getTop());
                    AdapterSearch.marasem4 = false;
                } else if (AdapterSearch.marasem5) {
                    scrollView.scrollTo(0, marasem5.getTop());
                    AdapterSearch.marasem5 = false;
                }
            }
        });
        return rootView;
    }
    @Override
    public void onResume() {
        super.onResume();
        scrollView.post(new Runnable() {
            @Override
            public void run() {
                if (AdapterSearch.marasem6) {
                    scrollView.scrollTo(0, 0);
                    AdapterSearch.marasem6 = false;
                } else if (AdapterSearch.marasem0) {
                    scrollView.scrollTo(0, marasem0.getTop());
                    AdapterSearch.marasem0 = false;
                } else if (AdapterSearch.marasem1) {
                    scrollView.scrollTo(0, marasem1.getTop());
                    AdapterSearch.marasem1 = false;
                } else if (AdapterSearch.marasem2) {
                    scrollView.scrollTo(0, marasem2.getTop());
                    AdapterSearch.marasem2 = false;
                } else if (AdapterSearch.marasem3) {
                    scrollView.scrollTo(0, marasem3.getTop());
                    AdapterSearch.marasem3 = false;
                } else if (AdapterSearch.marasem4) {
                    scrollView.scrollTo(0, marasem4.getTop());
                    AdapterSearch.marasem4 = false;
                } else if (AdapterSearch.marasem5) {
                    scrollView.scrollTo(0, marasem5.getTop());
                    AdapterSearch.marasem5 = false;
                }
            }
        });
    }
}
