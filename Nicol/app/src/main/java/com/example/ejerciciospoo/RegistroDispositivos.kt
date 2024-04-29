package com.example.ejerciciospoo

object RegistroDispositivos {
     val listdispositivos = mutableListOf<Dispositivo>()

    fun agregarDispositivo(dispositivo: Dispositivo) {
        if(listdispositivos.equals(dispositivo)){
        listdispositivos.add(dispositivo)
    }
}
    fun removerDispositivo(dispositivo: Dispositivo) {
        if(listdispositivos.contains(dispositivo)){
            listdispositivos.remove(dispositivo)
    }
    }
    fun buscarDispositivo(marca: String, modelo: String): Dispositivo? {
        return listdispositivos.find { it.marca == marca && it.modelo == modelo }
    }
}
