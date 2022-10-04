package com.empresa.componentes

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btn1 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pantalla1)

        btn1 = findViewById(R.id.btn1)
        btn1.setOnClickListener {
            Log.e("Mensaje", "Pulsante el boton 1")
        }

        btn1.setOnClickListener {
            Log.e("mensaje", " pulsaste el 1 desde java")
        }
    }

}