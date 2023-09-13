package com.grupo4.participacions1

import java.util.Scanner


fun main() {

    val scanner = Scanner(System.`in`)
    print("Ingrese el texto: ")
    var texto=scanner.nextLine();
    var cantidad=Cadena.contadorVocales(texto);
    print(cantidad);



}
