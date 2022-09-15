package com.example.multiplicationtables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView2;
    EditText editText;
    Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView2= findViewById(R.id.textView2);
        editText= findViewById(R.id.editTextNumber);
        button= findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = editText.getText().toString();
                int n = Integer.parseInt(number);
                String result="";
                for (int i=1;i<=10;i++){
                    result+=  n + " " + " X " + " " + i + " " + "=" + " "+n*i +"\n";
                    textView2.setText(result);
                }


            }
        });

    }
}