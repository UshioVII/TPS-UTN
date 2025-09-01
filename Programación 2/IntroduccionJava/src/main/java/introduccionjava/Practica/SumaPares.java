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

public class SumaPares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int suma = 0;
        int num;

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            num = scan.nextInt();

            if (num % 2 == 0 && num != 0) {
                suma += num;
            }

        } while (num != 0);

        System.out.println("La suma de los números pares es: " + suma);
        scan.close();
    }
}


