package com.d4rky.proyectoextraordinarioo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var exUser: EditText
    private lateinit var exPassword: EditText
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3000)
        installSplashScreen()
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        exUser = findViewById<EditText>(R.id.loginUser)
        exPassword = findViewById(R.id.loginContrasena)
        btnLogin = findViewById(R.id.btnEntrar)

        btnLogin.setOnClickListener {
            val username = exUser.text.toString()
            val password = exPassword.text.toString()

            if (validateCredentials(username, password)) {
                // Credenciales correctas, ir a MainActivity
                val intent = Intent(this, CardActivity::class.java)
                startActivity(intent)
                finish() // Opcional: cierra LoginActivity para que no se pueda volver atrás
            } else {
                // Credenciales incorrectas
                Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()
            }
        }





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    private fun validateCredentials(username: String, password: String): Boolean {
        // Validación local (case sensitive)
        return username == "Admin" && password == "admin"
    }
}