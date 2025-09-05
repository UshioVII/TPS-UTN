/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico_III;

/**
 *
 * @author ushio
 */

public class Mascota {
    String nombre;
    String especie;
    int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println(nombre + " - Especie: " + especie + " - Edad: " + edad + " años");
    }

    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " cumplió años. Ahora tiene " + edad);
    }
}

