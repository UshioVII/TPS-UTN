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


public class ValidarNota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Ingrese una nota (0 a 10): ");
            nota = scan.nextInt();
             if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota válida: " + nota);
        scan.close();
    }
}

