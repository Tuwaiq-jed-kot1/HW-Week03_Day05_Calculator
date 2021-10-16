package com.example.Calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btn4: Button
    private lateinit var et1: EditText
    private lateinit var et2: EditText
    private lateinit var tv: TextView
    var num1: Int = 0
    var num2: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1 = findViewById(R.id.button1)
        btn2 = findViewById(R.id.button2)
        btn3 = findViewById(R.id.button3)
        btn4 = findViewById(R.id.button4)
        et1 = findViewById(R.id.editTextNumber1)
        et2 = findViewById(R.id.editTextNumber2)
        tv = findViewById(R.id.textView)


        btn1.setOnClickListener {
            Num()
            tv.text = (num1 + num2).toString()

        }
        btn2.setOnClickListener {
            Num()
            tv.text = (num1 - num2).toString()

        }
        btn3.setOnClickListener {
            Num()
            tv.text = (num1 * num2).toString()

        }
        btn4.setOnClickListener {
            Num()
            if (num2 != 0) {
                tv.text = (num1 / num2).toString()
            } else {
                tv.text = 0.toString()
                Toast.makeText(this, "second number can't be zero!", Toast.LENGTH_SHORT).show()
            }
        }

    }

    fun Num() {
        if (!et1.text.isNullOrEmpty() && !et2.text.isNullOrEmpty()) {
            num1 = et1.text.toString().toInt()
            num2 = et2.text.toString().toInt()

        } else {
            Toast.makeText(this, "can't be empty!", Toast.LENGTH_SHORT).show()
        }

    }
}



