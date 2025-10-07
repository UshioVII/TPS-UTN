/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemauniversidadrelacionbidireccional;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ushio
 */

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;
    
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }
    
    public void agregarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
            // Sincronizar el lado del curso
            if (curso.getProfesor() != this) {
                curso.setProfesor(this);
            }
        }
    }
    
    public void eliminarCurso(Curso curso) {
        if (cursos.contains(curso)) {
            cursos.remove(curso);
            // Sincronizar el lado del curso
            if (curso.getProfesor() == this) {
                curso.setProfesor(null);
            }
        }
    }
    
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println(nombre + " no dicta ningún curso.");
            return;
        }
        System.out.println("Cursos dictados por " + nombre + ":");
        for (Curso curso : cursos) {
            System.out.println("- " + curso.getNombre() + " (" + curso.getCodigo() + ")");
        }
    }
    
    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " | Especialidad: " + especialidad + 
                         " | Cursos: " + cursos.size());
    }
    
    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public List<Curso> getCursos() { return cursos; }
}