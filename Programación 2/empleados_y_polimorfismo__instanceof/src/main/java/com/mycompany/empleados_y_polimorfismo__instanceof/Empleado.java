/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleados_y_polimorfismo__instanceof;

/**
 *
 * @author ushio
 */
public abstract class Empleado {

    /**
     * Calcula el sueldo según el tipo de empleado usando instanceof
     * @param e el empleado a evaluar
     * @return sueldo correspondiente al tipo de empleado
     */
    public double calcularSueldo(Empleado e) {
        if (e instanceof EmpleadoPlanta) {
            return 900000.0; // Sueldo fijo para planta
        } else if (e instanceof EmpleadoTemporal) {
            return 850000.0; // Sueldo fijo para temporal
        } else {
            return 0.0; // Tipo no reconocido
        }
    }
    

}


