/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccionjava.Practica;

/**
 *
 * @author ushio
 */
public class RecursivoArray {
 public static void main(String[] args) {
       
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        mostrarPreciosRecursivo(precios, 0);

        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        mostrarPreciosRecursivo(precios, 0);
    }

    // Función recursiva para mostrar precios
    public static void mostrarPreciosRecursivo(double[] precios, int indice) {
        if (indice >= precios.length) {
            return;
        }
        // Mostrar el precio actual
        System.out.println("Precio: $" + precios[indice]);
        // Llamada recursiva para el siguiente índice
        mostrarPreciosRecursivo(precios, indice + 1);
    }
}
