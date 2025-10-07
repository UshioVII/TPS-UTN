/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemauniversidadrelacionbidireccional;

/**
 *
 * @author ushio
 */
public class MainUniversidad {
    public static void main(String[] args) {
        Universidad universidad = new Universidad("Universidad Nacional");
        
        // Crear profesores
        Profesor prof1 = new Profesor("P001", "Dr. Martínez", "Matemáticas");
        Profesor prof2 = new Profesor("P002", "Dra. González", "Literatura");
        Profesor prof3 = new Profesor("P003", "Dr. Rodríguez", "Historia");
        
        // Crear cursos
        Curso curso1 = new Curso("MAT101", "Cálculo I");
        Curso curso2 = new Curso("MAT102", "Álgebra Lineal");
        Curso curso3 = new Curso("LIT201", "Literatura Española");
        Curso curso4 = new Curso("HIS301", "Historia Antigua");
        Curso curso5 = new Curso("MAT103", "Estadística");
        
        // Agregar a la universidad
        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);
        
        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);
        
        System.out.println("\n--- Asignar profesores a cursos ---");
        universidad.asignarProfesorACurso("MAT101", "P001");
        universidad.asignarProfesorACurso("MAT102", "P001");
        universidad.asignarProfesorACurso("LIT201", "P002");
        universidad.asignarProfesorACurso("HIS301", "P003");
        universidad.asignarProfesorACurso("MAT103", "P001");
        
        System.out.println("\n--- Listar cursos con profesores ---");
        universidad.listarCursos();
        
        System.out.println("\n--- Listar profesores con sus cursos ---");
        universidad.listarProfesores();
        
        System.out.println("\n--- Cambiar profesor de un curso ---");
        universidad.asignarProfesorACurso("MAT103", "P002");
        
        System.out.println("\n--- Reporte de cursos por profesor ---");
        universidad.mostrarReporteCursosPorProfesor();
        
        System.out.println("\n--- Eliminar un curso ---");
        universidad.eliminarCurso("MAT102");
        
        System.out.println("\n--- Estado final después de eliminaciones ---");
        universidad.listarCursos();
        universidad.listarProfesores();
    }
}
