package com.example.jertestapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView SampleText;
    Button ButtonSample;

    int Index = 0;


    String [] SampleOutput = {
            "Failure teaches lesson",
            "Winners are once Losers",
            "Life always goes on",
            "There are no winners in a War",
            "Be Consistent",
            "It always depends on the situation",
            "Skills > Talent",
            "Gacha Addiction is Bad",
            "Late is better than Absent",
            "Always be humble"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        SampleText = findViewById(R.id.textViewMid);
        ButtonSample = findViewById(R.id.Resultbutton);

        ButtonSample.setOnClickListener(v -> {
            if (Index < SampleOutput.length) {
                SampleText.setText(SampleOutput[Index]);
                Index++;
            }

            if (Index >= SampleOutput.length) {
                ButtonSample.setEnabled(false); ButtonSample.setText("Finished");}
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



    }
}