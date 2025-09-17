/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico_V.ej7;

/**
 *
 * @author ushio
 */

public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public void setVehiculo(Vehiculo v) {
        this.vehiculo = v;
        if (v != null && v.getConductor() != this) v.setConductor(this);
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
