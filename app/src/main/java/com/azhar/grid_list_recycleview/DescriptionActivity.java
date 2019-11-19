package com.azhar.grid_list_recycleview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DescriptionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description);
        ImageView gambar = (ImageView) findViewById(R.id.foto);
        TextView remark = (TextView) findViewById(R.id.remarks);
        TextView judul = (TextView) findViewById(R.id.judul);
        remark.setText(getIntent().getStringExtra("remarks"));
        judul.setText(getIntent().getStringExtra("name"));
        Glide.with(DescriptionActivity.this)
                .load(getIntent().getStringExtra("photo"))
                .apply(new RequestOptions().override(100, 100))
                .into(gambar);
    }
}
