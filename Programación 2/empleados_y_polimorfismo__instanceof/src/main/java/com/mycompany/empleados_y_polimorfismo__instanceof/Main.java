/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empleados_y_polimorfismo__instanceof;

import java.util.ArrayList;

/**
 *
 * @author ushio
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        // Crear empleados de diferentes tipos
        empleados.add(new EmpleadoPlanta());
        empleados.add(new EmpleadoPlanta());
        empleados.add(new EmpleadoTemporal());
        empleados.add(new EmpleadoTemporal());
        
        // Calcular sueldos polimórficamente
        int indice = 0;
        for(Empleado emp : empleados) {
            double sueldo = emp.calcularSueldo(emp);
            System.out.println("El empleado " + indice + " cobra: " + sueldo);
            indice++;
        }
    }
}
