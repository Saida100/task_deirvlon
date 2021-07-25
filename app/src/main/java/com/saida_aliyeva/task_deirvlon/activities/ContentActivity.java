package com.saida_aliyeva.task_deirvlon.activities;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.saida_aliyeva.task_deirvlon.R;

public class ContentActivity extends AppCompatActivity {
    TextView contentTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        contentTextView=findViewById(R.id.text);
        Bundle bundle=getIntent().getExtras();
        String title=bundle.getString("text","Məlumat tapılmadı");
        contentTextView.setText(title);
    }
}