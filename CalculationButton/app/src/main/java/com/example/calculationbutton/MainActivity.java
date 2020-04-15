package com.example.calculationbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText entered_number;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entered_number = findViewById(R.id.entered_number);
        result = findViewById(R.id.result);
        findViewById(R.id.plus).setOnClickListener(this);
        findViewById(R.id.multiply).setOnClickListener(this);
        findViewById(R.id.divide).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int number = 0;

        try {
            number = Integer.parseInt(entered_number.getText().toString()); //get-ov vercnum em text@ yev konvertacia em anum
        }
        catch (NumberFormatException nfe) //Text exception
        {
            System.out.println("Could not parse " + nfe);
        }
        switch (v.getId())
        {
            case R.id.plus:
                number = number + 2;
                result.setText(String.valueOf(number)); // convertacnum em string-i yev texadrum em result-i mej
                break;
            case R.id.multiply:
                number = number * 2;
                result.setText(String.valueOf(number));
                break;
            case R.id.divide:
                number = number / 2;
                result.setText(String.valueOf(number));
                break;
        }
    }
}
