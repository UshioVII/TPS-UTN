/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaces_excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author ushio
 */
public class ManejadorArchivos {

    public static void leerArchivo(String nombreArchivo) {
        try {
            // Ruta directa dentro del proyecto (como hace el profesor)
            String ruta = "src/main/java/com/mycompany/interfaces_excepciones/" + nombreArchivo;
            FileReader archivo = new FileReader(ruta);
            BufferedReader lector = new BufferedReader(archivo);
            
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
            
            lector.close(); // se cierra manualmente el recurso
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void leerConTryWithResources(String nombreArchivo) {
        // Versión con try-with-resources (idéntica a la del profe)
        String ruta = "src/main/java/com/mycompany/interfaces_excepciones/" + nombreArchivo;
        try (BufferedReader lector = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error con try-with-resources: " + e.getMessage());
        }
    }
}
