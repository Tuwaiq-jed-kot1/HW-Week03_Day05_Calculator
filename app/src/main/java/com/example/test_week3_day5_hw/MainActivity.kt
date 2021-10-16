package com.example.test_week3_day5_hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val sumButton = findViewById(R.id.sumBtn) as Button
        val subButton = findViewById(R.id.subBut) as Button
        val mulButton = findViewById(R.id.mulBut) as Button
        val divButton = findViewById(R.id.divBut) as Button
        val num1EditText = findViewById(R.id.num1Field) as EditText
        val num2EditText = findViewById(R.id.num2Field) as EditText
        val resultTextView = findViewById(R.id.mathResult) as TextView


        sumButton.setOnClickListener {
            resultTextView.setText(mathOperation(num1EditText,num2EditText,"+"))
        }

        subButton.setOnClickListener {
            resultTextView.setText(mathOperation(num1EditText,num2EditText,"-"))
        }

        mulButton.setOnClickListener {
            resultTextView.setText(mathOperation(num1EditText,num2EditText,"*"))
        }

        divButton.setOnClickListener {
            resultTextView.setText(mathOperation(num1EditText,num2EditText,"/"))
        }
    }
}

fun EditText.setInputToZero(){
    if(this.text.toString().length == 0){
        this.setText("0")
    }
}

fun mathOperation(num1:EditText,num2:EditText,mathOperator:String):String {
    num1.setInputToZero()
    num2.setInputToZero()
    val intNum1 = num1.text.toString().toDoubleOrNull()
    val intNum2 = num2.text.toString().toDoubleOrNull()

    if (intNum1 == null || intNum2 == null) {
        return "out of range"
    } else {
        when (mathOperator) {
            "+" -> return "%.3f".format((intNum1 + intNum2))
            "-" -> return "%.3f".format((intNum1 - intNum2))
            "*" -> return "%.3f".format((intNum1 * intNum2))
            "/" -> return if(intNum2!=0.0) "%.3f".format((intNum1 / intNum2)) else "Can't divide by zero"
        }
        return ""
    }
}



