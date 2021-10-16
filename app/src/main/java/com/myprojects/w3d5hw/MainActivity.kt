package com.myprojects.w3d5hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

private const val savedInstanceStateKey = "key"
class MainActivity : AppCompatActivity() {
    private lateinit var firstNumberEditText: EditText
    private lateinit var secondNumberEditText: EditText
    private lateinit var addButton: Button
    private lateinit var subtractButton: Button
    private lateinit var multiplyButton: Button
    private lateinit var divideButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstNumberEditText = findViewById(R.id.firstNumberEditText)
        secondNumberEditText = findViewById(R.id.secondNumberEditText)
        addButton = findViewById(R.id.addButton)
        subtractButton = findViewById(R.id.subtractButton)
        multiplyButton = findViewById(R.id.multiplyButton)
        divideButton = findViewById(R.id.divideButton)
        resultTextView = findViewById(R.id.resultTextView)

        addButton.setOnClickListener {
            val firstNum = firstNumberEditText.text.toString()
            val secondNum = secondNumberEditText.text.toString()
            if (firstNum.isEmpty() || secondNum.isEmpty()){
                Toast.makeText(this,"Enter numbers, please",Toast.LENGTH_SHORT).show()
            }else{
                resultTextView.text = (firstNum.toDouble() + secondNum.toDouble()).toString()
            }
        }

        subtractButton.setOnClickListener {
            val firstNum = firstNumberEditText.text.toString()
            val secondNum = secondNumberEditText.text.toString()
            if (firstNum.isEmpty() || secondNum.isEmpty()){
                Toast.makeText(this,"Enter numbers, please",Toast.LENGTH_SHORT).show()
            }else{
                resultTextView.text = (firstNum.toDouble() - secondNum.toDouble()).toString()
            }
        }

        multiplyButton.setOnClickListener {
            val firstNum = firstNumberEditText.text.toString()
            val secondNum = secondNumberEditText.text.toString()
            if (firstNum.isEmpty() || secondNum.isEmpty()){
                Toast.makeText(this,"Enter numbers, please",Toast.LENGTH_SHORT).show()
            }else{
                resultTextView.text = (firstNum.toDouble() * secondNum.toDouble()).toString()
            }
        }

        divideButton.setOnClickListener {
            val firstNum = firstNumberEditText.text.toString()
            val secondNum = secondNumberEditText.text.toString()
            if (firstNum.isEmpty() || secondNum.isEmpty()){
                Toast.makeText(this,"Enter numbers, please",Toast.LENGTH_SHORT).show()
            }else{
                resultTextView.text = (firstNum.toDouble() / secondNum.toDouble()).toString()
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        val result = resultTextView.text.toString()
        outState.putString(savedInstanceStateKey,result)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        val result = savedInstanceState.getString(savedInstanceStateKey)
        resultTextView.text = result
    }
}