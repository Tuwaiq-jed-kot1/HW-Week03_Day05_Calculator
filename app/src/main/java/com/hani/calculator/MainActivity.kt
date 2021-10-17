package com.hani.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    private lateinit var firstNumber: EditText
    private lateinit var secondNumber: EditText
    private lateinit var addButton: Button
    private lateinit var subButton: Button
    private lateinit var mulitButton: Button
    private lateinit var devideButton: Button
    private lateinit var resultTextView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstNumber = findViewById(R.id.firstNumber)
        secondNumber = findViewById(R.id.secondNumber)
        addButton = findViewById(R.id.btnAdd)
        subButton = findViewById(R.id.btnSub)
        mulitButton = findViewById(R.id.btnMulti)
        devideButton = findViewById(R.id.btnDiv)
        resultTextView = findViewById(R.id.resultId)


        fun add() {
            var num1 = firstNumber.text.toString().toDouble()
            var num2 = secondNumber.text.toString().toDouble()
            resultTextView.text = (num1 + num2).toString()
        }

        fun sub() {
            var num1 = firstNumber.text.toString().toDouble()
            var num2 = secondNumber.text.toString().toDouble()
            resultTextView.text = (num1 - num2).toString()
        }

        fun multi() {
            var num1 = firstNumber.text.toString().toDouble()
            var num2 = secondNumber.text.toString().toDouble()
            resultTextView.text = (num1 * num2).toString()
        }

        fun devide() {
            var num1 = firstNumber.text.toString().toDouble()
            var num2 = secondNumber.text.toString().toDouble()
            resultTextView.text = (num1 / num2).toString()
        }

        addButton.setOnClickListener {
            add()
        }
        subButton.setOnClickListener {
            sub()
        }
        mulitButton.setOnClickListener {
            multi()
        }
        devideButton.setOnClickListener {
            devide()
        }

    }
}