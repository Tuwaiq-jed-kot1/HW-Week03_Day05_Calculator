package com.tuwaiq.calculator_hwday5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.text.InputType
import android.text.TextUtils.isEmpty

class Calculator:  AppCompatActivity() {
private lateinit var number1 :EditText
private lateinit var number2 :EditText
private lateinit var btn_sum :Button
private lateinit var btn_multiplication :Button
private lateinit var btn_minus :Button
private lateinit var btn_division :Button
private lateinit var result:TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator_layout)
        number1 = findViewById(R.id.number1)
        number2 = findViewById(R.id.number2)
        btn_sum = findViewById(R.id.btnSum)
        btn_division = findViewById(R.id.btnDivision)
        btn_minus = findViewById(R.id.btnMinus)
        btn_multiplication = findViewById(R.id.btnMultiplication)
        result = findViewById(R.id.result)

        val num1 = number1.text
        val num2 = number2.text

        btn_sum.setOnClickListener() {
            if(inputIsEmpty(num1.toString(),num2.toString()))
            result.text= ("%.1f".format(num1.toString().toDouble()+num2.toString().toDouble()))

        }
        btn_multiplication.setOnClickListener() {
            if(inputIsEmpty(num1.toString(),num2.toString()))
                result.text= ("%.1f".format(num1.toString().toDouble()*num2.toString().toDouble()))
        }

        btn_minus.setOnClickListener() {
            if(inputIsEmpty(num1.toString(),num2.toString()))
                result.text= ("%.1f".format(num1.toString().toDouble()-num2.toString().toDouble()))
        }

        btn_division.setOnClickListener() {
          if(num2.toString().toDouble() != 0.0)
              result.text= ("%.1f".format(num1.toString().toDouble()/num2.toString().toDouble()))
          else number2.error=" undefined - can't divide by 0"


        }

    }

     fun inputIsEmpty(input1:String,input2:String):Boolean {
     if(input1.isNotEmpty())
         if(input2.isNotEmpty())
             return true
     else {
         number2.error=" enter a number"
             return false
         }
     else {
         number1.error=" enter a number"
         return false
     }

     }

}