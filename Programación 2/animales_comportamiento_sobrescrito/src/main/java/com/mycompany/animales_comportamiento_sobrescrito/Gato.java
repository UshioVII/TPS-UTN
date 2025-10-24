/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animales_comportamiento_sobrescrito;

/**
 *
 * @author ushio
 */
public class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("¡Miau! ¡Miau!");
    }
    
    @Override
    public void describirAnimal() {
        System.out.println("Este es un gato, animal independiente y curioso");
    }
}
