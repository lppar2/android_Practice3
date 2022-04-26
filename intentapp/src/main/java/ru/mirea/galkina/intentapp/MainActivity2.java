package ru.mirea.galkina.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String dateString = (String) getIntent().getSerializableExtra("dateString");
        textView = findViewById(R.id.textView);
        textView.setText(dateString);
    }
}