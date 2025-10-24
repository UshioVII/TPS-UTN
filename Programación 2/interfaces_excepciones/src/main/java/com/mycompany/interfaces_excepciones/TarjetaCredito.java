/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaces_excepciones;

/**
 *
 * @author ushio
 */
public class TarjetaCredito implements PagoConDescuento {
    private String numero;
    private double limiteDisponible;

    public TarjetaCredito(String numero, double limiteDisponible) {
        this.numero = numero;
        this.limiteDisponible = limiteDisponible;
    }

    @Override
    public double aplicarDescuento(double monto) {
        // Aplica 10% de descuento
        return monto * 0.90;
    }

    @Override
    public boolean procesarPago(double monto) {
        double montoConDescuento = aplicarDescuento(monto);
        if (montoConDescuento <= limiteDisponible) {
            limiteDisponible -= montoConDescuento;
            System.out.println("Pago con Tarjeta aprobado. Monto cargado: $" + montoConDescuento);
            return true;
        } else {
            System.out.println("Pago con Tarjeta rechazado: límite insuficiente.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "TarjetaCredito[" + numero + ", disponible=$" + limiteDisponible + "]";
    }
}
