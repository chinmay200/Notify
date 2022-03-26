package com.example.assist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModalClass> userlist;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initdata();
        initrecyclerview();
    }

    private void initrecyclerview() {
        recyclerView = findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userlist);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    }

    private void initdata() {
        userlist = new ArrayList<>();
        userlist.add(new ModalClass("task1"));
        userlist.add(new ModalClass("task2"));
        userlist.add(new ModalClass("task3"));
        userlist.add(new ModalClass("task4"));
    }
}