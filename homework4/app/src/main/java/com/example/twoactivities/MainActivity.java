package com.example.twoactivities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView text;
    int REQUEST_CODE = 1; // REQUEST_CODE - nra hamar e, vorpeszi imananq te vor activity-e dimim mer MainActivity-in

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);

        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class); // intent@ - nra hamar e , vorpeszi menq karoxananq 2-rd activity-n start anenq yev karoxananq 2 activity-neri kod@ irar kapakcenq(vor irar het ashxaten)
        switch(v.getId()) {
            case R.id.button1:
                intent.putExtra("title", "Window1");
                startActivityForResult(intent, REQUEST_CODE);
                break;
            case R.id.button2:
                intent.putExtra("title", "window2");
                startActivityForResult(intent, REQUEST_CODE);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK) { // stugum en
            if (data != null && data.hasExtra("description")) { // im 2-rd activity-i parunakutyunna
                String description = data.getStringExtra("description");
                if (description != null) {
                    Log.d("Test message", description);
                    text.setText(description); // poxum em text@
                }
            }
        }
    }
}
