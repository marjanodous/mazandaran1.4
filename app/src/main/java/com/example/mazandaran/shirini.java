package com.example.mazandaran;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.mazandaran.adapter.AdapterSearch;

public class shirini extends Fragment {

    ScrollView scrollView;
    TextView shirini1, shirini2, shirini3, shirini4, shirini5, shirini6;
    public shirini() {
        /*empty*/
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_shirini, null);
        scrollView = rootView.findViewById(R.id.scrollshirini);
        shirini1 = rootView.findViewById(R.id.shirini1);
        shirini2 = rootView.findViewById(R.id.shirini2);
        shirini3 = rootView.findViewById(R.id.shirini3);
        shirini4 = rootView.findViewById(R.id.shirini4);
        shirini5 = rootView.findViewById(R.id.shirini5);
        shirini6 = rootView.findViewById(R.id.shirini6);
        scrollView.post(new Runnable() {
            @Override
            public void run() {
                if (AdapterSearch.shirini0) {
                    scrollView.scrollTo(0, 0);
                    AdapterSearch.shirini0 = false;
                } else if (AdapterSearch.shirini1) {
                    scrollView.scrollTo(0, shirini1.getTop());
                    AdapterSearch.shirini1 = false;
                } else if (AdapterSearch.shirini2) {
                    scrollView.scrollTo(0, shirini2.getTop());
                    AdapterSearch.shirini2 = false;
                } else if (AdapterSearch.shirini3) {
                    scrollView.scrollTo(0, shirini3.getTop());
                    AdapterSearch.shirini3 = false;
                } else if (AdapterSearch.shirini4) {
                    scrollView.scrollTo(0, shirini4.getTop());
                    AdapterSearch.shirini4 = false;
                } else if (AdapterSearch.shirini5) {
                    scrollView.scrollTo(0, shirini5.getTop());
                    AdapterSearch.shirini5 = false;
                } else if (AdapterSearch.shirini6) {
                    scrollView.scrollTo(0, shirini6.getTop());
                    AdapterSearch.shirini6 = false;
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
                if (AdapterSearch.shirini0) {
                    scrollView.scrollTo(0, 0);
                    AdapterSearch.shirini0 = false;
                } else if (AdapterSearch.shirini1) {
                    scrollView.scrollTo(0, shirini1.getTop());
                    AdapterSearch.shirini1 = false;
                } else if (AdapterSearch.shirini2) {
                    scrollView.scrollTo(0, shirini2.getTop());
                    AdapterSearch.shirini2 = false;
                } else if (AdapterSearch.shirini3) {
                    scrollView.scrollTo(0, shirini3.getTop());
                    AdapterSearch.shirini3 = false;
                } else if (AdapterSearch.shirini4) {
                    scrollView.scrollTo(0, shirini4.getTop());
                    AdapterSearch.shirini4 = false;
                } else if (AdapterSearch.shirini5) {
                    scrollView.scrollTo(0, shirini5.getTop());
                    AdapterSearch.shirini5 = false;
                } else if (AdapterSearch.shirini6) {
                    scrollView.scrollTo(0, shirini6.getTop());
                    AdapterSearch.shirini6 = false;
                }
            }
        });
    }
}
