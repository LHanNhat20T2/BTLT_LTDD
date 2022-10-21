package com.example.bttonghoplt;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

import ChildModel.ChildModelClass;
import ParentModel.ParentAdapter;
import ParentModel.ParentModelClass;
public class MainActivity extends Fragment {
    Button btnexit;
    RecyclerView rcv;
    ArrayList<ParentModelClass> parentModelClassList;
    ArrayList<ChildModelClass> childModelClassList;
    ArrayList<ChildModelClass> equinelist;
    ArrayList<ChildModelClass> eatlist;
    ArrayList<ChildModelClass> toollist;
    ArrayList<ChildModelClass> medianlist;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main, container, false);

        btnexit = (Button) view.findViewById(R.id.btn_thoat);


        rcv = (RecyclerView) view.findViewById(R.id.rcv_parent);
        childModelClassList = new ArrayList<>();
        equinelist = new ArrayList<>();
        eatlist = new ArrayList<>();
        toollist = new ArrayList<>();
        medianlist = new ArrayList<>();
        parentModelClassList = new ArrayList<>();
        ParentAdapter parentAdapter;

        equinelist.add(new ChildModelClass(R.drawable.img_nguabachma));
        equinelist.add(new ChildModelClass(R.drawable.img_nguavang));
        equinelist.add(new ChildModelClass(R.drawable.img_nguabach4));
        equinelist.add(new ChildModelClass(R.drawable.img_nguabach6));
        equinelist.add(new ChildModelClass(R.drawable.img_nguabach));
        equinelist.add(new ChildModelClass(R.drawable.img_nguaden));
        parentModelClassList.add(new ParentModelClass("Giống ngựa", equinelist));

        eatlist.add(new ChildModelClass(R.drawable.img_co));
        eatlist.add(new ChildModelClass(R.drawable.eatkruse));
        eatlist.add(new ChildModelClass(R.drawable.eatmaxwin));
        eatlist.add(new ChildModelClass(R.drawable.mixeat));

        parentModelClassList.add(new ParentModelClass("Thức ăn", eatlist));

        toollist.add(new ChildModelClass(R.drawable.img_vatdung1));
        toollist.add(new ChildModelClass(R.drawable.img_vatdung2));
        toollist.add(new ChildModelClass(R.drawable.img_vatdung3));
        toollist.add(new ChildModelClass(R.drawable.img_vatdugn4));
        toollist.add(new ChildModelClass(R.drawable.img_vatdung5));
        parentModelClassList.add(new ParentModelClass("Vật dụng", toollist));

        parentAdapter = new ParentAdapter(parentModelClassList, getContext());
        rcv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcv.setAdapter(parentAdapter);
        parentAdapter.notifyDataSetChanged();
        return view;


    }
}

