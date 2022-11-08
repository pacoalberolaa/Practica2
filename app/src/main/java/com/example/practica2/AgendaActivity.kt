package com.example.practica2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class AgendaActivity : AppCompatActivity() {

    private lateinit var edNuevoContacto:TextView
    private lateinit var edNombre:EditText;
    private lateinit var edApellido:EditText;
    private lateinit var edTelefono:EditText;
    private lateinit var tvNotas:TextView
    private lateinit var btAceptar: Button;
    private lateinit var btCancelar:Button;

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agenda)

        edNuevoContacto=findViewById(R.id.tvNuevoContacto)
        edNombre=findViewById(R.id.edNombre)
        edApellido=findViewById(R.id.edApellidos)
        edTelefono=findViewById(R.id.edTelefono)
        tvNotas=findViewById(R.id.tvNotas)
        btAceptar=findViewById(R.id.btAceptar)
        btCancelar=findViewById(R.id.btCancelar)

        btCancelar.setOnClickListener{finish()}
        btAceptar.setOnClickListener { cambiarNombre() }

    }

    fun cambiarNombre(){
        if ((!edNombre.text.toString().isEmpty()) or (!edApellido.text.toString().isEmpty())){
            edNuevoContacto.text = String.format(edNombre.text.toString() + " " + edApellido.text.toString())
        }else{
            Toast.makeText(this, getString(R.string.msj_nombre), Toast.LENGTH_LONG).show()

        }

    }


}