package com.example.courtcounter1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    String winner = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the team A score by 3.
     */
    public void increaseABy3(View view){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the team A score by 2.
     */
    public void increaseABy2(View view){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the team A score by 1.
     */
    public void freeThrowA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(scoreTeamA);

    }

    /**
     * Increase the team B score by 3.
     */
    public void increaseBBy3(View view){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the team B score by 2.
     */
    public void increaseBBy2(View view){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the team B score by 1.
     */
    public void freeThrowB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(score);
    }

    public void resetScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        winner = "";
        displayResult(winner);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void winner(View v){
        if(scoreTeamA>scoreTeamB) winner = "Team A Wins";
        else if (scoreTeamA == scoreTeamB) winner = "Draw";
        else winner = "Team B Wins";
        displayResult(winner);
    }

    public void displayResult(String result) {
        TextView scoreView = (TextView) findViewById(R.id.winner);
        scoreView.setText(result);
    }
}