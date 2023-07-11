package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtNumber;
    Button btnDelete,btnAccept,btnPercent,btn9,btn8,btn7,btnPlus,btn6,btn5,btn4,btnMinus,btn3,btn2,btn1,btnMultiplication,btnDot,btnEqual,btnZero,btnDivision;

    float mValueOne,mValueTwo;
    boolean Plus,Minus,Multiplication,Division;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDelete=findViewById(R.id.btnDelete);
        btnAccept=findViewById(R.id.btnAccept);
        btnPercent=findViewById(R.id.btnPercent);
        btn9=findViewById(R.id.btn9);
        btn8=findViewById(R.id.btn8);
        btn7=findViewById(R.id.btn7);
        btnPlus=findViewById(R.id.btnPlus);
        btn6=findViewById(R.id.btn6);
        btn5=findViewById(R.id.btn5);
        btn4=findViewById(R.id.btn4);
        btnMinus=findViewById(R.id.btnMinus);
        btn3=findViewById(R.id.btn3);
        btn2=findViewById(R.id.btn2);
        btn1=findViewById(R.id.btn1);
        btnMultiplication=findViewById(R.id.btnMultiplication);
        btnDot=findViewById(R.id.btnDot);
        btnEqual=findViewById(R.id.btnEqual);
        btnZero=findViewById(R.id.btnZero);
        btnDivision=findViewById(R.id.btnDivision);

        edtNumber=findViewById(R.id.edtNumber);

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText()+"DEL");
            }
        });
        btnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText()+"AC");
            }
        });
        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText()+"%");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText()+"9");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText()+"8");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText()+"7");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                mValueOne=Float.parseFloat(edtNumber.getText()+" ");
                Plus=true;
                edtNumber.setText(null);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText()+"6");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText()+"5");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText()+"4");
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne=Float.parseFloat(edtNumber.getText()+" ");
                Minus=true;
                edtNumber.setText(null);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText()+"3");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText()+"2");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText()+"1");
            }
        });
        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                mValueOne=Float.parseFloat(edtNumber.getText()+" ");
                Multiplication=true;
                edtNumber.setText(null);
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText()+".");
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                mValueTwo=Float.parseFloat(edtNumber.getText()+"");

                if(Plus==true) {
                 edtNumber.setText(mValueOne+mValueTwo+"");
                 Plus=false;
                }
                if(Minus==true) {
                    edtNumber.setText(mValueOne+mValueTwo+"");
                    Minus=false;
                }
                if(Multiplication==true) {
                    edtNumber.setText(mValueOne+mValueTwo+"");
                    Multiplication=false;
                }
                if(Division==true) {
                    edtNumber.setText(mValueOne+mValueTwo+"");
                    Division=false;
                }
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText()+"0");
            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                mValueOne=Float.parseFloat(edtNumber.getText()+" ");
                Division=true;
                edtNumber.setText(null);
            }
        });



    }
}