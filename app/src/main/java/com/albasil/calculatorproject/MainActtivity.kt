package com.albasil.calculatorproject

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActtivity : AppCompatActivity() {

    private lateinit var _editTextNum1: EditText
    private lateinit var _editTextNum2: EditText

    private lateinit var sum: ImageButton
    private lateinit var mult: ImageButton
    private lateinit var sub: ImageButton
    private lateinit var div: ImageButton

    private lateinit var clear:Button

    private lateinit var showTotal: TextView
    private lateinit var _opretor: TextView


    private var total: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.maniactivity)






        _editTextNum1 = findViewById(R.id.editTextNumber1)
        _editTextNum2 = findViewById(R.id.editTextNumber2)

        showTotal = findViewById(R.id.textTotal)
        _opretor = findViewById(R.id.opretor)


        sum = findViewById(R.id.btnSum)
        sub = findViewById(R.id.btnSub)
        mult = findViewById(R.id.btnMult)
        div = findViewById(R.id.btnDiv)

        clear= findViewById(R.id.btnClear)




        clear.setOnClickListener {

            showTotal.text=""
            _opretor.text=""
            _editTextNum1.text.clear()
            _editTextNum2.text.clear()

        }


        sum.setOnClickListener {

             _opretor.setText(R.string.sumS)

            math("+")


        }


        sub.setOnClickListener {
             _opretor.setText(R.string.subS)

            math("-")


        }




        mult.setOnClickListener {
            _opretor.setText(R.string.mulS)


            math("*")


        }
        div.setOnClickListener {

            _opretor.setText(R.string.divS)

            math("/")


        }


    }

    fun math(opp: String) {


        if (_editTextNum1.text.isNotEmpty() && _editTextNum2.text.isNotEmpty()) {
            var num1 = _editTextNum1.text.toString().toDouble()
            var num2 = _editTextNum2.text.toString().toDouble()


            Toast.makeText(this, "opretor ( $opp )", Toast.LENGTH_SHORT).show()

            when (opp) {

                "+" -> {
                    total = (num1 + num2).toDouble()
                    showTotal.setText(total.toString())

                }
                "-" -> {
                    total = (num1 - num2).toDouble()
                    showTotal.setText(total.toString())

                }
                "*" -> {
                    total = (num1 * num2).toDouble()
                    showTotal.setText(total.toString())


                }
                "/" -> {
                    try {
                        total = (num1 / num2).toDouble()
                        showTotal.setText("%.2f".format(total).toString())
                    } catch (e: Exception) {
                        Toast.makeText(this, "$e", Toast.LENGTH_SHORT).show()
                    }

                }
                else -> {
                    Toast.makeText(this, "errroor", Toast.LENGTH_SHORT).show()



                }

            }


        } else {
            //showTotal.text=  "0.0"
            _editTextNum2.text.clear()
            _editTextNum1.text.clear()
            _opretor.text="?"

            Toast.makeText(this, "editText  is empty !!!", Toast.LENGTH_SHORT).show()
        }


    }

}