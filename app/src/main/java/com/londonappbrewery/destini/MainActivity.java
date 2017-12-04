package com.londonappbrewery.destini;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.onClick;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
     private TextView mStoryTextView;
     private Button mButtonTop;
    private Button mButtonBottom;
    private int currentStoryLocation=1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView=(TextView) findViewById(R.id.storyTextView);
        mButtonTop=(Button) findViewById(R.id.buttonTop);
        mButtonBottom=(Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if (currentStoryLocation==1 || currentStoryLocation==2){
                    mStoryTextView.setText(getString(R.string.T3_Story));
                    currentStoryLocation=3;
                    mButtonTop.setText(getString(R.string.T3_Ans1));
                    mButtonBottom.setText(getString(R.string.T3_Ans2));
                }
                else if (currentStoryLocation==3){
                    mStoryTextView.setText(getString(R.string.T6_End));
                    currentStoryLocation=6;

                }

            }

        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


        mButtonBottom.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (currentStoryLocation==1 ){
                    mStoryTextView.setText(getString(R.string.T2_Story));
                    currentStoryLocation=2;
                    mButtonTop.setText(getString(R.string.T2_Ans1));
                    mButtonBottom.setText(getString(R.string.T2_Ans2));
                }
                else if (currentStoryLocation==2){
                    mStoryTextView.setText(getString(R.string.T4_End));
                    currentStoryLocation=4;

                }
                else{
                    mStoryTextView.setText(getString(R.string.T5_End));
                    currentStoryLocation=5;
                }

            }
        });

    }
}
