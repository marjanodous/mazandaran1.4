package com.example.mazandaran.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.mazandaran.R;
import com.example.mazandaran.model.Music;
import com.example.mazandaran.tabs;

import java.util.ArrayList;

public class AdapterSearch extends ArrayAdapter {
    public int resourceId;
    public Activity activity;
    public ArrayList<Music> data;
    Music model = new Music();
    public static boolean marasem0, marasem1, marasem2, marasem3, marasem4, marasem5, marasem6 ,
            tarikh,
            akhlagh1,akhlagh2,akhlagh3,akhlagh4,
            eteghad1,eteghad2,eteghad3,
            makan0,makan1,makan2,makan3,makan4,makan5,makan6,
            ghaza0,ghaza1,ghaza2,ghaza3,ghaza4,ghaza5,ghaza6,
            shirini0,shirini1,shirini2,shirini3,shirini4,shirini5,shirini6= false;

    /*create object for xml*/
    TextView txtName;

    public AdapterSearch(Activity activity, int resourceId, ArrayList<Music> object) {
        super(activity, resourceId, object);
        this.resourceId = resourceId;
        this.activity = activity;
        this.data = object;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = convertView;
        view = this.activity.getLayoutInflater().inflate(this.resourceId, null);

        /* Get object from xml file*/
        txtName = view.findViewById(R.id.item_search);

        /*1.set value to model array*/
        model = data.get(position);
        txtName.setText(model.getMusicName());

        /*2.click item list*/
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*get value name from item */
                String title = data.get(position).getMusicName();
                /*if searched titr from main*/
                if (title.contains("گذري بر فرهنگ مازندران")) {
                    tabs.flag_tarikhche = true;
                    if (title.contains("گذري بر فرهنگ مازندران")) { tarikh=true;}
                    activity.finish();
                } else if (title.contains("آداب و رسوم مازندران") || title.contains("نوروز خوانی") ||
                        title.contains("چهارشنبه سوری") || title.contains("عید نوروز")
                        || title.contains("آرش کمانگیر") || title.contains("آیین سنتی ۲۶ عید ماه")
                        || title.contains("شب یلدا")) {
                    tabs.flag_marasem = true;
                    if (title.contains("آداب و رسوم مازندران")) { marasem6=true;}
                    else if (title.contains("نوروز خوانی")) { marasem0=true;}
                    else if (title.contains("چهارشنبه سوری")) {marasem1=true; }
                    else if (title.contains("عید نوروز")) { marasem2=true;}
                    else if (title.contains("آرش کمانگیر")) { marasem3=true;}
                    else if (title.contains("آیین سنتی ۲۶ عید ماه")) {marasem4 = true;}
                    else if (title.contains("شب یلدا")) {marasem5=true;}
                    activity.finish();

                } else if (title.contains("خصوصیات اخلاقی مازندران") || title.contains("سخت کوشی زنان") ||
                        title.contains("همکاری و تعاون") || title.contains("سایر ویژگی های رفتاری")) {
                    tabs.flag_akhlaqi = true;
                    if (title.contains("خصوصیات اخلاقی مازندران")) { akhlagh1=true;}
                    else if (title.contains("سخت کوشی زنان")) { akhlagh2=true;}
                    else if (title.contains("همکاری و تعاون")) { akhlagh3=true;}
                    else if (title.contains("سایر ویژگی های رفتاری")) {akhlagh4=true; }
                    activity.finish();
                } else if (title.contains("اعتقاد و باورهای مردم مازندران") ||
                        title.contains("سنت سحرخوانی در ماه رمضان") || title.contains("اولین روز نوروز تبری")) {
                    tabs.flag_eteqadat = true;
                    if (title.contains("اعتقاد و باورهای مردم مازندران")) { eteghad1=true;}
                    else if (title.contains("سنت سحرخوانی در ماه رمضان")) { eteghad2=true;}
                    else if (title.contains("اولین روز نوروز تبری")) { eteghad3=true;}
                    activity.finish();
                } else if (title.contains("مکان های زیارتی  مازندران") || title.contains("پهنه کلا")
                        || title.contains("امامزاده عبدالله آمل") || title.contains("امامزاده سید صالح قائمشهر") ||
                        title.contains("امامزاده حسین شیرود") || title.contains("امامزاده ابوطالب سوادکوه") ||
                        title.contains("امامزاده عبدالحق")) {
                    tabs.flag_makan_ziarati = true;
                    if (title.contains("مکان های زیارتی  مازندران")) { makan0=true;}
                    else if (title.contains("پهنه کلا")) { makan1=true;}
                    else if (title.contains("امامزاده عبدالله آمل")) { makan2=true;}
                    else if (title.contains("امامزاده سید صالح قائمشهر")) { makan3=true;}
                    else if (title.contains("امامزاده حسین شیرود")) { makan4=true;}
                    else if (title.contains("امامزاده ابوطالب سوادکوه")) { makan5=true;}
                    else if (title.contains("امامزاده عبدالحق")) { makan6=true;}
                    activity.finish();
                } else if (title.contains("غذاهای محلی مازندران") || title.contains("کدو بره")
                        || title.contains("نازخاتون") || title.contains("خورشت سیر انار") ||
                        title.contains("آش گزنه") || title.contains("بادمجان شکم پُر") ||
                        title.contains("آش کدو")) {
                    tabs.flag_qaza = true;
                    if (title.contains("غذاهای محلی مازندران")) { ghaza0=true;}
                    else if (title.contains("کدو بره")) { ghaza1=true;}
                    else if (title.contains("نازخاتون")) {ghaza2=true; }
                    else if (title.contains("خورشت سیر انار")) { ghaza3=true;}
                    else if (title.contains("آش گزنه")) { ghaza4=true;}
                    else if (title.contains("بادمجان شکم پُر")) {ghaza5 = true;}
                    else if (title.contains("آش کدو")) {ghaza6=true;}
                    activity.finish();
                } else if (title.contains("شیرینی های محلی مازندران") || title.contains("شیرینی برنجک")
                        || title.contains("آب دندون") || title.contains("اغوزکنا") ||
                        title.contains("پشت زیک") || title.contains("قماق") ||
                        title.contains("نان کوهی")) {
                    tabs.flag_shirini = true;
                    if (title.contains("شیرینی های محلی مازندران")) { shirini0=true;}
                    else if (title.contains("شیرینی برنجک")) { shirini1=true;}
                    else if (title.contains("آب دندون")) {shirini2=true; }
                    else if (title.contains("اغوزکنا")) { shirini3=true;}
                    else if (title.contains("پشت زیک")) { shirini4=true;}
                    else if (title.contains("قماق")) {shirini5 = true;}
                    else if (title.contains("نان کوهی")) {shirini6=true;}
                    activity.finish();
                } else if (title.contains("آهنگ های محلی مازندران")) {
                    tabs.flag_ahang = true;
                    activity.finish();
                }
//                else if (title.contains("فیلم محلی مازندران")) {
//                    tabs.flag_film = true;
//                    activity.finish();
//                }
            }
        });
        return view;
    }
}
