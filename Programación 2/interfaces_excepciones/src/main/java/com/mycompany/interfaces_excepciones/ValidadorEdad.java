/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaces_excepciones;

/**
 *
 * @author ushio
 */
public class ValidadorEdad {
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad inválida: " + edad + ". Debe estar entre 0 y 120.");
        } else {
            System.out.println("Edad válida: " + edad);
        }
    }
}
