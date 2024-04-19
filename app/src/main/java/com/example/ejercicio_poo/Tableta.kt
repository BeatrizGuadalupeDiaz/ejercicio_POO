package com.example.ejercicio_poo

class Tableta(marca:String,modelo:String,estado: Estado):Dispositivo(marca,modelo,estado) {
    lateinit  var especificaciones :EspecificacionesTableta
}