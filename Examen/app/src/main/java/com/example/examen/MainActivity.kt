package com.example.examen

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    private val historial = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val n1 = findViewById<EditText>(R.id.et1)
        val n2 = findViewById<EditText>(R.id.et2)
        val n3 = findViewById<EditText>(R.id.et3)
        val r1 = findViewById<RadioButton>(R.id.r1)
        val r2 = findViewById<RadioButton>(R.id.r2)
        val r3 = findViewById<RadioButton>(R.id.r3)
       // val r4 = findViewById<RadioButton>(R.id.divi)
        val tv1 = findViewById<TextView>(R.id.tv1)
        val his = findViewById<TextView>(R.id.txtr)
        val button = findViewById<Button>(R.id.button)


        button.setOnClickListener {
            tv1.text = ""

            val num1 = n1.text.toString().toIntOrNull()
            val num2 = n2.text.toString().toIntOrNull()
            val num3 = n3.text.toString().toIntOrNull()

            if (num1 != null && num2 != null && num3 != null) {
                if (r1.isChecked) {
                    val resultado = num1 + num2 + num3
                    tv1.text = "Resultado: $resultado"
                    val rest = resultado.toString()
                    historial.add(rest)
                    val rh = historial.toString()
                    his.text = (rh)
                }
                if (r2.isChecked) {
                    val resultado = num1 - num2 - num3
                    tv1.text = "Resultado: $resultado"
                    val rest = resultado.toString()
                    historial.add(rest)
                    val rh = historial.toString()
                    his.text = (rh)
                }
                if (r3.isChecked) {
                    val resultado = num1 * num2 * num3
                    tv1.text = "Resultado: $resultado"
                    val rest = resultado.toString()
                    historial.add(rest)
                    val rh = historial.toString()
                    his.text = (rh)
                }
                //if (r4.isChecked && num2 != 0) {
                   // val resultado = num1 / num2
                   //tv1.text = "Resultado: $resultado"

               // } //else if (r4.isChecked) {
                    //tv1.text = "Error: n2 cannot be 0"
                //}

                n1.text.clear()
                n2.text.clear()
                n3.text.clear()
            } else {
                tv1.text = "Error"
            }

        }
    }

}