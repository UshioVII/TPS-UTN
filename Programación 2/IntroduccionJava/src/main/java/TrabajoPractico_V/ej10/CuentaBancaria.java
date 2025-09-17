/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico_V.ej10;

/**
 *
 * @author ushio
 */


import java.time.LocalDate;

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo, String codigo) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo, LocalDate.now());
    }

    public void setTitular(Titular t) {
        this.titular = t;
        if (t.getCuenta() != this) t.setCuenta(this);
    }

    public Titular getTitular() {
        return titular;
    }
}
