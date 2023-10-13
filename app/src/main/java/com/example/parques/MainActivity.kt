package com.example.parques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CheckBox
import android.widget.Toast
import com.example.parques.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)


        //Importamos el LayOut con el binding
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Escuchador de clicks con binding
        binding.buttonGuardar.setOnClickListener{

            //Agregamos texto en casillas a las diferentes variables
            val nombre = binding.nombreId.text.toString()
            val descripcion = binding.descripcionId.text.toString()
            val telefono = binding.tlfId.text.toString()
            val web = binding.webId.text.toString()

            //Agregamos El Item Seleccionado
            val h_apertura = binding.hApertura.selectedItem.toString()
            val h_cierre = binding.hCierre.selectedItem.toString()

            //Agregamos el checkBox que este chekado
            val deportes = binding.deportes.isChecked
            val infantil = binding.infantil.isChecked
            val restaurante = binding.restaurante.isChecked
            val mascotas = binding.mascotas.isChecked

            //Almacenarlo en MENSAJE
            val mensaje = "Nombre: $nombre \t Descripcion: $descripcion \t Telefono: $telefono \t " +
                    "Web: $web \t \nHorario Apertura: $h_apertura \t Horario Cierre: $h_cierre\t\n Deportes: $deportes \tParque Infantil: $infantil \t Restaurante: $restaurante \t Mascotas: $mascotas "


            //Hacer un Toast Con el mensaje
            Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()

            //Adición Al LogCat para control a la hora de depurar
            Log.d("Mensaje se Guardo", mensaje)
        }


    }
}