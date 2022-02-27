package com.example.engineercalculator

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_extended_screen.*
import net.objecthunter.exp4j.ExpressionBuilder

class extended_screen : AppCompatActivity() {
   // val change: Button =findViewById(R.id.change)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extended_screen)
        supportActionBar?.hide()
       change.setOnClickListener {
           val intent=Intent(this,frontcalculator::class.java)
                      startActivity(intent)
       }



       AC.setOnClickListener {
           inputbox.setText("")
           answer1.setText("")
       }
       del.setOnClickListener {

       }
       one.setOnClickListener {
           inputbox.text=(inputbox.text.toString() + "1")
       }
       two.setOnClickListener {
           //Toast.makeText(this, "Double", Toast.LENGTH_SHORT).show()
           inputbox.text=inputbox.text.toString() + "2"
       }
       three.setOnClickListener {
           inputbox.text=inputbox.text.toString() + "3"
       }
       four.setOnClickListener {
           inputbox.text=inputbox.text.toString() + "4"
       }
       five.setOnClickListener {
           inputbox.text=inputbox.text.toString() + "5"
       }
       six.setOnClickListener {
           inputbox.text=inputbox.text.toString() + "6"
       }
       seven.setOnClickListener {
           inputbox.text=inputbox.text.toString() + "7"
       }
       eight.setOnClickListener {
           inputbox.text=inputbox.text.toString() + "8"
       }
       nine.setOnClickListener {
           inputbox.text=inputbox.text.toString() + "9"
       }
       zero.setOnClickListener {
           inputbox.text=inputbox.text.toString() + "0"
       }
       dot.setOnClickListener {
           inputbox.text=inputbox.text.toString() + "."

       }
       //operators
       plus.setOnClickListener {
           val str: String = inputbox.text.toString()
           if (!str.get(index = str.length - 1).equals("+")) {
               inputbox.text = (inputbox.text.toString() + "+")
           }
       }
       minus.setOnClickListener {
           val str: String = inputbox.text.toString()
           if (!str.get(index = str.length - 1).equals("-")) {
               inputbox.text = (inputbox.text.toString() + "-")
           }
       }
       mul.setOnClickListener {
           val str: String = inputbox.text.toString()
           if (!str.get(index = str.length - 1).equals("*")) {
               inputbox.text = (inputbox.text.toString() + "*")
           }
       }
       division.setOnClickListener {
           val str: String = inputbox.text.toString()
           if (!str.get(index = str.length - 1).equals("/")) {
               inputbox.text = (inputbox.text.toString() + "/")
           }

       }
       percent.setOnClickListener {
           val str: String = inputbox.text.toString()
           if (!str.get(index = str.length - 1).equals("%")) {
               inputbox.text = (inputbox.text.toString() + "%")
           }
       }
       brac1.setOnClickListener {
           inputbox.text=(inputbox.text.toString() + "(")
       }
       brac2.setOnClickListener {
           inputbox.text=(inputbox.text.toString() + ")")
       }
       log.setOnClickListener {
           inputbox.text=(inputbox.text.toString() + "log")
       }

       sin.setOnClickListener {
           inputbox.text=(inputbox.text.toString() + "sin")
       }
       cos.setOnClickListener {
           inputbox.text=(inputbox.text.toString() + "cos")
       }
       tan.setOnClickListener {
           inputbox.text=(inputbox.text.toString() + "tan")
       }



       equal.setOnClickListener {
           try {
               val expression = ExpressionBuilder(inputbox.text.toString()).build()
               val result = expression.evaluate()
               val longResult = result.toLong()
               if (result == longResult.toDouble()) {
                   //Toast.makeText(this, "Double", Toast.LENGTH_SHORT).show()
                   answer1.text = longResult.toString()
               } else
                   answer1.text = result.toString()

           } catch (e: Exception) {
               Toast.makeText(this, e.message, Toast.LENGTH_SHORT).show()

               Log.d("EXCEPTION", "Message: ${e.message}")
           }

       }










   }
}