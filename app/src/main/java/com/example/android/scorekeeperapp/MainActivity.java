package com.example.android.scorekeeperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int goalsTeamA = 0;
    int yellowCardsTeamA = 0;
    int redCardsTeamA = 0;
    int goalsTeamB = 0;
    int yellowCardsTeamB = 0;
    int redCardsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when the goal button for Team A is clicked.
     */
    public void goalForTeamA(View v) {
        goalsTeamA = goalsTeamA + 1;
        displayGoalsForTeamA (goalsTeamA);
    }

    /**
     * This method is called when the Yellow Card button for Team A is clicked.
     */
    public void yellowCardForTeamA(View v) {
        yellowCardsTeamA = yellowCardsTeamA + 1;
        displayYellowCardsForTeamA (yellowCardsTeamA);
    }

    /**
     * This method is called when the Red Card button for Team A is clicked.
     */
    public void redCardForTeamA(View v) {
        redCardsTeamA = redCardsTeamA + 1;
        displayRedCardsForTeamA (redCardsTeamA);
    }

    /**
     * Displays goals for Team A.
     */
    public void displayGoalsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goal);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays yellow cards for Team A.
     */
    public void displayYellowCardsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow_card);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays red cards for Team A.
     */
    public void displayRedCardsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red_card);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the goal button for Team B is clicked.
     */
    public void goalForTeamB(View v) {
        goalsTeamB = goalsTeamB + 1;
        displayGoalsForTeamB (goalsTeamB);
    }

    /**
     * This method is called when the Yellow Card button for Team B is clicked.
     */
    public void yellowCardForTeamB(View v) {
        yellowCardsTeamB = yellowCardsTeamB + 1;
        displayYellowCardsForTeamB (yellowCardsTeamB);
    }

    /**
     * This method is called when the Red Card button for Team B is clicked.
     */
    public void redCardForTeamB(View v) {
        redCardsTeamB = redCardsTeamB + 1;
        displayRedCardsForTeamB (redCardsTeamB);
    }

    /**
     * Displays goals for Team B.
     */
    public void displayGoalsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goal);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays yellow cards for Team B.
     */
    public void displayYellowCardsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow_card);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays red cards for Team B.
     */
    public void displayRedCardsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red_card);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the reset button is clicked.
     */
    public void reset(View v) {
        goalsTeamA = 0;
        goalsTeamB = 0;
        yellowCardsTeamA = 0;
        yellowCardsTeamB = 0;
        redCardsTeamA = 0;
        redCardsTeamB = 0;
        displayGoalsForTeamA(goalsTeamA);
        displayYellowCardsForTeamA(yellowCardsTeamA);
        displayRedCardsForTeamA(redCardsTeamA);
        displayGoalsForTeamB(goalsTeamB);
        displayYellowCardsForTeamB(yellowCardsTeamB);
        displayRedCardsForTeamB(redCardsTeamB);
    }

}
