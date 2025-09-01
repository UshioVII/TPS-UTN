/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccionjava.Practica;

import java.util.Scanner;

/**
 *
 * @author ushio
 */
public class NumerosEnteros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        int suma, resta, multiplicacion;
        double division;
        
        System.out.println("Ingresa el primer número entero:");
        a = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingresa el segundo número entero:");
        b = Integer.parseInt(input.nextLine());
        
        suma = a + b;
        resta = a - b;
        multiplicacion = a * b;
        division = (double) a / b;
        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);

    }
}
