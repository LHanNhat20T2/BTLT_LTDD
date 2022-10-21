package com.example.bttonghoplt.HorseModel;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.bttonghoplt.R;

import java.util.List;

public class HorseAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Horse> horsesList;


    public HorseAdapter(Context context, int layout, List<Horse> horsesList) {
        this.context = context;
        this.layout = layout;
        this.horsesList = horsesList;
    }

    @Override
    public int getCount() {
        return horsesList.size();
    }

    @Override
    public Object getItem(int i) {
        return horsesList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view =inflater.inflate(layout,null);
        // anh xa
        TextView txt_ten= view.findViewById(R.id.tv_name_horse);
        TextView txt_mota= view.findViewById(R.id.tv_desc);
        TextView txt_gia= view.findViewById(R.id.tv_prince_horse);
        ImageView img = view.findViewById(R.id.img_horse);

        Horse horse =  horsesList.get(i);
        txt_ten.setText(horse.getNameOrder());
        txt_mota.setText(horse.getDescOrder());
        txt_gia.setText(horse.getPrinceOrder());
        img.setImageResource(horse.getImgOrder());

      return view;
    }
}