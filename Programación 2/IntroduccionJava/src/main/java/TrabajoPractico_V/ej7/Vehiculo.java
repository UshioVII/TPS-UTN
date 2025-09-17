/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico_V.ej7;

/**
 *
 * @author ushio
 */

public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void setConductor(Conductor c) {
        this.conductor = c;
        if (c != null && c.getVehiculo() != this) c.setVehiculo(this);
    }

    public Conductor getConductor() {
        return conductor;
    }
}
