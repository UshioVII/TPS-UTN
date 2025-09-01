/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ushio
 */
public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            mostrarMenu();
            int opcion = leerOpcion(); // garantiza 0..5 o reintenta

            switch (opcion) {
                case 1 -> opcionEstudiante();
                case 2 -> opcionMascota();
                case 3 -> opcionLibro();
                case 4 -> opcionGallinas();
                case 5 -> opcionNave();
                case 0 -> {
                    System.out.println("¡Hasta luego!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Opción incorrecta, inténtelo de nuevo.");
            }
            System.out.println(); // línea en blanco entre opciones
        }
    }

    // -------- Menú --------
    private static void mostrarMenu() {
        System.out.println("========= MENÚ =========");
        System.out.println("1) Registro de Estudiantes");
        System.out.println("2) Registro de Mascotas");
        System.out.println("3) Encapsulamiento con Libro");
        System.out.println("4) Gestión de Gallinas");
        System.out.println("5) Simulación de Nave Espacial");
        System.out.println("0) Salir");
    }

    private static int leerOpcion() {
        while (true) {
            int opcion = leerEntero("Seleccione una opción: ");
            if (opcion >= 0 && opcion <= 5) return opcion;
            System.out.println("Opción incorrecta, inténtelo de nuevo.");
        }
    }

    // -------- Utilidades de entrada --------
    private static int leerEntero(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int n = sc.nextInt();
                sc.nextLine(); // limpiar salto de línea
                return n;
            } catch (InputMismatchException e) {
                sc.nextLine(); // descartar entrada inválida
                System.out.println("Opción inválida. Ingrese un número entero.");
            }
        }
    }

    private static String leerLinea(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    // -------- Opciones --------
    private static void opcionEstudiante() {
        System.out.println("\n---- Estudiante ----");
        String nombreEstudiante = leerLinea("Ingrese nombre del estudiante: ");
        String apellidoEstudiante = leerLinea("Ingrese apellido del estudiante: ");
        String curso = leerLinea("Ingrese curso: ");
        int calificacion = leerEntero("Ingrese calificación inicial: ");

        Estudiante estudiante1 = new Estudiante(nombreEstudiante, apellidoEstudiante, curso, calificacion);
        estudiante1.mostrarInfo();
        estudiante1.subirCalificacion(leerEntero("¿Cuántos puntos desea subir?: "));
        estudiante1.bajarCalificacion(leerEntero("¿Cuántos puntos desea bajar?: "));
        estudiante1.mostrarInfo();
    }

    private static void opcionMascota() {
        System.out.println("\n---- Mascota ----");
        String nombreMascota = leerLinea("Ingrese nombre de la mascota: ");
        String especie = leerLinea("Ingrese especie: ");
        int edadMascota = leerEntero("Ingrese edad: ");

        Mascota mascota1 = new Mascota(nombreMascota, especie, edadMascota);
        mascota1.mostrarInfo();
        System.out.println("Simulando un año...");
        mascota1.cumplirAnios();
        mascota1.mostrarInfo();
    }

    private static void opcionLibro() {
        System.out.println("\n---- Libro ----");
        String titulo = leerLinea("Ingrese título del libro: ");
        String autor = leerLinea("Ingrese autor: ");
        int anio = leerEntero("Ingrese año de publicación: ");

        Libro libro1 = new Libro(titulo, autor, anio);
        // Consigna: probar setter con un valor inválido y luego con uno válido
        libro1.setAnioPublicacion(leerEntero("Ingrese nuevo año de publicación (PRUEBA inválida): "));
        libro1.setAnioPublicacion(leerEntero("Ingrese nuevo año de publicación (PRUEBA válida): "));

        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Año: " + libro1.getAnioPublicacion());
    }

    private static void opcionGallinas() {
        System.out.println("\n---- Gallinas ----");
        System.out.println("Datos de la gallina 1:");
        int id1 = leerEntero("ID: ");
        int edad1 = leerEntero("Edad: ");
        int huevos1 = leerEntero("Huevos puestos: ");

        System.out.println("Datos de la gallina 2:");
        int id2 = leerEntero("ID: ");
        int edad2 = leerEntero("Edad: ");
        int huevos2 = leerEntero("Huevos puestos: ");

        Gallina gallina1 = new Gallina(id1, edad1, huevos1);
        Gallina gallina2 = new Gallina(id2, edad2, huevos2);

        // Acciones mínimas pedidas por la consigna:
        gallina1.ponerHuevo();
        gallina2.envejecer();

        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }

    private static void opcionNave() {
        System.out.println("\n---- Nave Espacial ----");
        String nombre = leerLinea("Ingrese nombre de la nave: ");
        NaveEspacial nave = new NaveEspacial(nombre, 50);
        System.out.println("Se creó la nave " + nombre + " con 50 unidades de combustible.");

        // Intento de avanzar sin recargar (puede fallar)
        int distancia1 = leerEntero("Intento 1) Distancia a avanzar SIN recargar: ");
        nave.avanzar(distancia1);

        // Recarga y avance correcto
        int recarga = leerEntero("¿Cuánto combustible desea recargar?: ");
        nave.recargarCombustible(recarga);
        nave.despegar();
        int distancia2 = leerEntero("Intento 2) Distancia a avanzar: ");
        nave.avanzar(distancia2);

        nave.mostrarEstado();
    }
}
