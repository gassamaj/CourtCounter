package com.example.student.courtcounter;

import android.support.v7.app.AppCompatActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mScoreTeamJG = 0;
    private int mScoreTeamSwag = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Displays the given score for Team A
     * @param score - given score for Team A to display
     */
    private void displayForTeamJG(int score){
        TextView scoreTeamJG = (TextView) findViewById(R.id.txtVw_scoreTeamJG);
        if(scoreTeamJG!=null)
            scoreTeamJG.setText(String.valueOf(score));
}

    /**
     * Displays the given score for Team B
     * @param score - given score for Team A to display
     */
    private void displayForTeamSwag(int score){
        TextView scoreTeamSwag = (TextView) findViewById(R.id.txtVw_scoreTeamSwag);
        if(scoreTeamSwag!=null)
            scoreTeamSwag.setText(String.valueOf(score));
    }

    /**
     * Increases the score for Team A by 3 points.
     */
    public void addOneForTeamJG(View view) {
        int step = 1;
        mScoreTeamJG += step;
        displayForTeamJG(mScoreTeamJG);
    }

    /**
     * Increases the score for Team A by 2 points.
     */
    public void addOneForTeamSwag(View view) {
        int step = 1;
        mScoreTeamSwag += step;
        displayForTeamSwag(mScoreTeamSwag);
    }

    /**
     * Increases the score for Team A by 1 point.
     */



    /**
     * Increases the score for Team A by 3 points.
     */
    public void addThreeFor(View view) {
        int step = 1;
        mScoreTeamSwag += step;
        displayForTeamSwag(mScoreTeamSwag);
    }

    /**
     * Increases the score for Team A by 2 points.
     */
    public void addoForTeamSwag(View view) {
        int step = 2;
        mScoreTeamSwag += step;
        displayForTeamSwag(mScoreTeamSwag);
    }

    /**
     * Increases the score for Team A by 1 point.
     */



    /**
     * Resets all scores for Team A and Team B
     */
    public void resetScore(View view) {
        mScoreTeamJG = 0;
        mScoreTeamSwag = 0;

        displayForTeamJG(mScoreTeamJG);
        displayForTeamSwag(mScoreTeamSwag);
    }
}