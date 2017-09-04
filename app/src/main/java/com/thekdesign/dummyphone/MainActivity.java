package com.thekdesign.dummyphone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_message = (TextView) findViewById(R.id.tv_message);
        if (getIntent().getData() != null) {
            tv_message.setText(getIntent().getData().toString());
        }
        else {
            tv_message.setText("No number enter");
        }

    }
}
