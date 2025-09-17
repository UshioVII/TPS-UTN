/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico_V.ej10;

/**
 *
 * @author ushio
 */


public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCuenta(CuentaBancaria c) {
        this.cuenta = c;
        if (c.getTitular() != this) c.setTitular(this);
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }
}
