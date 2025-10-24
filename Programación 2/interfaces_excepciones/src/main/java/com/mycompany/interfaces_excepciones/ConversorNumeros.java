/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaces_excepciones;

/**
 *
 * @author ushio
 */
public class ConversorNumeros {
    public static void convertir(String texto) {
        try {
            int valor = Integer.parseInt(texto);
            System.out.println("Conversión exitosa: " + valor);
        } catch (NumberFormatException e) {
            System.out.println("Error conversión: '" + texto + "' no es un entero válido.");
        }
    }
}
