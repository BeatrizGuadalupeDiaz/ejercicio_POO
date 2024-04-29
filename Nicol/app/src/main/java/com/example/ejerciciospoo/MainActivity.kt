package com.example.ejerciciospoo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    }
    val ordenador = Ordenador("HP", "Pavilion", Estado.NUEVO, "Intel i5", 8)
    val tableta = Tableta("Samsung", "Galaxy Tab", Estado.USADO, 10.1)
    val smartphone = Smartphone("Apple", "iPhone 12", Estado.EN_REPARACION, true)

    RegistroDispositivos.agregarDispositivo(ordenador)
    RegistroDispositivos.agregarDispositivo(tableta)
    RegistroDispositivos.agregarDispositivo(smartphone)

    RegistroDispositivos.buscarDispositivo("HP", "Pavilion")?.mostrarDetalle()
    RegistroDispositivos.buscarDispositivo("Samsung", "Galaxy Tab")?.mostrarDetalle()
    RegistroDispositivos.buscarDispositivo("Apple", "iPhone 12")?.mostrarDetalle()
}
}