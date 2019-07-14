package com.example.simplecalculator;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix
            , btnSeven, btnEight, btnNine, btnEqual, btnPlus, btnMinus, btnDivide, btnMultiply;

    TextInputEditText edtInputNumber;
    String inputNumber;

    int value1, value2;
    boolean addition, subtraction, division, multiplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnEqual = (Button) findViewById(R.id.btnEquals);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);

        edtInputNumber = (TextInputEditText) findViewById(R.id.edtInputNumber);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputNumber = edtInputNumber.getText().toString();
                edtInputNumber.setText(inputNumber + btnOne.getText().toString());
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputNumber = edtInputNumber.getText().toString();
                edtInputNumber.setText(inputNumber + btnTwo.getText().toString());
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputNumber = edtInputNumber.getText().toString();
                edtInputNumber.setText(inputNumber + btnThree.getText().toString());
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputNumber = edtInputNumber.getText().toString();
                edtInputNumber.setText(inputNumber + btnFour.getText().toString());
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputNumber = edtInputNumber.getText().toString();
                edtInputNumber.setText(inputNumber + btnFive.getText().toString());
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputNumber = edtInputNumber.getText().toString();
                edtInputNumber.setText(inputNumber + btnSix.getText().toString());
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputNumber = edtInputNumber.getText().toString();
                edtInputNumber.setText(inputNumber + btnSeven.getText().toString());
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputNumber = edtInputNumber.getText().toString();
                edtInputNumber.setText(inputNumber + btnEight.getText().toString());
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputNumber = edtInputNumber.getText().toString();
                edtInputNumber.setText(inputNumber + btnNine.getText().toString());
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 =  Integer.parseInt(edtInputNumber.getText().toString());
                edtInputNumber.setText(null);

                addition = true;

             }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Integer.parseInt(edtInputNumber.getText().toString());
                edtInputNumber.setText(null);

                subtraction = true;
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Integer.parseInt(edtInputNumber.getText().toString());
                edtInputNumber.setText(null);

                division = true;
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Integer.parseInt(edtInputNumber.getText().toString());
                edtInputNumber.setText(null);

                multiplication = true;
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(addition){
                    value2 = Integer.parseInt(edtInputNumber.getText().toString());
                    edtInputNumber.setText(value1 + value2 + "");
                    addition = false;
                }
                else if(subtraction) {
                    value2 = Integer.parseInt(edtInputNumber.getText().toString());
                    edtInputNumber.setText(value1 - value2 + "");
                    subtraction = false;
                }
                else if(division) {
                    value2 = Integer.parseInt(edtInputNumber.getText().toString());
                    edtInputNumber.setText(value1 / value2 + "");
                    division = false;
                }
                else if(multiplication) {
                    value2 = Integer.parseInt(edtInputNumber.getText().toString());
                    edtInputNumber.setText(value1 * value2 + "");
                    multiplication = false;
                }

            }
        });
    }
}
