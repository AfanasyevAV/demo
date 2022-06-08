package com.example.p0111_resvalues;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LinearLayout lltop = (LinearLayout) findViewById(R.id.llTop);
        TextView tvTop = (TextView) findViewById(R.id.tvBottom);
        Button btnTop = (Button) findViewById(R.id.btnBottom);

        lltop.setBackgroundResource(R.color.llTopColor);
        tvTop.setText(R.string.tvTopText);
        btnTop.setText(R.string.btnTopText);

        LinearLayout llBottom = (LinearLayout) findViewById(R.id.llBottom);
        TextView tvBottom = (TextView) findViewById(R.id.tvBottom);
        Button btnBottom = (Button) findViewById(R.id.btnBottom);

        llBottom.setBackgroundResource(R.color.llBottomColor);
        tvBottom.setText(R.string.tvBottomText);
        btnBottom.setText(R.string.btnBottomText);
    }
}