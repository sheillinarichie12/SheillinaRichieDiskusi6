package com.example.sheillinarichieeprt6;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class activity_listview extends Fragment {

    public activity_listview(){

    }

    public static ArrayList<Shape> shappeList = new ArrayList<Shape>();
    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.activity_listview, container, false);
        setupData();

        listView = v.findViewById(R.id.shapeListview);
        shape_cell adapter = new shape_cell(getContext(), 0, shappeList);
        listView.setAdapter(adapter);

        setupOnClickListener();
        return v;
    }

    public void setupData(){
        Shape apple = new Shape("0", "Apple         47 Calories", R.drawable.apple);
        shappeList.add(apple);

        Shape apricot = new Shape("1", "Apricot         47 Calories", R.drawable.apricot);
        shappeList.add(apricot);

        Shape banana = new Shape("2", "Banana        47 Calories", R.drawable.banana);
        shappeList.add(banana);

        Shape cherry = new Shape("3", "Cherry        47 Calories", R.drawable.cherry);
        shappeList.add(cherry);

        Shape kiwi = new Shape("4", "Kiwi        47 Calories", R.drawable.kiwi);
        shappeList.add(kiwi);

        Shape lemon = new Shape("5", "Lemon        47 Calories", R.drawable.lemon);
        shappeList.add(lemon);

        Shape mango = new Shape("6", "Mango        47 Calories", R.drawable.mango);
        shappeList.add(mango);

        Shape orange = new Shape("7", "Orange        47 Calories", R.drawable.orange);
        shappeList.add(orange);

        Shape peach = new Shape("8", "Peach        47 Calories", R.drawable.peach);
        shappeList.add(peach);

        Shape pear = new Shape("9", "Pear        47 Calories", R.drawable.pear);
        shappeList.add(pear);

        Shape strawberry = new Shape("10", "Strawberry        47 Calories", R.drawable.strawberry);
        shappeList.add(strawberry);
    }

    private void setupOnClickListener(){
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Shape selectShape = (Shape) listView.getItemAtPosition(i);
                Intent showDetail = new Intent(getContext(), activity_list_detail.class);
                showDetail.putExtra("id", selectShape.getId());
                startActivity(showDetail);
            }
        });
    }
}