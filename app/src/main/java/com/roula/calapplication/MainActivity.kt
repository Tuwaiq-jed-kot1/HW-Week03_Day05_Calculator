package com.roula.calapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var button1: Button
    lateinit var button2: Button
    lateinit var button3: Button
    lateinit var button4: Button
    lateinit var t1 : EditText
    lateinit var t2: EditText
    lateinit var v: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1 = findViewById(R.id.addition_btn)
        button2 = findViewById(R.id.multipy_btn)
        button3 = findViewById(R.id.divide_btn)
        button4 = findViewById(R.id.subtract_btn)
        t1 = findViewById(R.id.num1)
        t2 = findViewById(R.id.num2)
        v = findViewById(R.id.result)

        button1.setOnClickListener {
            val fNum = t1.text.toString().toDouble()
            val sNum = t2.text.toString().toDouble()
            addOperation(fNum, sNum)
        }
        button4.setOnClickListener {
            val firstNum = t1.text.toString().toDouble()
            val secondNum = t2.text.toString().toDouble()
            subOperation(firstNum, secondNum)
        }
        button2.setOnClickListener {
            val firstNum = t1.text.toString().toDouble()
            val secondNum = t2.text.toString().toDouble()
            mulOperation(firstNum, secondNum)
        }
        button3.setOnClickListener {
            val firstNum = t1.text.toString().toDouble()
            val secondNum = t2.text.toString().toDouble()
            divOperation(firstNum, secondNum)
        }
    }
         fun addOperation(firstNum: Double, secondNum: Double) {
            val myResult = firstNum + secondNum
            v.text = myResult.toString()
        }

        fun subOperation(firstNum: Double, secondNum: Double) {
            val myResult = firstNum - secondNum
            v.text = myResult.toString()
        }

         fun mulOperation(firstNum: Double, secondNum: Double) {
            val myResult = firstNum * secondNum
            v.text = myResult.toString()
        }

         fun divOperation(firstNum: Double, secondNum: Double) {
            val myResult = "%.3f".format((firstNum / secondNum))
            v.text = myResult
        }
    }
