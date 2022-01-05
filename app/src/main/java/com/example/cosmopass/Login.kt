package com.example.cosmopass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide()
        setContentView(R.layout.activity_login)
        Handler().postDelayed({
            val intent = Intent(this, habitableplanets::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}