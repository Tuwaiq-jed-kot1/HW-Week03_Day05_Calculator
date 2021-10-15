package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var  TextView : TextView
    lateinit var  EditText1 : EditText
    lateinit var  EditText2 : EditText
    lateinit var  subButtons : Button
    lateinit var  sumButtons : Button
    lateinit var  multiButtons : Button
    lateinit var  DivButtons : Button

   /* private val quizViewModel: QuizViewModel by lazy {
        ViewModelProvider(this).get(QuizViewModel::class.java)
    }*/

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        EditText1 = findViewById(R.id.number1)
        EditText2 = findViewById(R.id.number2)
        TextView = findViewById(R.id.txResult)
        subButtons = findViewById(R.id.button)
        sumButtons = findViewById(R.id.button2)
        multiButtons = findViewById(R.id.button3)
        DivButtons = findViewById(R.id.button4)

        EditText1.setOnClickListener {
            val text = EditText1.text

            // Showing the user input
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }
        EditText2.setOnClickListener {
            val text = EditText2.text

            // Showing the user input
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }
        TextView.setOnClickListener {
            val text = TextView.text

            // Showing the user input--
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }
        subButtons.setOnClickListener {
           val n1 = EditText1.text.toString().toInt()
           val n2 = EditText2.text.toString().toInt()
           btnsub(n1,n2)
        }

        sumButtons.setOnClickListener {
            val n1 = EditText1.text.toString().toInt()
            val n2 = EditText2.text.toString().toInt()
            btnsum(n1,n2)
        }

        multiButtons.setOnClickListener {
            val n1 = EditText1.text.toString().toInt()
            val n2 = EditText2.text.toString().toInt()
            btnmulti(n1,n2)
        }

        DivButtons.setOnClickListener {
            val n1 = EditText1.text.toString().toInt()
            val n2 = EditText2.text.toString().toInt()
            btndiv(n1,n2)
        }

    }

/*    private fun appendOnExperssion(string : String , c : Boolean) {
        if (c){
           TextView.text = ""
            EditText1 .selectAll() EditText2 .append(string)

        }else{

        }
    }*/

    fun btnsub(n1: Int, n2:Int) {
        val resultmath = n1 - n2
        TextView.text = resultmath.toString()
    }

    fun btnsum(n1: Int, n2:Int) {
       val resultmath = n1 + n2
        TextView.text = resultmath.toString()
    }

    fun btnmulti(n1: Int, n2:Int) {
        val resultmath = n1 * n2
        TextView.text = resultmath.toString()
    }

    fun btndiv(n1: Int, n2:Int) {
        val resultmath = n1 / n2
        TextView.text = resultmath.toString()
    }


}