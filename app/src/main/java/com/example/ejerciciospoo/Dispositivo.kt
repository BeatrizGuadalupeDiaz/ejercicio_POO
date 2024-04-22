package com.example.ejerciciospoo

open class Dispositivo(val marca: String, val modelo: String, var estado: Estado) {

     fun String(): String {
        return "Marca: $marca, Modelo: $modelo, Estado: $estado"
}
    open fun mostrarDetalle() {
        println("Detalles del dispositivo:")
        println(toString())
}
}