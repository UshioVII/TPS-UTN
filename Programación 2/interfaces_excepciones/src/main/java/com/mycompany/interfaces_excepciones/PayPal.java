/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaces_excepciones;

/**
 *
 * @author ushio
 */
public class PayPal implements Pago {
    private String email;
    private double saldo;

    public PayPal(String email, double saldo) {
        this.email = email;
        this.saldo = saldo;
    }

    @Override
    public boolean procesarPago(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Pago con PayPal aprobado. Monto descontado: $" + monto);
            return true;
        } else {
            System.out.println("Pago con PayPal rechazado: saldo insuficiente.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "PayPal[" + email + ", saldo=$" + saldo + "]";
    }
}
