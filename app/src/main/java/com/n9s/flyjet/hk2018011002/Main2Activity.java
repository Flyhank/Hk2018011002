package com.n9s.flyjet.hk2018011002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tv = findViewById(R.id.textView);
        Intent it = getIntent();
        Bundle bd = it.getExtras();
        String str = bd.getString("DATA");
        tv.setText(str);

    }
}
