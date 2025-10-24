/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaces_excepciones;

/**
 *
 * @author ushio
 */
public class CalculadoraSegura {
    public static void dividir(double a, double b) {
        try {
            if (b == 0.0) {
                // Forzamos la excepción para cumplir la consigna
                throw new ArithmeticException("Divisor cero");
            }
            double resultado = a / b;
            System.out.println(a + " / " + b + " = " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error aritmético: " + e.getMessage());
        }
    }
}
