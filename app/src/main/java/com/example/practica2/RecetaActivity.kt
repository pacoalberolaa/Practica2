package com.example.practica2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class RecetaActivity : AppCompatActivity() {
    private lateinit var tvDescripcion: TextView
    private lateinit var tvtextDescripcion:TextView
    private lateinit var tvReceta:TextView
    private lateinit var tvtextReceta:TextView
    private lateinit var tvIngredientes:TextView
    private lateinit var tvtextIngredientes:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receta)

        tvDescripcion = findViewById(R.id.tvDescripcion)
        tvtextDescripcion = findViewById(R.id.tvtextDescripcion)
        tvIngredientes = findViewById(R.id.tvIngredientes)
        tvtextIngredientes = findViewById(R.id.tvtextIngredientes)
        tvReceta = findViewById(R.id.tvReceta)
        tvtextReceta = findViewById(R.id.tvtextReceta)

        tvDescripcion.setOnClickListener { enviarParte2("Descripcion Receta", tvtextDescripcion.text.toString()) }
        tvIngredientes.setOnClickListener { enviarParte2("Ingredientes Receta", tvtextIngredientes.text.toString()) }
        tvReceta.setOnClickListener { enviarParte2("Pasos de la Receta", tvtextReceta.text.toString()) }
    }

    fun enviarParte2(tipo: String, dato:String){
        val intent =Intent(this, Parte2Activity::class.java)
        intent.putExtra(Parte2Activity.EXTRA_TIPO, tipo)
        intent.putExtra(Parte2Activity.EXTRA_DATO, dato)
        startActivity(intent)
    }
}