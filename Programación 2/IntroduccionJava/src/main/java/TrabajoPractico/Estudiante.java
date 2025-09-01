/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico;

/**
 *
 * @author ushio
 */
public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    int calificacion;

    public Estudiante(String nombre, String apellido, String curso, int calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public void mostrarInfo() {
        System.out.println(nombre + " " + apellido + " - Curso: " + curso + " - Calificación: " + calificacion);
    }

    public void subirCalificacion(int puntos) {
        calificacion += puntos;
        System.out.println("Subió la calificación en " + puntos + " puntos.");
    }

    public void bajarCalificacion(int puntos) {
        calificacion -= puntos;
        if (calificacion < 0) calificacion = 0;
        System.out.println("Bajó la calificación en " + puntos + " puntos.");
    }
}
