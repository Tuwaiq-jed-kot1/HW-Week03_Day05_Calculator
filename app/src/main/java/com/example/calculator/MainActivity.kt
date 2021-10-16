package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textResult: TextView
    private lateinit var addbtn: Button
    private lateinit var subbtn: Button
    private lateinit var multiplybtn: Button
    private lateinit var divbtn: Button
    private lateinit var Number1: EditText
    private lateinit var Number2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textResult = findViewById(R.id.result)
        addbtn = findViewById(R.id.addbtn)
        subbtn = findViewById(R.id.subbtn)
        multiplybtn = findViewById(R.id.multiplybtn)
        divbtn = findViewById(R.id.divbtn)
        Number2 = findViewById(R.id.editTextNumber2)
        Number1 = findViewById(R.id.editTextNumber1)
        addbtn.setOnClickListener {
            val num1 = Number1.text.toString().toInt()
            val num2 = Number2.text.toString().toInt()
            val result = num1 + num2
            textResult.text = result.toString()
        }
        subbtn.setOnClickListener {
            val num1 = Number1.text.toString().toInt()
            val num2 = Number2.text.toString().toInt()
            val result = num1 - num2
            textResult.text = result.toString()
        }
        multiplybtn.setOnClickListener {
            val num1 = Number1.text.toString().toInt()
            val num2 = Number2.text.toString().toInt()
            val result = num1 * num2
            textResult.text = result.toString()
        }

        divbtn.setOnClickListener {
            val num1 = Number1.text.toString().toInt()
            val num2 = Number2.text.toString().toInt()
            val result = num1 / num2
            textResult.text = result.toString()
        }


    }
}
