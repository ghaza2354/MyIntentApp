package com.mgadevelop.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveActivityWithObject extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);
        textView = findViewById(R.id.tv_objek_received);

        MyBiodata biodata = getIntent().getParcelableExtra("biodata");
        textView.setText("Nama saya"+ biodata.getNama() + "Umur saya"+ biodata.getUmur());
    }
}
