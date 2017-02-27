package com.alwin.udamiwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView colors, familyMembers, numbers, phrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        // Find the view that shows the numbers category
        numbers = (TextView)findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create a new intent to open the {@link ActivityNumbers}
                Intent numbersIntent = new Intent(MainActivity.this, ActivityNumbers.class);
                // Start the new activity
                startActivity(numbersIntent);

            }
        });

        // Find the view that shows the colors category
        colors = (TextView)findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link ActivityColors}
                Intent colorsIntent = new Intent(MainActivity.this, ActivityColors.class);
                // Start the new activity
                startActivity(colorsIntent);
            }
        });

        // Find the view that shows the family members category
        familyMembers = (TextView)findViewById(R.id.family);
        familyMembers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create a new intent to open the {@link ActivityFamily}
                Intent familyIntent = new Intent(MainActivity.this, ActivityFamily.class);
                // Start the new activity
                startActivity(familyIntent);
            }
        });

        // Find the view that shows the phrases category
        phrases = (TextView)findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create a new intent to open the {@link ActivityPhrases}
                Intent phrasesIntent = new Intent(MainActivity.this, ActivityPhrases.class);
                // Start the new activity
                startActivity(phrasesIntent);
            }
        });

    }
}