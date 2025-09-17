/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico_V.ej5;

/**
 *
 * @author ushio
 */


public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora;

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setComputadora(Computadora c) {
        this.computadora = c;
        if (c != null && c.getPropietario() != this) c.setPropietario(this);
    }

    public Computadora getComputadora() {
        return computadora;
    }
}
