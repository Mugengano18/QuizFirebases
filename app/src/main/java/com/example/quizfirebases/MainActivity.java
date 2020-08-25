package com.example.quizfirebases;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.OptionA)
    Button b1;
    @BindView(R.id.OptionB)
    Button b2;
    @BindView(R.id.OptionC)
    Button b3;
    @BindView(R.id.OptionD)
    Button b4;
    @BindView(R.id.Questions)
    TextView questionTxt;
    @BindView(R.id.textView4)
    TextView textView4;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    int correct=0;
    int wrong=0;
    int total=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}