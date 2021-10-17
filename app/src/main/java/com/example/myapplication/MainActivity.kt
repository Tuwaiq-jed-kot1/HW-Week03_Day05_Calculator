package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.Global.getString
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var resulttxt:TextView
    lateinit var textView1:EditText
    lateinit var textView2:EditText
    lateinit var button5: Button
    lateinit var button2: Button
    lateinit var button3: Button
    lateinit var button4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resulttxt=findViewById(R.id.resulttxt)
        textView1=findViewById(R.id.textView1)
        textView2=findViewById(R.id.textView1)
        button5=findViewById(R.id.button5)
        button2=findViewById(R.id.button2)
        button3=findViewById(R.id.button3)
        button4=findViewById(R.id.button4)

        var num1= textView1.text.toString().toDouble()
        var num2= textView2.text.toString().toDouble()



button5.setOnClickListener{
    resulttxt.text= (num1.toString().toDouble() + num2.toString().toDouble()).toString()
}
button2.setOnClickListener{
    resulttxt.text= (num1.toString().toDouble() - num2.toString().toDouble()).toString()
}
button3.setOnClickListener{
    resulttxt.text= (num1.toString().toDouble() * num2.toString().toDouble()).toString()
}
button4.setOnClickListener{
    resulttxt.text= (num1.toString().toDouble() / num2.toString().toDouble()).toString()
}

    }






}