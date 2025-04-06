package com.example.login

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView

class Landing_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page)

        val welcomeText = findViewById<TextView>(R.id.welcomeText)
        val user = intent.getParcelableExtra<User>("user")

        user?.let {
            welcomeText.text = "Selamat datang, ${it.name}!"
        }
    }
}