package com.abdullah_bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etHeight, etWeight;
    Button btnCalc;
    TextView labelBMI;
    EditText tvBMI;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etHeight = findViewById(R.id.etHeight);
        etWeight = findViewById(R.id.etWeight);
        btnCalc = findViewById(R.id.btnCalc);
        labelBMI = findViewById(R.id.labelBMI);
        tvBMI = findViewById(R.id.tvBMI);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etHeight.getText().toString())) {
                    etHeight.setError("Please Enter your height");
                    return;
                }
                if (TextUtils.isEmpty(etWeight.getText().toString())) {
                    etWeight.setError("Please Enter your weight");
                    return;
                }

                double etHeight1, etWeight2;
                etHeight1 = Double.parseDouble(etHeight.getText().toString());
                etWeight2 = Double.parseDouble(etWeight.getText().toString());
                Abdullah_BMI Result = new Abdullah_BMI(etHeight1, etWeight2);
                double myBMI = Result.calcBMI();
                tvBMI.setText(Double.toString(myBMI));
            }
        });
    }
}