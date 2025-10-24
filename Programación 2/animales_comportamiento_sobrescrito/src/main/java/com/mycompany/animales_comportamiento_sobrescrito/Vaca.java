/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animales_comportamiento_sobrescrito;

/**
 *
 * @author ushio
 */
public class Vaca extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("¡Muuu! ¡Muuu!");
    }

    @Override
    public void describirAnimal() {
        System.out.println("Esta es una vaca, animal rumiante y tranquilo");
    }
}
