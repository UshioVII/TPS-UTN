/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaz_pagable_procesamiento_generico;

/**
 *
 * @author ushio
 */
public class TarjetaCredito implements Pagable {
    @Override
    public void pagar() {
        System.out.println("Procesando pago con tarjeta de crédito...");
        System.out.println("✅ Pago realizado con tarjeta de crédito");
    }
}
