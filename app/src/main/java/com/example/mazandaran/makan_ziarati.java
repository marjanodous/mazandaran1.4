package com.example.mazandaran;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.mazandaran.adapter.AdapterSearch;

import java.util.HashMap;

public class makan_ziarati extends Fragment {

    private String latitude;
    private String longitude;
    ImageView location_pahnekola,location_amol,location_shirud,location_savadhuh,location_abdolhaq,location_qaemshahr;
    ScrollView scrollView;
    TextView makan1, makan2, makan3, makan4, makan5, makan6;
    public makan_ziarati() {
        /*empty*/
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_makan_ziarati, null);
        location_pahnekola = rootView.findViewById(R.id.location_pahnekola);
        location_amol =rootView.findViewById(R.id.location_amol);
        location_shirud =rootView.findViewById(R.id.location_shirud);
        location_savadhuh =rootView.findViewById(R.id.location_savadhuh);
        location_abdolhaq =rootView.findViewById(R.id.location_abdolhaq);
        location_qaemshahr =rootView.findViewById(R.id.location_qaemshahr);

        scrollView = rootView.findViewById(R.id.scrollmakan);
        makan1 = rootView.findViewById(R.id.makan1);
        makan2 = rootView.findViewById(R.id.makan2);
        makan3 = rootView.findViewById(R.id.makan3);
        makan4 = rootView.findViewById(R.id.makan4);
        makan5 = rootView.findViewById(R.id.makan5);
        makan6 = rootView.findViewById(R.id.makan6);
//        HashMap<String, Integer> imgMap = new HashMap<>();

        scrollView.post(new Runnable() {
            @Override
            public void run() {
                if (AdapterSearch.makan0) {
                    scrollView.scrollTo(0, 0);
                    AdapterSearch.makan0 = false;
                } else if (AdapterSearch.makan1) {
                    scrollView.scrollTo(0, makan1.getTop());
                    AdapterSearch.makan1 = false;
                } else if (AdapterSearch.makan2) {
                    scrollView.scrollTo(0, makan2.getTop());
                    AdapterSearch.makan2 = false;
                } else if (AdapterSearch.makan3) {
                    scrollView.scrollTo(0, makan3.getTop());
                    AdapterSearch.makan3 = false;
                } else if (AdapterSearch.makan4) {
                    scrollView.scrollTo(0, makan4.getTop());
                    AdapterSearch.makan4 = false;
                } else if (AdapterSearch.makan5) {
                    scrollView.scrollTo(0, makan5.getTop());
                    AdapterSearch.makan5 = false;
                } else if (AdapterSearch.makan6) {
                    scrollView.scrollTo(0, makan6.getTop());
                    AdapterSearch.makan6 = false;
                }
            }
        });
        location_pahnekola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uri = "http://maps.google.com/maps?daddr=" + 36.456607 + "," + 53.075275;
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });
        location_amol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uri = "http://maps.google.com/maps?daddr=" + 36.553693 + "," + 52.685932;
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });
        location_shirud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uri = "http://maps.google.com/maps?daddr=" + 36.852538 + "," + 50.805077;
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });
        location_savadhuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uri = "http://maps.google.com/maps?daddr=" + 36.165833 + "," + 53.001108;
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });
        location_abdolhaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uri = "http://maps.google.com/maps?daddr=" + 36.176743 + "," + 52.972896;
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });
        location_qaemshahr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uri = "http://maps.google.com/maps?daddr=" + 36.481633 + "," + 52.845516;
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
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
                if (AdapterSearch.makan0) {
                    scrollView.scrollTo(0, 0);
                    AdapterSearch.makan0 = false;
                } else if (AdapterSearch.makan1) {
                    scrollView.scrollTo(0, makan1.getTop());
                    AdapterSearch.makan1 = false;
                } else if (AdapterSearch.makan2) {
                    scrollView.scrollTo(0, makan2.getTop());
                    AdapterSearch.makan2 = false;
                } else if (AdapterSearch.makan3) {
                    scrollView.scrollTo(0, makan3.getTop());
                    AdapterSearch.makan3 = false;
                } else if (AdapterSearch.makan4) {
                    scrollView.scrollTo(0, makan4.getTop());
                    AdapterSearch.makan4 = false;
                } else if (AdapterSearch.makan5) {
                    scrollView.scrollTo(0, makan5.getTop());
                    AdapterSearch.makan5 = false;
                } else if (AdapterSearch.makan6) {
                    scrollView.scrollTo(0, makan6.getTop());
                    AdapterSearch.makan6 = false;
                }
            }
        });
    }
}
