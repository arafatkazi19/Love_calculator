package com.example.asus.lovecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    TextView oname,pname;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oname = (TextView) findViewById(R.id.name_edit);
        pname = (TextView) findViewById(R.id.partner_edit);
        btn = (Button) findViewById(R.id.btn_cal);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("LoveCalculator" , "Button has been pressed");

                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(101);

                Toast.makeText(MainActivity.this,"Your Love Rate is :" +number,Toast.LENGTH_LONG).show();

                Log.d("LoveCalculator" , "Your Love rate is: " +number);
    }




    });
    }
}

