/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animales_comportamiento_sobrescrito;

import java.util.ArrayList;

/**
 *
 * @author ushio
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        
        // Agregar diferentes animales
        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Vaca());
        
        // Demostración de polimorfismo
        System.out.println("=== SONIDOS DE ANIMALES ===");
        for(Animal animal : animales) {
            animal.hacerSonido();
            animal.describirAnimal();
            System.out.println("---");
        }
    }
}