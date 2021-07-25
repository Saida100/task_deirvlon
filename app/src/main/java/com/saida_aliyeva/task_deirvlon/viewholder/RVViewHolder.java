package com.saida_aliyeva.task_deirvlon.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.saida_aliyeva.task_deirvlon.R;
import com.saida_aliyeva.task_deirvlon.classes.Utils;
import com.saida_aliyeva.task_deirvlon.interfaces.OnItemClickListener;
import com.saida_aliyeva.task_deirvlon.model.Newsfeed;
import com.squareup.picasso.Picasso;

public class RVViewHolder extends RecyclerView.ViewHolder {
    TextView titleTextView, textTextView, tagTextView, dateTextView;
    ImageView imageView;
    View v;


    public RVViewHolder(View view) {
        super(view);
        titleTextView = view.findViewById(R.id.title);
        textTextView = view.findViewById(R.id.content_text);
        tagTextView = view.findViewById(R.id.tag);
        dateTextView = view.findViewById(R.id.created_date);
        imageView = view.findViewById(R.id.image);
        v = view;

    }


    public void bind(Newsfeed newsfeed, OnItemClickListener clickListener) {
        String k = newsfeed.getImg();
        String s = k.substring((k.indexOf(".")) + 1, k.indexOf("/", 8));
        String date = newsfeed.getCreatedAt();
        titleTextView.setText(newsfeed.getTitle());
        textTextView.setText(s);
        String tag = "#" + newsfeed.getTag();
        tagTextView.setText(tag);
        dateTextView.setText(Utils.formatDate(date));
        Picasso.get().load(newsfeed.getImg()).into(imageView);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickListener.onItemClick(newsfeed);
            }
        });

    }


}
