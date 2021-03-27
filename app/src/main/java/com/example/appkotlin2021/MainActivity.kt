package com.example.appkotlin2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun onClick(view: View) {

        var nombre: String = txtNom.text.toString()
        var apellido: String = txtApe.text.toString()

        //valida que el campo nombre no este vacio
        if (txtNom.getText().toString().isEmpty()) {
            Toast.makeText(applicationContext, "Llena el Nombre", Toast.LENGTH_SHORT).show()

            //valida que el campo apellido no este vacio
        } else if (txtApe.getText().toString().isEmpty()) {
            Toast.makeText(applicationContext, "Llena el Apellido", Toast.LENGTH_SHORT).show()

        } else {
            //Imprime en un toast la concatenacion de Bienvenido + nombre + apellido + al canal
            Toast.makeText(
                applicationContext, "Bienvenido  $nombre  $apellido  al " +
                        "Canal", Toast.LENGTH_SHORT
            ).show()

            //Limpia los campos del edit text
            txtNom.setText("")
            txtApe.setText("")

        }


    }
}