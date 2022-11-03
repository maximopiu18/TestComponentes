package com.empresa.componentes

import android.annotation.SuppressLint
import android.os.Bundle

import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var btn1 : Button
    lateinit var btn2 : Button
    lateinit var btn3 : Button
    lateinit var btn4 : Button
    lateinit var btn5 : Button
    lateinit var btn6 : Button
    lateinit var btn7 : Button
    lateinit var btn8 : Button
    lateinit var btn9 : Button
    lateinit var btn0 : Button

    lateinit var btnSuma : Button
    lateinit var btnResta: Button
    lateinit var btnMulti : Button
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
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
        btn0 = findViewById(R.id.btn0)
        btnSuma = findViewById(R.id.btnSuma)
        btnResta =findViewById(R.id.btnResta)
        btnMulti =findViewById(R.id.btnMulti)
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
        btnMulti.setOnClickListener {
            valorSimbolo = "X"
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
        btn4.setOnClickListener {
            logica(4.0)
        }
        btn5.setOnClickListener {
            logica(5.0)
        }
        btn6.setOnClickListener {
            logica(6.0)
        }
        btn7.setOnClickListener {
            logica(7.0)
        }
        btn8.setOnClickListener {
            logica(8.0)
        }
        btn9.setOnClickListener {
            logica(9.0)
        }
        btn0.setOnClickListener {
            logica(0.0)
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
                else if(valorSimbolo.equals("X")){
                    multi()
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
                tvResultado.setText(""+valor1)

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
                tvResultado.setText(""+valor2)

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
    fun multi(){
        resultado = valor1.toDouble()*valor2.toDouble()
        valor1= resultado.toString()
        valor2 = ""
        valorSimbolo = ""
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