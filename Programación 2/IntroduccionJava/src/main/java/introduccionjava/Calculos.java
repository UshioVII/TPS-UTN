/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccionjava;

/**
 *
 * @author ushio
 */
public class Calculos {

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioConImpuesto = precioBase + (precioBase * impuesto / 100);
        double precioFinal = precioConImpuesto - (precioBase * descuento / 100);
        return precioFinal;
    }
}

