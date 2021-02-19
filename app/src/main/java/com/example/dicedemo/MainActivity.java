package com.example.dicedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // we have two images left dice and right dice
        // link the code to those two image view inside your layout.....(activity main)
        final ImageView  CDice = findViewById(R.id.computer_dice);
        final ImageView UDice = findViewById(R.id.user_dice);
        Button HButton = findViewById(R.id.High_Button);
        Button LButton = findViewById(R.id.Low_Button);

        final ImageView output1 = findViewById(R.id.computer_win);
        final ImageView output2 = findViewById(R.id.tie);
        final ImageView output3 = findViewById(R.id.user_win);
        //-------------------------------------------------------------------

        final int [] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};
        // we want to pick one of the dices in array randomly and replace it with left and right
        // image view inside your app!
        // Click listener look for an event on your view components.
        HButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rand = new Random();
                int randuserDie = rand.nextInt(6);
                int randcompDie = rand.nextInt(6);
                UDice.setImageResource(diceArray[randuserDie]);
                CDice.setImageResource(diceArray[randcompDie]);
                if(randuserDie == randcompDie){
                    output1.setVisibility(View.INVISIBLE);
                    output2.setVisibility(View.INVISIBLE);
                    output3.setVisibility(View.INVISIBLE);
                    output2.setVisibility(View.VISIBLE);
                }else if(randuserDie> randcompDie){
                    output1.setVisibility(View.INVISIBLE);
                    output2.setVisibility(View.INVISIBLE);

                    output3.setVisibility(View.VISIBLE);
                }else{
                    output1.setVisibility(View.INVISIBLE);
                    output2.setVisibility(View.INVISIBLE);
                    output3.setVisibility(View.INVISIBLE);
                    output1.setVisibility(View.VISIBLE);
                }
                Log.d("UDice",String.valueOf(randuserDie));
                Log.d("CDice",String.valueOf(randcompDie));


                // we need to create a random integer for picking the dices randomly!



            }
        });
        LButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rand = new Random();
                int randuserDie = rand.nextInt(6);
                int randcompDie = rand.nextInt(6);
                UDice.setImageResource(diceArray[randuserDie]);
                CDice.setImageResource(diceArray[randcompDie]);

                if(randuserDie == randcompDie){
                    output1.setVisibility(View.INVISIBLE);
                    output2.setVisibility(View.INVISIBLE);
                    output3.setVisibility(View.INVISIBLE);
                    output2.setVisibility(View.VISIBLE);
                }else if(randuserDie < randcompDie){
                    output1.setVisibility(View.INVISIBLE);
                    output2.setVisibility(View.INVISIBLE);
                    output3.setVisibility(View.VISIBLE);
                }else{
                    output1.setVisibility(View.INVISIBLE);
                    output2.setVisibility(View.INVISIBLE);
                    output3.setVisibility(View.INVISIBLE);
                    output1.setVisibility(View.VISIBLE);
                }
                Log.d("UDice",String.valueOf(randuserDie));
                Log.d("CDice",String.valueOf(randcompDie));



            }
        });
    }



}
