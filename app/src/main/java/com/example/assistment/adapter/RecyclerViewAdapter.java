package com.example.assistment.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assistment.R;

import java.awt.font.TextAttribute;
import java.text.BreakIterator;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private Context task;
    private List<String> tasks;

    public RecyclerViewAdapter(Context task, List<String> tasks) {
        this.task = task;
        this.tasks = tasks;
    }

    public String getTask() {
        return task;
    }

    public void setTask(Context task) {
        this.task = task;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    //Where to get a single card from
    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.row , parent , false);
        return new ViewHolder(view);
    }

    //What will happen after we get the viewholder object
    @Override
    public void onBindViwHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        String text = tasks.get(position);
        ViewHolder.textView.setText(getTask());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView.setOnClickListener(this);
            textView = itemView.findViewById(R.id.task);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
