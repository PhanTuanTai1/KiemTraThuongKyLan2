package com.example.student.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterCustom extends BaseAdapter{
    Activity context;
    ArrayList<NguoiMau> arr;
    int layoutID;
    public AdapterCustom(Activity context,int layoutID,ArrayList<NguoiMau> lst){
        this.context = context;
        this.layoutID = layoutID;
        this.arr = lst;
    }
    @Override
    public int getCount() {
        return this.arr.size();
    }

    @Override
    public Object getItem(int position) {
        return arr.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(layoutID,null);
            viewHolder = new ViewHolder();
            viewHolder.tv = (TextView) convertView.findViewById(R.id.tvInfo);
            viewHolder.img1 = (ImageView) convertView.findViewById(R.id.ivImg);
            viewHolder.img2 = (ImageView) convertView.findViewById(R.id.ivNation);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        NguoiMau n = arr.get(position);
        viewHolder.img1.setImageResource(n.getImg());
        viewHolder.tv.setText(n.toString());
        viewHolder.img2.setImageResource(n.getQuocTich());
        return convertView;
    }
    static class ViewHolder{
        ImageView img1,img2;
        TextView tv;
    }
}
