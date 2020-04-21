package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonDivision, buttonSub, buttonMultiply, buttonCalc, buttonDecimal, buttonClear;
    EditText edit1;

    float Value1, Value2;
    boolean makeAddition, makeSubtract, makeMultiplication, makeDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonDivision = (Button) findViewById(R.id.buttonDivision);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        buttonCalc = (Button) findViewById(R.id.buttonCalc);
        buttonDecimal = (Button) findViewById(R.id.buttonDecimal);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        edit1 = (EditText) findViewById(R.id.edit1);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "9");
            }
        });
        buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+".");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit1 == null) {
                    edit1.setText("");
                } else {
                    Value1 = Float.parseFloat(edit1.getText() + "");
                    makeAddition = true;
                    edit1.setText(null);
                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(edit1.getText() + "");
                makeSubtract = true ;
                edit1.setText(null);
            }
        });
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(edit1.getText() + "");
                makeMultiplication = true ;
                edit1.setText(null);
            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(edit1.getText()+"");
                makeDivision = true ;
                edit1.setText(null);
            }
        });
        buttonCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value2 = Float.parseFloat(edit1.getText() + "");
                if (makeAddition == true) {
                    edit1.setText(Value1 + Value2 +"");
                    makeAddition =false;
                }
                if (makeSubtract == true){
                    edit1.setText(Value1 - Value2 +"");
                    makeSubtract=false;
                }
                if (makeMultiplication == true){
                    edit1.setText(Value1 * Value2 + "");
                    makeMultiplication=false;
                }
                if (makeDivision == true){
                    edit1.setText(Value1 / Value2+"");
                    makeDivision=false;
                }
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText("");
            }
        });
    }
}
