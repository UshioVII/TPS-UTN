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


public class DescuentoCategoria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el precio: ");
        double precio = scan.nextDouble();

        System.out.print("Ingrese la categoría (A, B o C): ");
        String categoria = scan.next().toUpperCase();

        double descuento = 0;

        switch (categoria) {
            case "A":
                descuento = 0.30; // 30%
                break;
            case "B":
                descuento = 0.20; // 20%
                break;
            case "C":
                descuento = 0.10; // 10%
                break;
            default:
                System.out.println("Categoría inválida.");
                scan.close();
                return;
        }

        double precioFinal = precio - (precio * descuento);
        System.out.println("Precio final: $" + precioFinal);

        scan.close();
    }
}

