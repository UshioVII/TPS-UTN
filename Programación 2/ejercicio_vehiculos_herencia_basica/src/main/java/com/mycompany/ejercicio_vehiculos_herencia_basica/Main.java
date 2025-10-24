/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_vehiculos_herencia_basica;

/**
 *
 * @author ushio
 */
public class Main {
    public static void main(String[] args) {
        // Instanciación de un Auto
        Auto miAuto = new Auto(5, "Renault", "Sandero");
        
        // Llamada polimórfica al método mostrarInfo()
        miAuto.mostrarInfo();
    }
}
