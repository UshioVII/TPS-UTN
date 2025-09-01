/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccionjava;

import java.util.Scanner;

/**
 *
 * @author ushio
 */


public class ClasificacionEdad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = scan.nextInt();

        if (edad < 13) {
            System.out.println("Eres un niño.");
        } else if (edad < 18) {
            System.out.println("Eres adolescente.");
        } else if (edad < 60) {
            System.out.println("Eres adulto.");
        } else {
            System.out.println("Eres adulto mayor.");
        }

        scan.close();
    }
}