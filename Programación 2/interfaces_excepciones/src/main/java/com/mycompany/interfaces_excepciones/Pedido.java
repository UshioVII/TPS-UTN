/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaces_excepciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ushio
 */
public class Pedido implements Pagable {
    private String clienteNombre;
    private String clienteEmail;
    private Cliente cliente;
    private List<Producto> productos;
    private String estado; // e.g., Pendiente, Pagado, Enviado

    public Pedido(String nombreCliente, String email) {
        this.clienteNombre = nombreCliente;
        this.clienteEmail = email;
        this.cliente = new Cliente(nombreCliente, email);
        this.productos = new ArrayList<>();
        this.estado = "Pendiente";
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    @Override
    public double calcularTotal() {
        return productos.stream().mapToDouble(Producto::calcularTotal).sum();
    }

    public void procesarPago(Pago medioPago) {
        double total = calcularTotal();
        System.out.println("Intentando procesar pago por $" + total + " con " + medioPago);
        boolean ok = medioPago.procesarPago(total);
        if (ok) {
            cambiarEstado("Pagado");
        } else {
            cambiarEstado("Pago fallido");
        }
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        // Notificar al cliente sobre el cambio de estado
        cliente.notificar("El pedido ha cambiado a estado: " + nuevoEstado);
    }

    public void mostrarDetalles() {
        System.out.println("Pedido para: " + cliente);
        System.out.println("Estado: " + estado);
        System.out.println("Productos:");
        for (Producto p : productos) {
            System.out.println(" - " + p);
        }
        System.out.println("Total: $" + calcularTotal());
    }

    @Override
    public String toString() {
        return "Pedido{" + clienteNombre + " - total=$" + calcularTotal() + "}";
    }
}
