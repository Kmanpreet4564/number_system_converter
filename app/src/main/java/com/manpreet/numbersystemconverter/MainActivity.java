package com.manpreet.numbersystemconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputField;
    TextView output;
    Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputField = findViewById(R.id.input_field);
        output = findViewById(R.id.output);
        convert = findViewById(R.id.button_convert);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertToBinary();
            }
        });
    }

    private void convertToBinary() {
        int decimal = Integer.parseInt(inputField.getText().toString());
        String binary = Integer.toBinaryString(decimal);
        output.setText(binary);
    }
}