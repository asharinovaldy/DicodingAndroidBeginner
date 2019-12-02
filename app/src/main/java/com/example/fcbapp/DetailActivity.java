package com.example.fcbapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView dataName = findViewById(R.id.nameDetail);
        TextView dataDetail = findViewById(R.id.detailDetail);
        CircleImageView imageView = findViewById(R.id.playerPhoto);

        Bundle bundle = this.getIntent().getExtras();

        String nama = getIntent().getStringExtra("text");
        String detail = getIntent().getStringExtra("detail");
        int img = bundle.getInt("photo");
        imageView.setImageResource(img);

        String textName = "Player Name : " +nama;
        dataName.setText(textName);

        String textDetail = "Detail : " +detail;
        dataDetail.setText(textDetail);


    }
}
