package com.empresa.componentes.login

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.empresa.componentes.R

class LoginActivity :AppCompatActivity() {

    lateinit var tvRegistrarme : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_actvity)
        tvRegistrarme =  findViewById(R.id.tvRegistrarme)
        tvRegistrarme.setOnClickListener {
            var intent = Intent(this, RegistroActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}