/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animales_comportamiento_sobrescrito;

/**
 *
 * @author ushio
 */
public class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("¡Guau! ¡Guau!");
    }

    @Override
    public void describirAnimal() {
        System.out.println("Este es un perro, el mejor amigo del hombre");
    }
}
