/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coleccion_sistema_de_stock;

import java.util.List;

/**
 *
 * @author ushio
 */
public class MainStock {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        
        // Crear productos
        Producto p1 = new Producto("A001", "Arroz", 250, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("E001", "Smartphone", 1500, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("R001", "Camisa", 800, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("H001", "Sartén", 1200, 15, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("A002", "Leche", 180, 40, CategoriaProducto.ALIMENTOS);
        
        // Agregar productos al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        
        System.out.println("\n--- Listar todos los productos ---");
        inventario.listarProductos();
        
        System.out.println("\n--- Buscar producto por ID ---");
        Producto encontrado = inventario.buscarProductoPorId("E001");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        }
        
        System.out.println("\n--- Filtrar por categoría ALIMENTOS ---");
        List<Producto> alimentos = inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        for (Producto p : alimentos) {
            p.mostrarInfo();
        }
        
        System.out.println("\n--- Actualizar stock ---");
        inventario.actualizarStock("A001", 60);
        
        System.out.println("\n--- Total de stock ---");
        System.out.println("Stock total: " + inventario.obtenerTotalStock());
        
        System.out.println("\n--- Producto con mayor stock ---");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            mayorStock.mostrarInfo();
        }
        
        System.out.println("\n--- Filtrar productos por precio ($1000 - $3000) ---");
        List<Producto> porPrecio = inventario.filtrarProductosPorPrecio(1000, 3000);
        for (Producto p : porPrecio) {
            p.mostrarInfo();
        }
        
        System.out.println("\n--- Mostrar categorías disponibles ---");
        inventario.mostrarCategoriasDisponibles();
    }
}
