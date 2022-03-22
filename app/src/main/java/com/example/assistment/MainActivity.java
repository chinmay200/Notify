package com.example.assistment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter recyclerViewAdapter;
    private ArrayList<String> text;
    private ArrayAdapter<String> task;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();


        text = new ArrayList<>();
        text.add("task1");
        text.add("task2");
        text.add("task3");
        text.add("task4");
        text.add("task5");
        text.add("task6");
        text.add("task7");

        recyclerViewAdapter = 

        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this , com.example.assistment.TaskManager.class);
                startActivity(in);
            }
        });

    }
}