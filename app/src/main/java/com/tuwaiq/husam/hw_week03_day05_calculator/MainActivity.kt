package com.tuwaiq.husam.hw_week03_day05_calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var numEditText1: EditText
    private lateinit var numEditText2: EditText
    private lateinit var textView: TextView
    private lateinit var buttonAdd: Button
    private lateinit var buttonSub: Button
    private lateinit var buttonMultiply: Button
    private lateinit var buttonDivide: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonAdd = findViewById(R.id.btnAdd)
        buttonSub = findViewById(R.id.btnSub)
        buttonMultiply = findViewById(R.id.btnMulti)
        buttonDivide = findViewById(R.id.btnDivide)
        numEditText1 = findViewById(R.id.editTextNumber1)
        numEditText2 = findViewById(R.id.editTextNumber2)
        textView = findViewById(R.id.txtNumber)

        buttonAdd.setOnClickListener {
            textView.text = calculate(R.string.add)
        }
        buttonSub.setOnClickListener {
            textView.text = calculate(R.string.sub)
        }
        buttonMultiply.setOnClickListener {
            textView.text = calculate(R.string.multiply)
        }
        buttonDivide.setOnClickListener {
            textView.text = calculate(R.string.divide)
        }
    }

    fun numToDouble(editText: EditText): Double = editText.text.toString().toDouble()


    fun calculate(operation: Int): String {
        var str = "Please Choose Correct Numbers"
        try {
            str = when (operation) {
                R.string.add -> (numToDouble(numEditText1) + numToDouble(numEditText2)).toString()
                R.string.sub -> (numToDouble(numEditText1) - numToDouble(numEditText2)).toString()
                R.string.multiply -> (numToDouble(numEditText1) * numToDouble(numEditText2)).toString()
                R.string.divide -> (numToDouble(numEditText1) / numToDouble(numEditText2)).toString()
                else -> ""
            }
        } catch (e: Exception) {

        }
        return str
    }
}