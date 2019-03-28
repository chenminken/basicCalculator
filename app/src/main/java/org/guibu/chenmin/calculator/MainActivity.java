package org.guibu.chenmin.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String number = "";
    private double num1 = 0;
    private double num2 = 0;
    private String symbol = "null";

    private TextView answerTV;
    private Button keyPad0,keyPad1,keyPad2,keyPad3,keyPad4,keyPad5,keyPad6,keyPad7,keyPad8,keyPad9;
    private Button keyPadAdd,keyPadMul,keyPadDiv,keyPadSub,keyPadClear,keyPadEqual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerTV = findViewById(R.id.answer_tv);

        keyPad0 = findViewById(R.id.key_0_btn);
        keyPad1 = findViewById(R.id.key_1_btn);
        keyPad2 = findViewById(R.id.key_2_btn);
        keyPad3 = findViewById(R.id.key_3_btn);
        keyPad4 = findViewById(R.id.key_4_btn);
        keyPad5 = findViewById(R.id.key_5_btn);
        keyPad6 = findViewById(R.id.key_6_btn);
        keyPad7 = findViewById(R.id.key_7_btn);
        keyPad8 = findViewById(R.id.key_8_btn);
        keyPad9 = findViewById(R.id.key_9_btn);

        keyPadClear = findViewById(R.id.key_ce_btn);
        keyPadAdd = findViewById(R.id.key_add_btn);
        keyPadSub = findViewById(R.id.key_sub_btn);
        keyPadMul = findViewById(R.id.key_mul_btn);
        keyPadDiv = findViewById(R.id.key_div_btn);
        keyPadEqual = findViewById(R.id.key_equal_btn);

        answerTV.setOnClickListener(this);

        keyPad0.setOnClickListener(this);
        keyPad1.setOnClickListener(this);
        keyPad2.setOnClickListener(this);
        keyPad3.setOnClickListener(this);
        keyPad4.setOnClickListener(this);
        keyPad5.setOnClickListener(this);
        keyPad6.setOnClickListener(this);
        keyPad7.setOnClickListener(this);
        keyPad8.setOnClickListener(this);
        keyPad9.setOnClickListener(this);

        keyPadClear.setOnClickListener(this);
        keyPadAdd.setOnClickListener(this);
        keyPadSub.setOnClickListener(this);
        keyPadMul.setOnClickListener(this);
        keyPadDiv.setOnClickListener(this);
        keyPadEqual.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.answer_tv:
                break;
            case R.id.key_0_btn:
                number = number + "0";
                answerTV.setText(number);
                break;
            case R.id.key_1_btn:
                number = number + "1";
                answerTV.setText(number);
                break;
            case R.id.key_2_btn:
                number = number + "2";
                answerTV.setText(number);
                break;
            case R.id.key_3_btn:
                number = number + "3";
                answerTV.setText(number);
                break;
            case R.id.key_4_btn:
                number = number + "4";
                answerTV.setText(number);
                break;
            case R.id.key_5_btn:
                number = number + "5";
                answerTV.setText(number);
                break;
            case R.id.key_6_btn:
                number = number + "6";
                answerTV.setText(number);
                break;
            case R.id.key_7_btn:
                number = number + "7";
                answerTV.setText(number);
                break;
            case R.id.key_8_btn:
                number = number + "8";
                answerTV.setText(number);
                break;
            case R.id.key_9_btn:
                number = number + "9";
                answerTV.setText(number);
                break;
            case R.id.key_ce_btn:
                num1 = 0;
                num2 = 0;
                answerTV.setText("0");
                number = "";
                break;
            case R.id.key_add_btn:
                symbol = "+";
                if (number.equals("")){
                    answerTV.setText("Please set number first");
                    break;
                }
                num1 = Integer.parseInt(number);
                number = "";
                break;
            case R.id.key_sub_btn:
                symbol = "-";
                if (number.equals("")){
                    answerTV.setText("Please set number first");
                    break;
                }
                num1 = Integer.parseInt(number);
                number = "";
                break;
            case R.id.key_mul_btn:
                symbol = "*";
                if (number.equals("")){
                    answerTV.setText("Please set number first");
                    break;
                }
                num1 = Integer.parseInt(number);
                number = "";
                break;
            case R.id.key_div_btn:
                symbol = "/";
                if (number.equals("")){
                    answerTV.setText("Please set number first");
                    break;
                }
                num1 = Integer.parseInt(number);
                number = "";
                break;
            case R.id.key_equal_btn:
                if (number.equals("")){
                    num2 = 0;
                } else{
                    num2 = Integer.parseInt(number);

                }
                number = "";
                if (symbol.equals("null")) {
                    answerTV.setText("Answer unchange");
                    break;
                }
                switch (symbol){
                    case "+":
                        answerTV.setText("answer: " + (num1+num2));
                        break;
                    case "-":
                        answerTV.setText("answer: " + (num1-num2));
                        break;
                    case "*":
                        answerTV.setText("answer: " + (num1*num2));
                        break;
                    case "/":
                        if (num2 == 0){
                            answerTV.setText("could not divided by zero.");
                            break;
                        }
                        answerTV.setText("answer: " + (num1/num2));
                        break;

                }

        }
    }
}
