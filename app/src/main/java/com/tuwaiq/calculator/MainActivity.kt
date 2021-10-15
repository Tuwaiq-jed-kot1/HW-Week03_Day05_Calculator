package com.tuwaiq.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var firstNum: EditText
    lateinit var secondNum: EditText
    lateinit var addButton: Button
    lateinit var subButton: Button
    lateinit var multiButton: Button
    lateinit var divButton: Button
    lateinit var resultTxt: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstNum= findViewById(R.id.num1)
        secondNum= findViewById(R.id.num2)
        addButton= findViewById(R.id.btnAdd)
        subButton= findViewById(R.id.btnSub)
        multiButton= findViewById(R.id.btnMulti)
        divButton= findViewById(R.id.btnDiv)
        resultTxt= findViewById(R.id.txtResult)

        addButton.setOnClickListener {
            val sum = firstNum.text.toString().toDouble() + secondNum.text.toString().toDouble()
            resultTxt.text= sum.toString()

        }
        subButton.setOnClickListener {
            val sub = firstNum.text.toString().toDouble() - secondNum.text.toString().toDouble()
            resultTxt.text= sub.toString()

        }
        multiButton.setOnClickListener {
            val multi = firstNum.text.toString().toDouble() * secondNum.text.toString().toDouble()
            resultTxt.text= multi.toString()

        }
        divButton.setOnClickListener {
            val div = firstNum.text.toString().toDouble() / secondNum.text.toString().toDouble()
            resultTxt.text= div.toString()

        }
    }
}