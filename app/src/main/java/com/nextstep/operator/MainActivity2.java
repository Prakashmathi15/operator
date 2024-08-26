package com.nextstep.operator;
//check package name

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvResult = findViewById(R.id.tv_result);


        Intent intent = getIntent();
        String number1 = intent.getStringExtra("number1");
        String operator = intent.getStringExtra("operator");
        String number2 = intent.getStringExtra("number2");


        double num1 = Double.parseDouble(number1);
        double num2 = Double.parseDouble(number2);
        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;

            default:
                tvResult.setText("Error: Invalid operator");
                return;
        }


        tvResult.setText("Result: " + result);
    }
  //onclick-homescreen in xml
    public void homeScreen(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
