package com.marah.mycalcolator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var num1Txt: EditText
    lateinit var num2Txt: EditText
    private lateinit var result: TextView
    lateinit var sub: Button
    lateinit var add: Button
    lateinit var mul: Button
    lateinit var div: Button
    lateinit var clear: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num1Txt = findViewById(R.id.num1)
        num2Txt = findViewById(R.id.num2)
        result = findViewById(R.id.result)
        sub = findViewById(R.id.sub)
        add = findViewById(R.id.add)
        mul = findViewById(R.id.mult)
        div = findViewById(R.id.div)
        clear = findViewById(R.id.clear)

        num1Txt.setHint("num 1")
        num2Txt.setHint("num 2")




        add.setOnClickListener {
            val firstNum = num1Txt.text.toString().toDouble()
            val secondNum = num2Txt.text.toString().toDouble()
            addOperation(firstNum, secondNum)
            checkErrors(firstNum, secondNum)
        }
        sub.setOnClickListener {
            val firstNum = num1Txt.text.toString().toDouble()
            val secondNum = num2Txt.text.toString().toDouble()
            subOperation(firstNum, secondNum)
            checkErrors(firstNum, secondNum)
        }
        mul.setOnClickListener {
            val firstNum = num1Txt.text.toString().toDouble()
            val secondNum = num2Txt.text.toString().toDouble()
            mulOperation(firstNum, secondNum)
            checkErrors(firstNum, secondNum)
        }
        div.setOnClickListener {
            val firstNum = num1Txt.text.toString().toDouble()
            val secondNum = num2Txt.text.toString().toDouble()
            divOperation(firstNum, secondNum)
            checkErrors(firstNum, secondNum)
        }
        clear.setOnClickListener {
            num1Txt.setText(" ")
            num2Txt.setText(" ")
            result.setText("")
        }
    }

    private fun checkErrors(num1: Double, num2: Double) {
        if (num1Txt.text.isNullOrEmpty() && num2Txt.text.isNullOrEmpty()) {
            Toast.makeText(this, "You should enter 2 numbers", Toast.LENGTH_LONG).show()
        }
        if (num2 == 0.0) {
            Toast.makeText(this, "You should not divide by 0", Toast.LENGTH_LONG).show()
        }
    }

    private fun addOperation(firstNum: Double, secondNum: Double) {
        val myResult = firstNum + secondNum
        result.text = myResult.toString()
    }

    private fun subOperation(firstNum: Double, secondNum: Double) {
        val myResult = firstNum - secondNum
        result.text = myResult.toString()
    }

    private fun mulOperation(firstNum: Double, secondNum: Double) {
        val myResult = firstNum * secondNum
        result.text = myResult.toString()
    }

    private fun divOperation(firstNum: Double, secondNum: Double) {
        val myResult = "%.3f".format((firstNum / secondNum))
        result.text = myResult
    }
}