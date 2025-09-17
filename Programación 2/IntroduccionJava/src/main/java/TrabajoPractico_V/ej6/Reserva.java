/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico_V.ej6;

/**
 *
 * @author ushio
 */

import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
    private LocalDate fecha;
    private LocalTime hora;
    private Cliente cliente;
    private Mesa mesa;

    public Reserva(LocalDate fecha, LocalTime hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }
}
