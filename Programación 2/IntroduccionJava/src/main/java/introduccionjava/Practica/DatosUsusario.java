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
public class DatosUsusario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tu edad es: " + edad);

        scanner.close();
    }
}
