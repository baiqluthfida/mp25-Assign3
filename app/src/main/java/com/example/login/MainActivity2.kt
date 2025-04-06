package com.example.login

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnLogin = findViewById<Button>(R.id.btn)

        btnLogin.setOnClickListener {
            val emailInput = findViewById<EditText>(R.id.email).text.toString()
            val passwordInput = findViewById<EditText>(R.id.password).text.toString()

            val user = intent.getParcelableExtra<User>("user")

            if (user != null && emailInput == user.email && passwordInput == user.password) {
                val intent = Intent(this, Landing_page::class.java)
                intent.putExtra("user", user)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Email atau password salah!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}