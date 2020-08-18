package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button btnOK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btnOK = (Button) findViewById(R.id.btnok);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast= Toast.makeText(getApplicationContext(), "You just clicked the OK button", Toast.LENGTH_SHORT);
                toast.show();

                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(intent);

            }
        });

        TextView txtVMsg= findViewById(R.id.number1);
        txtVMsg.setText(R.string.No1);

        TextView txtVMsg2= findViewById(R.id.number2);
        txtVMsg2.setText(R.string.No2);

    }
}