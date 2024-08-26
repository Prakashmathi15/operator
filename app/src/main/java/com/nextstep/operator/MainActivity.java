package com.nextstep.operator;
//check package name


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etNumber1, etOperator, etNumber2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber1 = findViewById(R.id.et_number1);
        etOperator = findViewById(R.id.et_operator);
        etNumber2 = findViewById(R.id.et_number2);
    }

    public void newsScreen(View view) {
        String number1 = etNumber1.getText().toString();
        String operator = etOperator.getText().toString();
        String number2 = etNumber2.getText().toString();

        Intent i = new Intent(this, MainActivity2.class);
        i.putExtra("number1", number1);
        i.putExtra("operator", operator);
        i.putExtra("number2", number2);
        startActivity(i);
    }
}
