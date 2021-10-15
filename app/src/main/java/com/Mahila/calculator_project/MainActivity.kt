package com.Mahila.calculator_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var btnAdd: Button
    private lateinit var btnSub: Button
    private lateinit var btnDiv: Button
    private lateinit var btnMult: Button

    private lateinit var input1: EditText
    private lateinit var input2: EditText
    private lateinit var output: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd = findViewById(R.id.btnAdd)
        btnSub = findViewById(R.id.btnSub)
        btnMult = findViewById(R.id.btnMult)
        btnDiv = findViewById(R.id.btnDiv)

        input1 = findViewById(R.id.e1)
        input2 = findViewById(R.id.e2)
        output = findViewById(R.id.tV1)
        if (savedInstanceState!=null) {
            output.text=savedInstanceState.getString("output")
        }


        btnAdd.setOnClickListener {

            if (isNot_Blank()) output.text =
                "%.2f".format(
                    input1.text.toString().toDouble() + input2.text.toString()
                        .toDouble()
                )
        }

        btnSub.setOnClickListener {
            if (isNot_Blank()) output.text =
                "%.2f".format(
                    input1.text.toString().toDouble() - input2.text.toString()
                        .toDouble()
                )


        }

        btnDiv.setOnClickListener {
            if (isNot_Blank()) {
                if (input2.text.toString().toDouble() != 0.0) {
                    output.text = "%.2f".format(
                        input1.text.toString().toDouble() / input2.text.toString()
                            .toDouble()
                    )
                } else {
                    output.text = "It cannot be divided by zero"
                }
            }

        }

        btnMult.setOnClickListener {
            if (isNot_Blank()) output.text =
                "%.2f".format(
                    input1.text.toString().toDouble() * input2.text.toString()
                        .toDouble()
                )
        }

    }

    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        super.onSaveInstanceState(savedInstanceState)
        savedInstanceState.putString("output", output.text.toString())
    }

    fun isNot_Blank(): Boolean {
        return if (input1.text.toString().isNotBlank() && input2.text.toString()
                .isNotBlank()
        ) {
            true
        } else {

            Toast.makeText(this, "Please, Enter two numbers.", Toast.LENGTH_SHORT).show()
            false
        }

    }
}

