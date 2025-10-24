/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaz_pagable_procesamiento_generico;

import java.util.ArrayList;

/**
 *
 * @author ushio
 */
public class Main {
    
    public static void main(String[] args) {
        ArrayList<Pagable> mediosPago = new ArrayList<>();
        
        // Agregar diferentes medios de pago
        mediosPago.add(new TarjetaCredito());
        mediosPago.add(new Transferencia());
        mediosPago.add(new Efectivo());
        
        // Procesar todos los pagos de forma uniforme
        System.out.println("=== PROCESANDO PAGOS ===");
        for(Pagable medio : mediosPago) {
            procesarPago(medio);
            System.out.println();
        }
    }
    
    /**
     * Método genérico que procesa cualquier tipo de pago
     * @param medio el medio de pago a procesar
     */
    public static void procesarPago(Pagable medio) {
        medio.pagar(); // Llamada polimórfica
    }
}
