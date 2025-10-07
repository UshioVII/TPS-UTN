/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema_biblioteca_y_libros;

import java.util.List;

/**
 *
 * @author ushio
 */
public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        
        // Crear autores
        Autor autor1 = new Autor("A1", "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("A2", "Jorge Luis Borges", "Argentina");
        Autor autor3 = new Autor("A3", "Isabel Allende", "Chilena");
        
        // Agregar libros
        biblioteca.agregarLibro("9788437604947", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("9788478884458", "El aleph", 1949, autor2);
        biblioteca.agregarLibro("9788401337200", "La casa de los espíritus", 1982, autor3);
        biblioteca.agregarLibro("9780307474728", "Crónica de una muerte anunciada", 1981, autor1);
        biblioteca.agregarLibro("9788466338141", "Ficciones", 1944, autor2);
        
        System.out.println("\n--- Listar todos los libros ---");
        biblioteca.listarLibros();
        
        System.out.println("\n--- Buscar libro por ISBN ---");
        Libro libroEncontrado = biblioteca.buscarLibroPorIsbn("9788437604947");
        if (libroEncontrado != null) {
            libroEncontrado.mostrarInfo();
        }
        
        System.out.println("\n--- Filtrar libros por año 1949 ---");
        List<Libro> libros1949 = biblioteca.filtrarLibrosPorAnio(1949);
        for (Libro libro : libros1949) {
            libro.mostrarInfo();
        }
        
        System.out.println("\n--- Cantidad total de libros ---");
        System.out.println("Total de libros: " + biblioteca.obtenerCantidadLibros());
        
        System.out.println("\n--- Mostrar autores disponibles ---");
        biblioteca.mostrarAutoresDisponibles();
    }
}
