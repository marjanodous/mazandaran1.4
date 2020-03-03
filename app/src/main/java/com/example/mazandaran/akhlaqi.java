package com.example.mazandaran;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.mazandaran.adapter.AdapterSearch;

public class akhlaqi extends Fragment {

    ScrollView scrollView;
    TextView  akhlag11, akhlag12, akhlag13, akhlag14 ;
    public akhlaqi() {
        /*empty*/
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_akhlaqi, null);
        scrollView = rootView.findViewById(R.id.scrollakhlagh);
        akhlag11 = rootView.findViewById(R.id.akhlagh1);
        akhlag12 = rootView.findViewById(R.id.akhlag2);
        akhlag13 = rootView.findViewById(R.id.akhlagh3);
        akhlag14 = rootView.findViewById(R.id.akhlag4);
        scrollView.post(new Runnable() {
            @Override
            public void run() {
                if (AdapterSearch.akhlagh1) {
                    scrollView.scrollTo(0, akhlag11.getTop());
                    AdapterSearch.akhlagh1 = false;
                } else if (AdapterSearch.akhlagh2) {
                    scrollView.scrollTo(0, akhlag12.getTop());
                    AdapterSearch.akhlagh2 = false;
                } else if (AdapterSearch.akhlagh3) {
                    scrollView.scrollTo(0, akhlag13.getTop());
                    AdapterSearch.akhlagh3 = false;
                } else if (AdapterSearch.akhlagh4) {
                    scrollView.scrollTo(0, akhlag14.getTop());
                    AdapterSearch.akhlagh4 = false;
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
                if (AdapterSearch.akhlagh1) {
                    scrollView.scrollTo(0, akhlag11.getTop());
                    AdapterSearch.akhlagh1 = false;
                } else if (AdapterSearch.akhlagh2) {
                    scrollView.scrollTo(0, akhlag12.getTop());
                    AdapterSearch.akhlagh2 = false;
                } else if (AdapterSearch.akhlagh3) {
                    scrollView.scrollTo(0, akhlag13.getTop());
                    AdapterSearch.akhlagh3 = false;
                } else if (AdapterSearch.akhlagh4) {
                    scrollView.scrollTo(0, akhlag14.getTop());
                    AdapterSearch.akhlagh4 = false;
                }
            }
        });
    }
}
