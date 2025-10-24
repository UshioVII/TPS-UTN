/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_vehiculos_herencia_basica;

/**
 *
 * @author ushio
 */
public class Auto extends Vehiculo {
    // Atributo adicional específico de Auto
    private int cantidadDePuertas;
    
    // Constructor que llama al constructor de la superclase
    public Auto(int cantidadDePuertas, String marca, String modelo) {
        super(marca, modelo); // Inicializa atributos de Vehículo
        this.cantidadDePuertas = cantidadDePuertas;
    }
    
    // Sobrescritura del método para incluir información específica
    @Override
    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + 
                         ", Puertas: " + cantidadDePuertas);
    }
}
