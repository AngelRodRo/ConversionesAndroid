package com.example.conversiones;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnConvert = (Button) findViewById(R.id.btnConvert);
            btnConvert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    calcular();
                }
            });
    }

    public void calcular(){
        EditText centigrados = (EditText) findViewById(R.id.edtCentigrados);
        EditText kelvin = (EditText) findViewById(R.id.edtKelvin);
        EditText farenheit = (EditText) findViewById(R.id.edtFahrenheit);
        EditText ranking = (EditText) findViewById(R.id.edtRanking);

        kelvin.setText(String.valueOf(Double.parseDouble(centigrados.getText().toString()) + 273.15));
        farenheit.setText(String.valueOf(Double.parseDouble(centigrados.getText().toString()) * 1.8 + 32));
        ranking.setText(String.valueOf(Double.parseDouble(centigrados.getText().toString()) * 1.8 + 491.27));


    }
}
