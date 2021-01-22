package com.samiul.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<String> name=new ArrayList<>();
    List<String> title=new ArrayList<>();
    ListAdapter listAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.listcycle);

        name.add("Meherin");
        title.add("Android Developer");

        name.add("Fouzia");
        title.add("Soft Engineer");

        name.add("Antor");
        title.add("PochaAndroid Developer");

        name.add("Donald Trump");
        title.add("Bal Developer");
        name.add("Meherin");
        title.add("Android Developer");

        name.add("Fouzia");
        title.add("Soft Engineer");

        name.add("Antor");
        title.add("PochaAndroid Developer");

        name.add("Donald Trump");
        title.add("Bal Developer");
        name.add("Meherin");
        title.add("Android Developer");

        name.add("Fouzia");
        title.add("Soft Engineer");

        name.add("Antor");
        title.add("PochaAndroid Developer");

        name.add("Donald Trump");
        title.add("Bal Developer");
        name.add("Meherin");
        title.add("Android Developer");

        name.add("Fouzia");
        title.add("Soft Engineer");

        name.add("Antor");
        title.add("PochaAndroid Developer");

        name.add("Donald Trump");
        title.add("Bal Developer");
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),1);
        recyclerView.setLayoutManager(gridLayoutManager);
        listAdapter=new ListAdapter(getApplicationContext(),name,title);
        recyclerView.setAdapter(listAdapter);
    }
}