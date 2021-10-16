package com.tuwaiq.simplecalculatorapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

// !!تنبيه!! الشرح _احيانا_ ممكن يتحول لشرح تشبيهي مجازي تخيلي تصوري؛ لتثبيت المعنى بداخلي
class MainActivity : AppCompatActivity() {
    // ### Variables Declarations ###
    // (الأوعية اللي نحتاجها ال"متناسبة" مع الغاية منها)
    private lateinit var firstNumberEdiTex: EditText
    private lateinit var secondNumberEdiTex: EditText
    private var firstNumber: Double = 0.0
    private var secondNumber: Double = 0.0
    private var result: Double = 0.0
    private lateinit var addImaBut: ImageButton
    private lateinit var subImaBut: ImageButton
    private lateinit var mulImaBut: ImageButton
    private lateinit var divImaBut: ImageButton
    private lateinit var resultTextView: TextView

    // creating the application + starting it + starting & displaying the "Main" layout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ### Making Connections ###
        // Connecting the variables to the "dummy" or "empty" interface/design we previously made
        // فتح القنوات/الأنابيب بين: الأوعية اللي اخترناها والمادة اللي حتخش فيها
        firstNumberEdiTex = findViewById(R.id.ediTexFirstNumber)
        secondNumberEdiTex = findViewById(R.id.ediTexSecondNumber)
        addImaBut = findViewById(R.id.ImaButAddition)
        subImaBut = findViewById(R.id.ImaButSubtraction)
        mulImaBut = findViewById(R.id.ImaButMultiplication)
        divImaBut = findViewById(R.id.ImaButDivision)
        resultTextView = findViewById(R.id.texVieResult)

        //Below commented lines of code were a misunderstanding from my side, called a friend for help, الحمدلله then thanks to him i completed the last part with him, Thanks Abu Talal :3:
/*        firstNumberEdiTex.setOnClickListener {
            firstNumberEdiTex.setText(firstNumber.toInt())
            firstNumber = firstNumberEdiTex.text.toString().toDouble()
        }
        secondNumberEdiTex.setOnClickListener {
            firstNumberEdiTex.setText(secondNumber.toInt())
            secondNumber = secondNumberEdiTex.text.toString().toDouble()
        }*/

        // ### Making setOnClickListeners ###
        // Making the interface "listening"
        //هنا بنخلي الواجهة "تستمع" لمستخدمها
        // وكل سطر "استماع" نكتب بداخلها ايش حتسوي من ردة فعل
        addImaBut.setOnClickListener {
            firstNumber = firstNumberEdiTex.text.toString().toDouble()
            secondNumber = secondNumberEdiTex.text.toString().toDouble()
            result = maths(firstNumber, secondNumber) { n1, n2 -> n1 + n2 }
            resultTextView.text = result.toString()
        }
        subImaBut.setOnClickListener {
            firstNumber = firstNumberEdiTex.text.toString().toDouble()
            secondNumber = secondNumberEdiTex.text.toString().toDouble()
            result = maths(firstNumber, secondNumber) { n1, n2 -> n1 - n2 }
            resultTextView.text = result.toString()
        }
        mulImaBut.setOnClickListener {
            firstNumber = firstNumberEdiTex.text.toString().toDouble()
            secondNumber = secondNumberEdiTex.text.toString().toDouble()
            result = maths(firstNumber, secondNumber) { n1, n2 -> n1 * n2 }
            resultTextView.text = result.toString()
        }
        divImaBut.setOnClickListener {
            firstNumber = firstNumberEdiTex.text.toString().toDouble()
            secondNumber = secondNumberEdiTex.text.toString().toDouble()
            result = maths(firstNumber, secondNumber) { n1, n2 -> n1 / n2 }
            resultTextView.text = result.toString()
        }

        //resultTextView.text(result.toString())
        //resultTextView.text

        // IT'S NOT ALIVE YET!! IT'S NOT ALIVE YET!! || IT'S ALIVE !! IT'S ALIVE!!
        // T_T T_T || :P xP
    }

    // ### Functions Section ###

    // Lambda math function
    private fun maths(x: Double, y: Double, mathO: (n1: Double, n2: Double) -> Double): Double {
        return mathO(x,y)
    }
    //maths(13, 3.0) {n1, n2 -> n1/n2}
    //maths(13, 3.0) { n1, n2 -> n1+n2}
}


// searches & references:
/* 1
    seen these two lines while searching for one of the answers, can they work in Kotlin too? if yes, can they be considered as a better practice?
    n1 = (EditText)findViewById(R.id.editText)
    n2 = (EditText)findViewById(R.id.editText2)
*/
/* 2
    https://stackoverflow.com/questions/35445936/converting-a-edit-text-to-a-double-android
    following LoC i've found can be used to convert an "Edit Text" to a double, in android studio in Kotlin, reference is from above link
    edittext.text.toString().toDouble()
*/

/* 3
how to make edit text start or show with a value in android studio kotlin
YOURedittext.setText(theVariableYouWantToSet)
https://stackoverflow.com/questions/44493908/setting-text-in-edittext-kotlin
*/

/* 4
a method from previous Kotlin classes:
fun maths(x:Int,y:Double,mathO :(n1:Int,n2:Double) -> Double) {

    println(mathO(x,y))
}

maths(13, 3.0) {n1, n2 -> n1/n2 }
maths(13, 3.0) { n1, n2 -> n1 + n2 }
*/
