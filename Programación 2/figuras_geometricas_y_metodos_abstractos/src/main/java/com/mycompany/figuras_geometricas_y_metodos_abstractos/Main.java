/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.figuras_geometricas_y_metodos_abstractos;

import java.util.ArrayList;

/**
 *
 * @author ushio
 */
public class Main {
    public static void main(String[] args) {
        // Creación de arraylist polimórfico
        ArrayList<Figura> figuras = new ArrayList<>();
        
        // Agregar diferentes tipos de figuras
        figuras.add(new Rectangulo(4.0, 4.0, "Rectángulo 1"));
        figuras.add(new Rectangulo(6.0, 4.0, "Rectángulo 2"));
        figuras.add(new Circulo(10, "Círculo 1"));
        figuras.add(new Circulo(15, "Círculo 2"));
        
        // Procesamiento polimórfico
        for(Figura figura : figuras) {
            figura.calcularArea(); // Llamada dinámica al método apropiado
        }
    }
}
