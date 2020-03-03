package com.example.mazandaran;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.mazandaran.adapter.AdapterSearch;

public class tarikhche extends Fragment {

    ScrollView scrollView;
    TextView tarikh;

    public tarikhche() {
        /*empty*/
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tarikhche, null);
        scrollView = rootView.findViewById(R.id.scrolltarikh);
        tarikh = rootView.findViewById(R.id.titletarikh);
        scrollView.post(new Runnable() {
            @Override
            public void run() {
                if (AdapterSearch.tarikh) {
                    scrollView.scrollTo(0, tarikh.getTop());
                    AdapterSearch.tarikh = false;
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
                if (AdapterSearch.tarikh) {
                    scrollView.scrollTo(0, tarikh.getTop());
                    AdapterSearch.tarikh = false;
                }
            }
        });
    }
}
