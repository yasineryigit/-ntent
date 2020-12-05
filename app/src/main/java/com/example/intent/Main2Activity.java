package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {
    Intent i2;
    TextView textView2;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        i2 = new Intent(Main2Activity.this,MainActivity.class);
        textView2 = (TextView) findViewById(R.id.textView2);
        Intent receiverIntent = getIntent();
        name = receiverIntent.getStringExtra("nameKey");
        textView2.setText("Hi! " + name +" :)");
    }

    public void firstScreen(View v){
        startActivity(i2);
    }
}
