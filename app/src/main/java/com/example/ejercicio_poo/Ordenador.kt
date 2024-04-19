package com.example.ejercicio_poo

class Ordenador(marca:String,modelo:String,estado: Estado):Dispositivo(marca,modelo,estado) {
    lateinit var especificaciones :EspecificacionesOrdenador
}