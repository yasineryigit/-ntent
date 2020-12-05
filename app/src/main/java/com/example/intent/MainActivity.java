package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Intent i1;
    String name;
    EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.editText1);
        i1 = new Intent(MainActivity.this,Main2Activity.class);

    }
    public void secondScreen(View v){

        //Eğer isim girilmişse
        if(!editText1.getText().toString().matches("")){
            i1.putExtra("nameKey",editText1.getText().toString());
            startActivity(i1);
        }else{//İsim girilmemişse
            Toast.makeText(MainActivity.this,"Please enter a valid name", Toast.LENGTH_SHORT).show();
        }

    }

}
