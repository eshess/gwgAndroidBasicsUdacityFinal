package com.example.android.quizapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuAdapter;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mp = MediaPlayer.create(this,R.raw.hey);
        setContentView(R.layout.activity_main);
    }
    public void onClickQ1(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),getString(R.string.responseOne), Toast.LENGTH_LONG);
        toast.show();
        mp.start();
    }
    public void onClickQ2(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),getString(R.string.responseTwo), Toast.LENGTH_LONG);
        toast.show();
        mp.start();
    }
    public void onClickQ3(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),getString(R.string.responseThree), Toast.LENGTH_LONG);
        toast.show();
        mp.start();
    }
    public void onClickQ5(View view) {
        RadioButton radio = (RadioButton) findViewById(R.id.fiveA);
        String toastResponse;
        if(radio.isChecked()) {
            toastResponse = getString(R.string.responseFiveA);
        }else {
            toastResponse = getString(R.string.responseFiveB);
        }
        Toast toast = Toast.makeText(getApplicationContext(), toastResponse, Toast.LENGTH_LONG);
        toast.show();
        mp.start();
    }
    public void onClickSubmit(View view) {
        int score = 1;
        CheckBox checkCorrect = (CheckBox) findViewById(R.id.questionOneCorrect);
        if (checkCorrect.isChecked()) {
            score++;
        }
        RadioButton radioCorrect = (RadioButton) findViewById(R.id.questionTwoCorrect);
        if (radioCorrect.isChecked()) {
            score++;
        }
        radioCorrect = (RadioButton) findViewById(R.id.questionThreeCorrect);
        if (radioCorrect.isChecked()) {
            score++;
        }
        radioCorrect = (RadioButton) findViewById(R.id.questionFiveCorrect);
        if (radioCorrect.isChecked()) {
            score++;
        }
        String message = getString(R.string.submitResponse,score);
        Toast toast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG);
        toast.show();
        mp.start();
    }
}
