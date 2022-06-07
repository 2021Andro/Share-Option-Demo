package com.example.shareoptiondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonShare(View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);

        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Check out this cool Applications");
        intent.putExtra(Intent.EXTRA_TEXT, "Your Applications Link Hear");

        startActivityForResult(Intent.createChooser(intent, "Share via"), 0);
    }
}