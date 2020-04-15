package com.example.twoactivities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    private EditText enteredText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        enteredText = findViewById(R.id.editText);

        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null) {
            actionbar.setDisplayHomeAsUpEnabled(true);
        }
        Intent intent = getIntent();
        if (intent.hasExtra("title")) {
            String title = intent.getStringExtra("title");
            if (title != null) {
                Log.d("intent title extra", title);
                if (actionbar != null) {
                    actionbar.setTitle(title);
                }
            }
        }
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edit_text_taker = enteredText.getText().toString(); // Container-na, vor vercni plaintexti grvac informacian
                Intent i = new Intent();
                i.putExtra("description", edit_text_taker);
                setResult(RESULT_OK, i);
                finish();
            }
        });
    }
}
