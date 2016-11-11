package com.example.student.courtcounter;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class
MainActivity extends AppCompatActivity {

    private int mScoreTeamJG = 0;
    private int mScoreTeamSwag = 0;
    EditText teamName1View;
    EditText teamName2View;

    AlertDialog gameOverAlert;

    private MediaPlayer mediaPlayer;
    public String team1Name;
    public String team2Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamName1View = (EditText) findViewById(R.id.txtVw_Editteam);
        teamName2View = (EditText) findViewById(R.id.txtVw_Editteam2);

    }


    /**
     * Displays the given score for Team A
     *
     * @param score - given score for Team A to display
     */
    public void displayForTeamJG(int score) {
        TextView scoreTeamJG = (TextView) findViewById(R.id.txtVw_scoreTeamJG);
        if (scoreTeamJG != null)
            scoreTeamJG.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B
     *
     * @param score - given score for Team A to display
     */
    public void displayForTeamSwag(int score) {
        TextView scoreTeamSwag = (TextView) findViewById(R.id.txtVw_scoreTeamSwag);
        if (scoreTeamSwag != null)
            scoreTeamSwag.setText(String.valueOf(score));
    }

    /**
     * Increases the score for Team A by 3 points.
     */
    public void addOneForTeamJG(View view) {
        int step = 1;
        mScoreTeamJG += step;
        mediaPlayer = MediaPlayer.create(this, R.raw.stormhuricane);
        mediaPlayer.start();
        displayForTeamJG(mScoreTeamJG);
    }

    /**
     * Increases the score for Team A by 2 points.
     */
    public void subtractOneForTeamJG(View view) {
        int step = 1;
        mScoreTeamJG -= step;
        mediaPlayer = MediaPlayer.create(this, R.raw.stormhuricane);
        mediaPlayer.start();
        displayForTeamJG(mScoreTeamJG);
    }


    /**
     * Increases the score for Team A by 1 point.
     */


    /**
     * Increases the score for Team A by 2 points.
     */
    public void addOneForTeamSwag(View view) {
        int step = 1;
        mScoreTeamSwag += step;
        mediaPlayer = MediaPlayer.create(this, R.raw.stormhuricane);
        mediaPlayer.start();
        displayForTeamSwag(mScoreTeamSwag);
    }

    public void subtractOneForTeamSwag(View view) {
        int step = 1;
        mScoreTeamSwag -= step;
        mediaPlayer = MediaPlayer.create(this, R.raw.stormhuricane);
        mediaPlayer.start();
        displayForTeamSwag(mScoreTeamSwag);
    }

    /**
     * Increases the score for Team A by 1 point.
     */


    /**
     * Resets all scores for Team A and Team B
     */
    public void resetScore(View view) {
        mediaPlayer.start();
        gameOverAlert = new AlertDialog.Builder(MainActivity.this).create();
        String team1Name = teamName1View.getText().toString();
        String team2Name = teamName2View.getText().toString();
        gameOverAlert.setTitle("Game Over");


        if (mScoreTeamJG > mScoreTeamSwag) {
            gameOverAlert.setMessage("Team " + team1Name + " wins");
        }

        if (mScoreTeamJG < mScoreTeamSwag) {
            gameOverAlert.setMessage("Team " + team2Name + " wins");

        }


        if (mScoreTeamSwag == mScoreTeamJG) {
            gameOverAlert.setMessage("It's a tie");
        }

        gameOverAlert.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

        gameOverAlert.show();
        mScoreTeamJG = 0;
        mScoreTeamSwag = 0;
        displayForTeamJG(mScoreTeamJG);
        displayForTeamSwag(mScoreTeamSwag);


    }
}