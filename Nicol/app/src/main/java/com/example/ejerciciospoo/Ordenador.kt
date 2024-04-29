package com.example.ejerciciospoo

class Ordenador (marca: String, modelo: String, estado: Estado) : Dispositivo(marca, modelo, estado) {

    var tipo_CPU = String
    var ram = Int

    override fun mostrarDetalle() {
        super.mostrarDetalle()
        println("Tipo de CPU: $tipo_CPU, RAM: $ram GB")
    }
}
