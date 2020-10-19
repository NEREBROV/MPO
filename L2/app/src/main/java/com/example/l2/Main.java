package com.example.l2;

import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Main extends AppCompatActivity {
    private TextView generated_text;
    private Button generate_text;
    private TextView text_another;

    private Phrase PhraseGenerator = new Phrase();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generated_text = findViewById(R.id.generated_text);
        generate_text = findViewById(R.id.generator_button);
        text_another = findViewById(R.id.text_another);
        generated_text.setText("Всё что нам нужно - это "+PhraseGenerator.PhraseGen()+".");
        text_another.setText(PhraseGenerator.PhraseGen()+" - это всё что нам нужно.");
        text_another.setText(text_another.getText().toString().substring(0,1).toUpperCase() +text_another.getText().toString().substring(1));
        generate_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generated_text.setText("Всё что нам нужно - это "+PhraseGenerator.PhraseGen()+".");
                text_another.setText(PhraseGenerator.PhraseGen()+" - это всё что нам нужно.");
                text_another.setText(text_another.getText().toString().substring(0,1).toUpperCase() +text_another.getText().toString().substring(1));
            }
        });
    }

}