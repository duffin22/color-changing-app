package com.hfad.trialstuff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView headerText;
    View layout;
    Button buttonOne, buttonTwo, buttonThree;
    String[] lastClicks= {"", ""};




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        headerText=(TextView) findViewById(R.id.textView);
        layout=(View) findViewById(R.id.overall);
        buttonOne=(Button) findViewById(R.id.button1);
        buttonTwo=(Button) findViewById(R.id.button2);
        buttonThree=(Button) findViewById(R.id.button3);

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                headerText.setTextColor(getResources().getColor(R.color.buttonRed));
                headerText.setText("Red");
                setBackground();
                setBigBackground();
                lastClicks[0]=lastClicks[1];
                lastClicks[1]="red";
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                headerText.setTextColor(getResources().getColor(R.color.buttonBlue));
                headerText.setText("Blue");
                setBackground();
                setBigBackground();
                lastClicks[0]=lastClicks[1];
                lastClicks[1]="blue";
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                headerText.setTextColor(getResources().getColor(R.color.buttonYellow));
                headerText.setText("Yellow");
                setBackground();
                setBigBackground();
                lastClicks[0]=lastClicks[1];
                lastClicks[1]="yellow";
            }
        });
    }

    protected void setBackground() {
        if (lastClicks[1].equals("red")) {
            headerText.setBackgroundResource(R.drawable.button_red_background);;
        } else if (lastClicks[1].equals("blue")) {
            headerText.setBackgroundResource(R.drawable.button_blue_background);;
        } else if (lastClicks[1].equals("yellow")) {
            headerText.setBackgroundResource(R.drawable.button_yellow_background);;
        }
    }

    protected void setBigBackground() {
        if (lastClicks[0].equals("red")) {
            layout.setBackgroundColor(getResources().getColor(R.color.buttonRed));;
        } else if (lastClicks[0].equals("blue")) {
            layout.setBackgroundColor(getResources().getColor(R.color.buttonBlue));;
        } else if (lastClicks[0].equals("yellow")) {
            layout.setBackgroundColor(getResources().getColor(R.color.buttonYellow));;
        }
    }

}
