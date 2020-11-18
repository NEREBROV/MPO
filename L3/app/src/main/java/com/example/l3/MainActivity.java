package com.example.l3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private ContentFiller content = new ContentFiller();
    private Adapter_Regular rViewAdapter = new Adapter_Regular(this, content.ITEMS);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rView = findViewById(R.id.list);
        rView.setLayoutManager(new LinearLayoutManager(this));
        rView.setAdapter(rViewAdapter);
    }
}