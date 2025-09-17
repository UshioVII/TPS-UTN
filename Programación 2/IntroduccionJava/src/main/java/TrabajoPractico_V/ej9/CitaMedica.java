/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico_V.ej9;

/**
 *
 * @author ushio
 */

import java.time.*;

public class CitaMedica {
    private LocalDate fecha;
    private LocalTime hora;
    private Paciente paciente;
    private Profesional profesional;

    public CitaMedica(LocalDate f, LocalTime h, Paciente p, Profesional prof) {
        this.fecha = f;
        this.hora = h;
        this.paciente = p;
        this.profesional = prof;
    }
}
