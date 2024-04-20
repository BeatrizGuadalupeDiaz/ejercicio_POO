package com.example.ejerciciospoo

class Smartphone(marca: String, modelo: String, estado: Estado) : Dispositivo(marca, modelo, estado) {

    var es_dual_sim: Boolean = false

    override fun mostrarDetalle() {
        super.mostrarDetalle()
        println("Dual SIM: ${if (es_dual_sim) "Sí" else "No"}")
    }
}