package com.example.sheillinarichieeprt6;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_list_detail extends AppCompatActivity {

    Shape selectedShape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_detail);

        getSelectedShape();
        setValues();
    }

    public void getSelectedShape(){
        Intent previousIntent = getIntent();
        String parseStringId = previousIntent.getStringExtra("id");
        selectedShape = activity_listview.shappeList.get(Integer.valueOf(parseStringId));
    }

    public void setValues(){
        TextView tv = findViewById(R.id.list_text);
        ImageView iv = findViewById(R.id.list_image);

        tv.setText(selectedShape.getName());
        iv.setImageResource(selectedShape.getImage());
    }
}