package com.example.checkbox2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private CheckBox milkCheckBox, sugarCheckBox, waterCheckBox;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btnId);

        milkCheckBox = findViewById(R.id.milkId);
        sugarCheckBox = findViewById(R.id.sugarId);
        waterCheckBox = findViewById(R.id.waterId);

        resultTextView = findViewById(R.id.resultId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();

                if(milkCheckBox.isChecked()) {
                    String value = milkCheckBox.getText().toString();
                    stringBuilder.append(value + " is ordered\n");
                } if(sugarCheckBox.isChecked()) {
                    String value = sugarCheckBox.getText().toString();
                    stringBuilder.append(value + " is ordered\n");
                } if(waterCheckBox.isChecked()) {
                    String value = waterCheckBox.getText().toString();
                    stringBuilder.append(value + " is ordered\n");
                }

                resultTextView.setText(stringBuilder);
            }
        });


    }
}