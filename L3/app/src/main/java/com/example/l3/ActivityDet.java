package com.example.l3;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ActivityDet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_det);

        Bundle arg = getIntent().getExtras();
        String[] details = arg.getStringArray("ARG_ITEM_DETAILS");
        AdapterTwo adapterTwo = new AdapterTwo(this,details);

        TextView tv1 = findViewById(R.id.textView);
        RecyclerView rv1 = findViewById(R.id.recyclerview);
        tv1.setText(details[0]);
        rv1.setLayoutManager(new LinearLayoutManager(this));
        rv1.setAdapter(adapterTwo);

    }
}
