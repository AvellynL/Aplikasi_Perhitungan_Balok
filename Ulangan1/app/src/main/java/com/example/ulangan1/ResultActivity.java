package com.example.ulangan1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();

        String hasil = intent.getStringExtra("data");
        String rumus1 = intent.getStringExtra("anu");
        TextView rumus2 = findViewById(R.id.outputrumus);
        rumus2.setText(rumus1);
        TextView output = findViewById(R.id.outputHasil);
        output.setText(hasil);


    }
}
