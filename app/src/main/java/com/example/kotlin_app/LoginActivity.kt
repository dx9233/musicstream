package com.example.kotlin_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val googleBtn = findViewById<Button>(R.id.googleLogin)
        val facebookBtn = findViewById<Button>(R.id.facebookLogin)
        val appleBtn = findViewById<Button>(R.id.appleLogin)
        val passwordBtn = findViewById<Button>(R.id.passwordLogin)

        googleBtn.setOnClickListener {
        }

        facebookBtn.setOnClickListener {
        }

        appleBtn.setOnClickListener {
        }

        passwordBtn.setOnClickListener {
        }
    }
}