package com.example.magic8ballfun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    private ImageView ballIV;
    private TextView answerTV;

    private String[] answersArray = {"It is certain", "It is decidedly so", "Without a doubt", "Yes definitely", "You may rely on it", "As I see it, yes",
            "Most likely", "Outlook good", "Yes", "Signs point to yes", "Reply hazy try again", "Ask again later",
            "Better not tell you now", "Cannot predict now", "Concentrate and ask again", "Don't count on it",
            "My reply is no", "My sources say no", "Outlook not so good", "Very doubtful"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ballIV = findViewById(R.id.btn);

        answerTV = findViewById(R.id.answers);




        ballIV.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //create a switch statement
        switch (v.getId()){
            case R.id.btn:

                int randomNum = new Random().nextInt(answersArray.length);
                answerTV.setText(answersArray[randomNum]);

                break;
        }
    }
}