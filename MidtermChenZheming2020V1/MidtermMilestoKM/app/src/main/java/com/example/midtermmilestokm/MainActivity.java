package com.example.midtermmilestokm;

import androidx.appcompat.app.AppCompatActivity;
import java.text.DecimalFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnconvert = (Button) findViewById(R.id.btnconvert);
        btnconvert.setOnClickListener(new View.OnClickListener() {
            @Override



            public void onClick(View view) {
                EditText textBoxMiles = (EditText) findViewById(R.id.importMiles);
                TextView textBoxKm = (EditText) findViewById(R.id.importKm);
                double Miles = Double.parseDouble(textBoxMiles.getText().toString());
                double Km = Miles/1.609;
                DecimalFormat formatVal = new DecimalFormat("###.###");
                textBoxKm.setText(formatVal.format(Km));
            }
        });

    }
}