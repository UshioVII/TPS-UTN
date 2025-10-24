/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaz_pagable_procesamiento_generico;

/**
 *
 * @author ushio
 */

public class Efectivo implements Pagable {
    @Override
    public void pagar() {
        System.out.println("Preparando recibo de pago en efectivo...");
        System.out.println("✅ Pago realizado con efectivo");
    }
}
