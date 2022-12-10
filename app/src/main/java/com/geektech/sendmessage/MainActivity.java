package com.geektech.sendmessage;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  EditText editText,editText2;
  Button button;
  TextView textView;
  Integer number;
  String s;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.edit_text);
        editText2 = findViewById(R.id.edit_text2);
        button=findViewById(R.id.button);

        button.setOnClickListener(view -> {
            s=editText.getText().toString();
            number= Integer.valueOf(editText2.getText().toString());
            for(int i=1;i<number;i++)
            {
                s+=" "+editText.getText().toString();
            }
                Intent intent = new Intent();
            intent.setAction(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, s);
            startActivity(intent);
        });
    }

}