package com.manpreet.numbersystemconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputDecimal, inputBinary;
    TextView output;
    Button convertToDecimal, convertToBinary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputDecimal = findViewById(R.id.input_decimal);
        inputBinary = findViewById(R.id.input_binary);
        output = findViewById(R.id.output);
        convertToBinary = findViewById(R.id.convert_to_binary);
        convertToDecimal = findViewById(R.id.comvert_to_decimal);

        convertToBinary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertToBinary();
            }
        });

        convertToDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertToDecimal();
            }
        });
    }

    private void convertToDecimal() {
        int decimal = Integer.parseInt(inputBinary.getText().toString(), 2);
        output.setText(String.valueOf(decimal));
    }

    private void convertToBinary() {
        int decimal = Integer.parseInt(inputDecimal.getText().toString());
        String binary = Integer.toBinaryString(decimal);
        output.setText(binary);
    }
}