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
  Integer s=0;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.text_view);
        editText=findViewById(R.id.edit_text);
        editText2 = findViewById(R.id.edit_text2);
        button=findViewById(R.id.button);

        button.setOnClickListener(view -> {
            textView.setText(editText2.getText().toString());
            s= Integer.valueOf(textView.getText().toString());
            for(int i=0;i<s;i++) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, editText.getText().toString());
                startActivity(intent);
            }
        });
    }

}