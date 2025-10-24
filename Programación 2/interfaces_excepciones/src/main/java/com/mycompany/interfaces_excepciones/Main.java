/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaces_excepciones;

/**
 *
 * @author ushio
 */
public class Main {
    public static void main(String[] args) {
        try {
            System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        } catch (java.io.UnsupportedEncodingException e) {
            // Si no soporta UTF-8 (muy raro), se continúa con la salida por defecto
        }
        System.out.println("=== SISTEMA E-COMMERCE Y MANEJO DE EXCEPCIONES ===");
        System.out.println("====================================================");

        // PARTE 1: E-COMMERCE
        System.out.println("\n--- PARTE 1: SISTEMA E-COMMERCE ---");

        Pedido pedido1 = new Pedido("Ana Lopez", "ana@email.com");
        pedido1.agregarProducto(new Producto("Laptop Gamer", 1500.0));
        pedido1.agregarProducto(new Producto("Mouse Inalambrico", 50.0));
        pedido1.mostrarDetalles();

        System.out.println("\n--- PROCESANDO PAGO CON TARJETA ---");
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9012-3456", 2000.0);
        pedido1.procesarPago(tarjeta);

        System.out.println("\n--- PROCESANDO PAGO CON PAYPAL ---");
        Pedido pedido2 = new Pedido("Diego Montes", "usuario@paypal.com");
        pedido2.agregarProducto(new Producto("Cargador USB", 25.0));
        PayPal paypal = new PayPal("usuario@paypal.com", 30.0);
        pedido2.procesarPago(paypal);

        // PARTE 2: EXCEPCIONES
        System.out.println("\n--- PARTE 2: MANEJO DE EXCEPCIONES ---");

        System.out.println("\n1) División segura:"); 
        CalculadoraSegura.dividir(10, 2);
        CalculadoraSegura.dividir(10, 0); // provocará ArithmeticException en tiempo de ejecución, atrapada

        System.out.println("\n2) Conversión de números:"); 
        ConversorNumeros.convertir("123");
        ConversorNumeros.convertir("12a3");

        System.out.println("\n3) Validación de edades:"); 
        int[] edades = {25, -5, 150, 30, 0};
        for (int edad : edades) {
            try {
                ValidadorEdad.validarEdad(edad);
            } catch (EdadInvalidaException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("\n4) Manejo de archivos:"); 
        // archivo inexistente para probar FileNotFoundException -> capturada dentro del método
        ManejadorArchivos.leerArchivo("datos_ejemplo.txt");
        System.out.println("Leyendo con try-with-resources:");
        ManejadorArchivos.leerConTryWithResources("datos_ejemplo.txt");

        System.out.println("\nPROGRAMA FINALIZADO CORRECTAMENTE");
    }
}
