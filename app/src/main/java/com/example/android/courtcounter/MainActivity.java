package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamB(scoreB);
        displayForTeamA(scoreA);
    }

    private void displayForTeamA (int score) {

        TextView teamA_score = (TextView) findViewById(R.id.scoreteamA);
        teamA_score.setText(String.valueOf(score));
    }

    private void displayForTeamB (int score) {

        TextView teamB_score = (TextView) findViewById(R.id.scoreteamB);
        teamB_score.setText(String.valueOf(score));
    }

    public void submit3point (View view) {
        scoreA += 3;
        displayForTeamA(scoreA);
    }

    public void submit2point (View view) {
        scoreA += 2;
        displayForTeamA(scoreA);
    }

    public void submit1point (View view) {
        scoreA += 1;
        displayForTeamA(scoreA);
    }

    public void submit3pointb (View view) {
        scoreB += 3;
        displayForTeamB(scoreB);
    }

    public void submit2pointb (View view) {
        scoreB += 2;
        displayForTeamB(scoreB);
    }

    public void submit1pointb (View view) {
        scoreB += 1;
        displayForTeamB(scoreB);
    }
    public void reset(View v) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamB(scoreB);
        displayForTeamA(scoreA);
    }
}
