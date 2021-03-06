package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore;
    int teamBScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    **This function displays Team A score
     */
    private void displayForTeamA(int score){
        TextView text = (TextView) findViewById(R.id.teamA_score_text);
        text.setText("" + score);
    }

    /*
    **This function displays Team A score
     */
    private void displayForTeamB(int score){
        TextView text = (TextView) findViewById(R.id.teamB_score_text);
        text.setText("" + score);
    }

    /*
    **This function is called when +3Points button of team A is clicked
     */
    public void add3PointsToTeamA(View view){
        teamAScore += 3;
        displayForTeamA(teamAScore);
    }

    /*
    **This function is called when +3Points button of team B is clicked
     */
    public void add3PointsToTeamB(View view){
        teamBScore += 3;
        displayForTeamB(teamBScore);
    }

    /*
    **This function is called when +2Points button of team A is clicked
     */
    public void add2PointsToTeamA(View view){
        teamAScore += 2;
        displayForTeamA(teamAScore);
    }

    /*
    **This function is called when +2Points button of team B is clicked
     */
    public void add2PointsToTeamB(View view){
        teamBScore += 2;
        displayForTeamB(teamBScore);
    }

    /*
    **This function is called when Free Through button of team A is clicked
     */
    public void add1PointToTeamA(View view){
        teamAScore += 1;
        displayForTeamA(teamAScore);
    }

    /*
    **This function is called when Free Through button of team A is clicked
     */
    public void add1PointToTeamB(View view){
        teamBScore += 1;
        displayForTeamB(teamBScore);
    }

    /*
    **This method is called when Reset button is clicked
     */
    public void resetScores(View view){
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }

}
