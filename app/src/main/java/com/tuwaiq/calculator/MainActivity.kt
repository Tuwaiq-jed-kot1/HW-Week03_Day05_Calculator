package com.tuwaiq.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var editTextN1: EditText
    private lateinit var editTextN2: EditText
    private lateinit var TextViewRes : TextView
    private lateinit var btnAdd : ImageButton
    private lateinit var btnSub : ImageButton
    private lateinit var btnMulti : ImageButton
    private lateinit var btnDiv : ImageButton



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextN1 = findViewById(R.id.editTextNum1)
        editTextN2 = findViewById(R.id.editTextNum2)
        TextViewRes = findViewById(R.id.textViewResult)

        btnAdd = findViewById(R.id.btnAddID)
        btnSub = findViewById(R.id.btnSubID)
        btnMulti = findViewById(R.id.btnMultiID)
        btnDiv = findViewById(R.id.btnDivID)


        btnAdd.setOnClickListener{
            TextViewRes.text =  mathOpration("add")
        }
        btnSub.setOnClickListener{
            TextViewRes.text = mathOpration("sub")
        }
        btnMulti.setOnClickListener{
            TextViewRes.text = mathOpration("multi")
        }
        btnDiv.setOnClickListener{
            TextViewRes.text = mathOpration("div")
        }
    }


    fun mathOpration(operation: String): String {


        when (operation) {
            "add" -> return (editTextN1.toString().toDouble() + editTextN2.toString()
                .toDouble()).toString()

            "sub" -> return (editTextN1.toString().toDouble() - editTextN2.toString()
                .toDouble()).toString()

            "multiply" -> return (editTextN1.toString().toDouble() * editTextN2.toString()
                .toDouble()).toString()

            "divide" -> return (editTextN1.toString().toDouble() / editTextN2.toString()
                .toDouble()).toString()

            else -> return "no result"
        }


    }

}
