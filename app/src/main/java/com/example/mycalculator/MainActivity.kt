package com.example.mycalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    private lateinit var num1: EditText
    private lateinit var num2: EditText
    private lateinit var result: TextView
    private lateinit var addBut: Button
    private lateinit var subBut: Button
    private lateinit var mulBut: Button
    private lateinit var devBut: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        num1 = findViewById(R.id.firstNumber)
        num2 = findViewById(R.id.secondNumber)
        result = findViewById(R.id.result)
        addBut = findViewById(R.id.btnAdd)
        subBut = findViewById(R.id.btnSub)
        mulBut = findViewById(R.id.btnMulti)
        devBut = findViewById(R.id.btnDev)

        addBut.setOnClickListener(){

            val n1 = num1.text.toString().toInt()
            val n2 = num2.text.toString().toInt()
            val res = (n1 + n2)
            result.text = res.toString()


        }
        subBut.setOnClickListener(){

            val n1 = num1.text.toString().toInt()
            val n2 = num2.text.toString().toInt()
            val res = (n1 - n2)
            result.text = res.toString()


        }
        mulBut.setOnClickListener(){

            val n1 = num1.text.toString().toInt()
            val n2 = num2.text.toString().toInt()
            val res = (n1 * n2)
            result.text = res.toString()


        }
        devBut.setOnClickListener(){

            val n1 = num1.text.toString().toInt()
            val n2 = num2.text.toString().toInt()
            val res = (n1 / n2)
            result.text = res.toString()


        }


    }


}