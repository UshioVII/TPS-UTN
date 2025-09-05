/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPracticoIV;

/**
 *
 * @author ushio
 */
public class Main {
        public static void main(String[] args) {
            
        Empleado e1 = new Empleado(100, "Carla Gómez", "Gerente", 50000);
        
        Empleado e2 = new Empleado("Juan Pérez", "Analista");
        Empleado e3 = new Empleado("Ana Torres", "Programadora");

        e1.actualizarSalario(10);   // +10% al salario de Carla
        e2.actualizarSalario(20000); // +20000 al salario de Juan
        e3.actualizarSalario(15);   // +15% al salario de Ana (sobre 0.0 sigue en 0.0)
        e3.setSalario(30000.0);     // Le damos un salario base a Ana
        e3.actualizarSalario(10);   // Ahora sí, +10%

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}
