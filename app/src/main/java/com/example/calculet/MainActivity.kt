package com.example.calculet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.calculet.R.*


class MainActivity : AppCompatActivity() {
    private lateinit var EditText1: EditText
    private lateinit var EditText2: EditText
    private lateinit var ButtonAdd: Button
    private lateinit var ButtonMin: Button
    private lateinit var ButtonDiv: Button
    private lateinit var ButtonCross: Button
    private lateinit var TextShow: TextView
    var num=0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        ButtonAdd = findViewById(id.btnAdd)
        ButtonMin = findViewById(id.btn)
        ButtonCross = findViewById(id.btnCross)
        ButtonDiv = findViewById(id.btnDiv)
        TextShow = findViewById(id.txtShow)
        EditText1 = findViewById(id.EdtText1)
        EditText2 = findViewById(id.EdtText2)


        ButtonAdd.setOnClickListener {
         num = ToAdd(EditText1,EditText2)
          TextShow.text=num.toString()
        }

        ButtonMin.setOnClickListener {
            num = ToMin(EditText1,EditText2)
            TextShow.text=num.toString()
        }

        ButtonCross.setOnClickListener {
            num = ToCross(EditText1,EditText2)
            TextShow.text=num.toString()
        }

        ButtonDiv.setOnClickListener {
             num = ToDiv(EditText1,EditText2)
            TextShow.text=num.toString()
        }


    }

}


    fun ToDoubel(Edit1: EditText): Double = Edit1.text.toString().toDouble()
    fun ToAdd(Edit1: EditText,Edit2:EditText): Double =
        (Edit1.text.toString().toDouble())+(Edit2.text.toString().toDouble())
    fun ToMin(Edit1: EditText,Edit2:EditText): Double =
        (Edit1.text.toString().toDouble())-(Edit2.text.toString().toDouble())
    fun ToCross(Edit1: EditText,Edit2:EditText): Double =
        (Edit1.text.toString().toDouble())*(Edit1.text.toString().toDouble())
    fun ToDiv(Edit1: EditText,Edit2:EditText): Double =
        (Edit1.text.toString().toDouble())/(Edit1.text.toString().toDouble())

