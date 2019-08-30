package com.example.ulangan1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText in_Panjang,in_Lebar,in_Tinggi;
    private double p,l,t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        in_Panjang = findViewById(R.id.inPanjang);
        in_Lebar = findViewById(R.id.inLebar);
        in_Tinggi = findViewById(R.id.inTinggi);




    }

    public void hitungkeliling(View view) {
        String panjang = in_Panjang.getText().toString();
        String lebar = in_Lebar.getText().toString();
        String tinggi = in_Tinggi.getText().toString();
        p = Double.parseDouble(panjang);
        l = Double.parseDouble(lebar);
        t = Double.parseDouble(tinggi);

        if (in_Tinggi.length()==0)
        {
            in_Tinggi.requestFocus();
            in_Tinggi.setError("Field Cannot Be Empty");
        }
        else if (in_Lebar.length()==0)
        {
            in_Lebar.requestFocus();
            in_Lebar.setError("Field Cannot Be Empty");
        }
        else if (in_Panjang.length()==0)
        {
            in_Panjang.requestFocus();
            in_Panjang.setError("Field Cannot Be Empty");
        }

        Double keliling = 4*(p+l+t);

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("data", String.valueOf(keliling));
        intent.putExtra("anu","Keliling");

        startActivity(intent);

    }

    public void hitungluas(View view) {
        String panjang = in_Panjang.getText().toString();
        String lebar = in_Lebar.getText().toString();
        String tinggi = in_Tinggi.getText().toString();
        p = Double.parseDouble(panjang);
        l = Double.parseDouble(lebar);
        t = Double.parseDouble(tinggi);

        if (in_Tinggi.length()==0)
        {
            in_Tinggi.requestFocus();
            in_Tinggi.setError("Field Cannot Be Empty");
        }
        else if (in_Lebar.length()==0)
        {
            in_Lebar.requestFocus();
            in_Lebar.setError("Field Cannot Be Empty");
        }
        else if (in_Panjang.length()==0)
        {
            in_Panjang.requestFocus();
            in_Panjang.setError("Field Cannot Be Empty");
        }


        Double luas = 2*(p*l+p*t+l*t);


        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("data", String.valueOf(luas));
        intent.putExtra("anu", "Luas");

        startActivity(intent);


    }

    public void hitungvolume(View view) {
        String panjang = in_Panjang.getText().toString();
        String lebar = in_Lebar.getText().toString();
        String tinggi = in_Tinggi.getText().toString();
        p = Double.parseDouble(panjang);
        l = Double.parseDouble(lebar);
        t = Double.parseDouble(tinggi);

        if (in_Tinggi.length()==0)
        {
            in_Tinggi.requestFocus();
            in_Tinggi.setError("Field Cannot Be Empty");
        }
        else if (in_Lebar.length()==0)
        {
            in_Lebar.requestFocus();
            in_Lebar.setError("Field Cannot Be Empty");
        }
        else if (in_Panjang.length()==0)
        {
            in_Panjang.requestFocus();
            in_Panjang.setError("Field Cannot Be Empty");
        }

        Double volume = p*l*t;

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("data", String.valueOf(volume));
        intent.putExtra("anu", "Volume");

        startActivity(intent);
    }
}
