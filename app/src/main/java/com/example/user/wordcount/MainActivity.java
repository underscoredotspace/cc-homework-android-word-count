package com.example.user.wordcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtWordsToCount;
    Button btnCountWords;
    TextView lblWordCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtWordsToCount = findViewById(R.id.txtWordsToCount);
        btnCountWords = findViewById(R.id.btnCountWords);
        lblWordCount = findViewById(R.id.lblWordCount);

    }

    public void onBtnCountWordsClick(View button) {
        int wordCount = WordCounter.count(txtWordsToCount.getText().toString());
        String wordCountString = Integer.toString(wordCount) + " words";
        lblWordCount.setText(wordCountString);
    }
}
