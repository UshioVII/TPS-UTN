/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaz_pagable_procesamiento_generico;

/**
 *
 * @author ushio
 */
public class Transferencia implements Pagable {
    @Override
    public void pagar() {
        System.out.println("Iniciando transferencia bancaria...");
        System.out.println("✅ Pago realizado con transferencia");
    }
}
