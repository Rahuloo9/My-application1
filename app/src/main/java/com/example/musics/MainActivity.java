package com.example.musics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText et,et2;
TextView tv;
Button bt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=(EditText)findViewById(R.id.edit_text);
        et2=findViewById(R.id.edit_text1);
        bt=findViewById(R.id.button);
        tv=findViewById(R.id.text_view);


    bt.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            int n=Integer.parseInt(et.getText().toString());
            int n2=Integer.parseInt(et2.getText().toString());
            int result=n+n2;
            tv.setText(Integer.toString(result));
        }
    });}
}
