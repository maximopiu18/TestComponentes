package com.empresa.componentes

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var btn1 : Button
    lateinit var btn2 : Button
    lateinit var btn3 : Button

    lateinit var btnSuma : Button
    lateinit var btnResta: Button
    lateinit var btnDivision: Button
    lateinit var btnResultado : Button
    lateinit var btnReset : Button

    lateinit var tvResultado:TextView


    var valor1 :String= ""
    var valor2 :String= ""
    var valorSimbolo ="" // + -  x /
    var resultado =0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btnSuma = findViewById(R.id.btnSuma)
        btnResta =findViewById(R.id.btnResta)
        btnDivision = findViewById(R.id.btnDivision)
        btnResultado = findViewById(R.id.btnResultado)
        tvResultado = findViewById(R.id.tvResultado)
        btnReset = findViewById(R.id.btnReset)

        btnSuma.setOnClickListener {
            valorSimbolo = "+"
        }
        btnResta.setOnClickListener {
            valorSimbolo = "-"
        }
        btnDivision.setOnClickListener {
            valorSimbolo = "/"
        }

        btn1.setOnClickListener {
           logica(1.0)
        }
        btn2.setOnClickListener {
            logica(2.0)
        }
        btn3.setOnClickListener {
            logica(3.0)
        }

        btnResultado.setOnClickListener {
            if(!valorSimbolo.isNullOrEmpty()){
                if(valorSimbolo.equals("+")){
                    suma()
                    resultadoPrint()
                }
                else if(valorSimbolo.equals("-")){
                    resta()
                    resultadoPrint()
                }
                else if(valorSimbolo.equals("/")){
                    division()
                    resultadoPrint()
                }
            }
        }
        btnReset.setOnClickListener {
            resetValues()
        }


    }


    fun logica(valor:Double){

            if(valorSimbolo.equals("")|| valorSimbolo.isNullOrEmpty()){

                var  strTemp = valor.toString()
                if(strTemp.contains(".0")){
                    valor1 = valor1+valor.toInt().toString()
                }
                else{
                    valor1 = valor1+valor
                }
                Log.e("valor", "valor1: " + valor1)
            }
            else if(!valorSimbolo.equals("")|| !valorSimbolo.isNullOrEmpty()){
                var  strTemp = valor.toString()
                if(strTemp.contains(".0")){
                    valor2 = valor2+valor.toInt().toString()
                }
                else{
                    valor2 = valor2+valor
                }
                Log.e("valor", "valor2: " + valor2)
            }

    }

    fun suma(){
        resultado = valor1.toDouble()+valor2.toDouble()
        valor1 = resultado.toString()
        valor2 = ""
        valorSimbolo =""

    }
    fun resta(){
        resultado = valor1.toDouble()-valor2.toDouble()
        valor1 = resultado.toString()
        valor2 = ""
        valorSimbolo =""

    }
    fun division(){
        resultado = valor1.toDouble()/valor2.toDouble()
        valor1 = resultado.toString()
        valor2 = ""
        valorSimbolo =""

    }
    fun resetValues(){
         valor1 = ""
         valor2 = ""
         valorSimbolo =""
         resultado =0.0
        tvResultado.setText("Resultado")
    }
    @SuppressLint("SetTextI18n")
    fun resultadoPrint(){
        tvResultado.setText(""+resultado)
    }

}