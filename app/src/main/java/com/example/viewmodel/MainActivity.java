package com.example.viewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mBtn;
    TextView mTvString;
    EditText mEdt;
    MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtn = findViewById(R.id.buttonShowText);
        mTvString = findViewById(R.id.textviewString);
        mEdt = findViewById(R.id.edittext);

        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        mainViewModel.getDataString().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String text) {
                mTvString.setText(text);
            }
        });


        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = mEdt.getText().toString();
                mainViewModel.setDataString(text);
            }
        });

    }
}
