package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    **This function displays Team A score
     */
    void displayA(String score){
        TextView text = (TextView) findViewById(R.id.teamA_score_text);
        text.setText(score);
    }

    /*
    **This function displays Team A score
     */
    void displayB(String score){
        TextView text = (TextView) findViewById(R.id.teamB_score_text);
        text.setText(score);
    }



}
