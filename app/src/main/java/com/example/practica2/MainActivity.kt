package com.example.practica2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tvNombre: TextView;
    private lateinit var btAgenda: Button;
    private lateinit var btReceta:Button;

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvNombre=findViewById(R.id.tvNombre)
        btAgenda=findViewById(R.id.btAgenda)
        btReceta=findViewById(R.id.btReceta)

        btAgenda.setOnClickListener { enviarAgenda() }

    }

    fun enviarAgenda(){
        val intent = Intent(this, AgendaActivity::class.java)
        startActivity(intent)

    }
}