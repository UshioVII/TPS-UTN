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
public class AnioBisiesto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int anio = scan.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println(anio + " es bisiesto.");
        } else {
            System.out.println(anio + " no es bisiesto.");
        }

        scan.close();
    }
}
