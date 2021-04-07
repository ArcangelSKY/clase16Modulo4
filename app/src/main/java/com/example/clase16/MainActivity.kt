package com.example.clase16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var boton : Button
    private lateinit var campo1 : EditText
    private lateinit var campo2 : EditText
    private lateinit var resultado : TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        campo1 = findViewById(R.id.et_campo1)
        campo2 = findViewById(R.id.et_campo2)
        resultado = findViewById(R.id.tv_resultado)
        boton = findViewById(R.id.button)

        boton.setOnClickListener {
            resultado.text = (campo1.text.toString().toInt() + campo2.text.toString().toInt()).toString()
        }

    }


}
