package com.devjhon.educatech_app.Activites

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.devjhon.educatech_app.MainActivity

import com.devjhon.educatech_app.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        btnVoltarLogin()
        btnLogin()
        esqueceuASenha()
    }

    fun btnVoltarLogin(){
        binding.btnVoltarLogin.setOnClickListener {
            var voltarLogin = Intent(this, GetStartedActivity::class.java)
            startActivity(voltarLogin)
        }
    }

    fun btnLogin(){
        binding.btnLogin.setOnClickListener {
            var login = Intent(this, MainActivity::class.java)
            startActivity(login)
            finish()
        }
    }

    fun esqueceuASenha(){
        binding.txtRecuperarSenha.setOnClickListener {
            var esqueceuASenha = Intent(this, VerificaEmailActivity::class.java)
            startActivity(esqueceuASenha)
        }
    }
}