package com.example.practica2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Parte2Activity : AppCompatActivity() {
    companion object{
        val EXTRA_DATO = "app.DatosRecetaActivity.dato"
        val EXTRA_TIPO = "app.DatosRecetaActivity.tipo"
    }
    private lateinit var tvTipo : TextView
    private lateinit var tvDato : TextView
    private lateinit var btClose : Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parte2)
        tvTipo = findViewById(R.id.tvTipo)
        tvDato = findViewById(R.id.tvDato)
        btClose = findViewById(R.id.btClose)

        btClose.setOnClickListener { finish() }

        val tipo=intent.getStringExtra(EXTRA_TIPO)
        val dato=intent.getStringExtra(EXTRA_DATO)

        tvTipo.text = String.format(getString(R.string.texto),tipo)
        tvDato.text = String.format(getString(R.string.texto), dato)


    }


}