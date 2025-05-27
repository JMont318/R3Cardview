package com.d4rky.proyectoextraordinarioo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_card)

        val tvWelcome = findViewById<TextView>(R.id.tvWelcome)
        tvWelcome.text = "Bienvenido: Admin"

        val cardView1 = findViewById<CardView>(R.id.cardView1)
        val cardView2 = findViewById<CardView>(R.id.cardView2)
        val cardView3 = findViewById<CardView>(R.id.cardView3)

        cardView1.setOnClickListener {
            Toast.makeText(this, "Card 1 seleccionado", Toast.LENGTH_SHORT).show()
        }

        cardView2.setOnClickListener {
            Toast.makeText(this, "Card 2 seleccionado", Toast.LENGTH_SHORT).show()
        }

        cardView3.setOnClickListener {
            Toast.makeText(this, "Card 3 seleccionado", Toast.LENGTH_SHORT).show()
        }

        // Configurar el botón de cerrar sesión
        val btnLogout = findViewById<Button>(R.id.btnLogout)
        btnLogout.setOnClickListener {
            // Regresar al LoginActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Cierra esta activity para que no se pueda volver atrás
        }

    }


}
