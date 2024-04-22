package com.example.ejerciciospoo

class Tableta (marca: String, modelo: String, estado: Estado) : Dispositivo(marca, modelo, estado) {

    var tamaño_pantalla = 0.0

    override fun mostrarDetalle() {
            super.mostrarDetalle()
            println("Tamaño de pantalla: $tamaño_pantalla pulgadas")
        }
}