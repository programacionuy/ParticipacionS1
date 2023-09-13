package com.grupo4.participacions1

import java.util.Locale

class Cadena {

    companion object {
        fun contadorVocales(frase:String):Int {
            var aux= frase.uppercase()
            var contador=0;
            aux.forEach { caracter ->
                if(caracter=='A' || caracter=='E' || caracter=='I' || caracter=='O' || caracter=='U')
                {
                    contador++
                }
            }
            return contador;
        }
    }

}