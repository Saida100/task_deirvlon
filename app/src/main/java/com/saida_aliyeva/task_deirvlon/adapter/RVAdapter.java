package com.saida_aliyeva.task_deirvlon.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.saida_aliyeva.task_deirvlon.R;
import com.saida_aliyeva.task_deirvlon.viewholder.RVViewHolder;
import com.saida_aliyeva.task_deirvlon.interfaces.OnItemClickListener;
import com.saida_aliyeva.task_deirvlon.model.Newsfeed;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVViewHolder> {

    List<Newsfeed> newsfeeds;
    Context context;
    OnItemClickListener clickListener;

    public RVAdapter(List<Newsfeed> newsfeeds, Context context,OnItemClickListener clickListener) {
        this.newsfeeds = newsfeeds;
        this.context = context;
        this.clickListener=clickListener;
    }

    @NonNull
    @Override
    public RVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_newsfeed, parent, false);
        return new RVViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVViewHolder holder, int position) {
    holder.bind(newsfeeds.get(position),clickListener);
    }

    @Override
    public int getItemCount()
    {
        return newsfeeds.size();
    }
}
