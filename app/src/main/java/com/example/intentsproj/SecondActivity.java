package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText num1,num2;
    TextView result;
    float res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        TextView txtVMsg1= findViewById(R.id.number1);
        txtVMsg1.setText(R.string.No1);

        TextView txtVMsg2= findViewById(R.id.number2);
        txtVMsg2.setText(R.string.No2);


        Button btn_plus=(Button) findViewById(R.id.plus);
        Button btn_minus=(Button)findViewById(R.id.minus);
        Button btn_divide=(Button)findViewById(R.id.divide);
        Button btn_multi=(Button)findViewById(R.id.multi);

        num1=(EditText) findViewById(R.id.editTextNumber);
        num2=(EditText) findViewById(R.id.editTextNumber3);


        result=(TextView) findViewById(R.id.ans);


        btn_plus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String num_1=num1.getText().toString();
                float Num1=Float.parseFloat(num_1);

                String num_2=num2.getText().toString();
                float Num2=Float.parseFloat(num_2);

                res=Num1+Num2;
                result.setText(Float.toString(res));
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String num_1=num1.getText().toString();
                float Num1=Float.parseFloat(num_1);

                String num_2=num2.getText().toString();
                float Num2=Float.parseFloat(num_2);

                res=Num1-Num2;
                result.setText(Float.toString(res));
            }
        });

        btn_multi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String num_1=num1.getText().toString();
                float Num1=Float.parseFloat(num_1);

                String num_2=num2.getText().toString();
                float Num2=Float.parseFloat(num_2);

                res=Num1*Num2;
                result.setText(Float.toString(res));
            }
        });

        btn_divide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String num_1=num1.getText().toString();
                float Num1=Float.parseFloat(num_1);

                String num_2=num2.getText().toString();
                float Num2=Float.parseFloat(num_2);

                res=Num1/Num2;
                result.setText(Float.toString(res));
            }
        });


    }
}