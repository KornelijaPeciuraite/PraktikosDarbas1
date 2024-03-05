package com.example.praktinisdarbas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
public class MainActivity extends AppCompatActivity {

    private TextView btnchangetext;
    private TextView btnchangecolor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btnchangetext = findViewById(R.id.btnchangetext);
        this.btnchangecolor = findViewById(R.id.btnchangecolor);
    }

    public void btntextclick(View view) {
        this.btnchangetext.setText("Hello");
    }

    public void btnchangecolor(View view) {
        this.btnchangecolor
    }
}
