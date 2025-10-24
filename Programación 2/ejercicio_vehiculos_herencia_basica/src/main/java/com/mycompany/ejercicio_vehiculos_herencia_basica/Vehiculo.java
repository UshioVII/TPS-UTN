/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_vehiculos_herencia_basica;

/**
 *
 * @author ushio
 */
public class Vehiculo {
     // Atributos protegidos para permitir acceso desde subclases
    protected String marca;
    protected String modelo;
    
    // Constructor que inicializa los atributos básicos
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    // Método que será sobrescrito en la subclase
    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}
