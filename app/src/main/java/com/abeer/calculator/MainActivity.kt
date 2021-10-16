package com.abeer.calculator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var txtCalculator: TextView
    private lateinit var btnAdd1 : Button
    private lateinit var btnSub2: Button
    private lateinit var btnMulti3: Button
    private lateinit var btnDiv4 : Button
    private lateinit var editTextNum1: EditText
    private lateinit var editTextNum2: EditText
    private lateinit var textResult1 : TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editTextN1 =findViewById<EditText>(R.id.editTextNum1)
       var editTextN2 = findViewById<EditText>(R.id.editTextNum2)
       var TextViewRes =findViewById<TextView>(R.id.textResult1)


        btnAdd1 = findViewById(R.id.btnAdd1)
        btnSub2 = findViewById(R.id.btnSub2)
        btnMulti3 = findViewById(R.id.btnMulti3)
        btnDiv4 = findViewById(R.id.btnDiv4)



        btnAdd1.setOnClickListener{

            textResult1.text =  mathOpration("add")
        }
        btnSub2.setOnClickListener{
            textResult1.text = mathOpration("sub")
        }
        btnMulti3.setOnClickListener{
            textResult1.text = mathOpration("multi")
        }
        btnDiv4.setOnClickListener{
            textResult1.text = mathOpration("div")
        }
    }




    fun mathOpration(operation: String): String {


        when (operation) {
            "add" -> return (editTextNum1.toString().toDouble() + editTextNum2.toString()
                .toDouble()).toString()

            "sub" -> return (editTextNum1.toString().toDouble() - editTextNum2.toString()
                .toDouble()).toString()

            "multiply" -> return (editTextNum1.toString().toDouble() * editTextNum2.toString()
                .toDouble()).toString()

            "divide" -> return (editTextNum1.toString().toDouble() / editTextNum2.toString()
                .toDouble()).toString()

            else -> return "no result"
        }


    }

}