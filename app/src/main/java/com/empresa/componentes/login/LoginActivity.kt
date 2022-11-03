package com.empresa.componentes.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import com.empresa.componentes.R
import com.empresa.componentes.menu.MenuActivity

class LoginActivity :AppCompatActivity() {

    lateinit var tvRegistrarme : TextView
    lateinit var btnLogin : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_actvity)
        tvRegistrarme =  findViewById(R.id.tvRegistrarme)
        btnLogin = findViewById(R.id.btnLogin)
        tvRegistrarme.setOnClickListener {
            var intent = Intent(this, RegistroActivity::class.java)
            startActivity(intent)
            finish()
        }
        btnLogin.setOnClickListener {
            var intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}