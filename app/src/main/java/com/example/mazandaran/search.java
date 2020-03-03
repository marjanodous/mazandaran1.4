package com.example.mazandaran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.mazandaran.adapter.AdapterSearch;
import com.example.mazandaran.model.Music;

import java.util.ArrayList;


public class search extends AppCompatActivity {
    /*create object for xml*/
    ListView listViewSearch;
    EditText edtNameSearch;
    TextView txtResult;
    ImageView imgClear;

    public ArrayList<Music> ArrayListSearch, ArrayListSearchUser;
    AdapterSearch adapter;
    public ArrayList<Music> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        /* Get object from xml file*/
        listViewSearch = findViewById(R.id.listView_search);
        edtNameSearch = findViewById(R.id.edt_name_search);
        txtResult = findViewById(R.id.result_search);
        imgClear = findViewById(R.id.imgsearch_clear);

        /*calling method to set items for arraylist defualt*/
        setItemList();


        /*2.clear text Search*/
        imgClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNameSearch.setText("");
            }
        });

        /*3.checked edit text when user typing*/
        edtNameSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                /*4. when text the length > 3 char*/
                String text = edtNameSearch.getText().toString().trim();
                if (text.length() >= 3) {
                    /*calling method set item Search*/
                    serchArray(text);
                }
            }
            @Override
            public void afterTextChanged(Editable editable) {
                String text = edtNameSearch.getText().toString().trim();
                /* 5.if text is empty show list empty*/
                if (text.equals("")) {
                    txtResult.setText("نتیجه جستجو");
                    ArrayListSearchUser = new ArrayList<>();
                    setItemListSearch();
                }
            }
        });
    }

    /*6.method show list user searched */
    public void setItemListSearch() {
        adapter = new AdapterSearch(search.this, R.layout.searchitem, ArrayListSearchUser);
        listViewSearch.setAdapter(adapter);
    }

    /*7.method for set value to list defualt*/
    public void setItemList() {
        ArrayListSearch = new ArrayList<>();
        ArrayListSearch.add(new Music("گذري بر فرهنگ مازندران"));
        ArrayListSearch.add(new Music("آداب و رسوم مازندران"));
        ArrayListSearch.add(new Music("نوروز خوانی"));
        ArrayListSearch.add(new Music("چهارشنبه سوری"));
        ArrayListSearch.add(new Music("عید نوروز"));
        ArrayListSearch.add(new Music("آرش کمانگیر"));
        ArrayListSearch.add(new Music("آیین سنتی ۲۶ عید ماه"));
        ArrayListSearch.add(new Music("شب یلدا"));
        ArrayListSearch.add(new Music("خصوصیات اخلاقی مازندران"));
        ArrayListSearch.add(new Music("سخت کوشی زنان"));
        ArrayListSearch.add(new Music("همکاری و تعاون"));
        ArrayListSearch.add(new Music("سایر ویژگی های رفتاری"));
        ArrayListSearch.add(new Music("اعتقاد و باورهای مردم مازندران"));
        ArrayListSearch.add(new Music("سنت سحرخوانی در ماه رمضان"));
        ArrayListSearch.add(new Music("اولین روز نوروز تبری"));
        ArrayListSearch.add(new Music("مکان های زیارتی  مازندران"));
        ArrayListSearch.add(new Music("پهنه کلا"));
        ArrayListSearch.add(new Music("امامزاده عبدالله آمل"));
        ArrayListSearch.add(new Music("امامزاده سید صالح قائمشهر"));
        ArrayListSearch.add(new Music("امامزاده حسین شیرود"));
        ArrayListSearch.add(new Music("امامزاده ابوطالب سوادکوه"));
        ArrayListSearch.add(new Music("امامزاده عبدالحق"));
        ArrayListSearch.add(new Music("غذاهای محلی مازندران"));
        ArrayListSearch.add(new Music("کدو بره"));
        ArrayListSearch.add(new Music("نازخاتون"));
        ArrayListSearch.add(new Music("خورشت سیر انار"));
        ArrayListSearch.add(new Music("آش گزنه"));
        ArrayListSearch.add(new Music("بادمجان شکم پُر"));
        ArrayListSearch.add(new Music("آش کدو"));
        ArrayListSearch.add(new Music("شیرینی های محلی مازندران"));
        ArrayListSearch.add(new Music("شیرینی برنجک"));
        ArrayListSearch.add(new Music("آب دندون"));
        ArrayListSearch.add(new Music("اغوزکنا"));
        ArrayListSearch.add(new Music("قماق"));
        ArrayListSearch.add(new Music("پشت زیک"));
        ArrayListSearch.add(new Music("نان کوهی"));
        ArrayListSearch.add(new Music("آهنگ های محلی مازندران"));
        ArrayListSearch.add(new Music("فیلم محلی مازندران"));
    }

    /*8. when name is equal whit list item defult*/
    public void serchArray(String name) {
        ArrayListSearchUser = new ArrayList<>();
        String sname = name;
        boolean flag = false;
        for (Music item : ArrayListSearch) {
            String model = item.getMusicName();
            if (model.contains(sname)) {
                flag = true;
                /*add equal item to list Search*/
                ArrayListSearchUser.add(new Music(model));
                /*calling method to show list Search*/
                setItemListSearch();
                txtResult.setText("نتیجه جستجو");
            } else if (flag == false) {
                /*set empty item to listsearch*/
                ArrayListSearchUser = new ArrayList<>();
                setItemListSearch();
                txtResult.setText("موردی یافت نشد");
            }
        }
    }
}
