package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Bai1 extends AppCompatActivity {
    ListView lv;
    AdapterCustom adt;
    ArrayList<NguoiMau> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        lv = (ListView) findViewById(R.id.listview);
        list = new ArrayList<>();
        adt = new AdapterCustom(this,R.layout.my_layout,list);
        lv.setAdapter(adt);
        LoadData();
        LoadData();
        LoadData();
        LoadData();
        LoadData();
    }
    public void LoadData(){
        NguoiMau  n = new NguoiMau(R.mipmap.ic_launcher,"Kỳ Duyên",1990,R.mipmap.ic_launcher_round);
        NguoiMau  n1 = new NguoiMau(R.mipmap.ic_launcher,"Đặng Thu Thảo",1995,R.mipmap.ic_launcher_round);
        NguoiMau  n2 = new NguoiMau(R.mipmap.ic_launcher,"Nguyễn Thị Huyền",1989,R.mipmap.ic_launcher_round);
        NguoiMau  n3 = new NguoiMau(R.mipmap.ic_launcher,"Thanh Huyền",1979,R.mipmap.ic_launcher_round);
        NguoiMau  n4 = new NguoiMau(R.mipmap.ic_launcher,"Đỗ Mỹ Linh",1972,R.mipmap.ic_launcher_round);
        list.add(n);
        list.add(n1);
        list.add(n2);
        list.add(n3);
        list.add(n4);
        adt.notifyDataSetChanged();
    }
}
