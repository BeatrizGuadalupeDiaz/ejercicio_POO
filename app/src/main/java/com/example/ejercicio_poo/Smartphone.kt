package com.example.ejercicio_poo

class Smartphone(marca:String,modelo:String,estado: Estado):Dispositivo(marca,modelo,estado) {
    lateinit var especificaciones :EspecificacionesSmartphone
}