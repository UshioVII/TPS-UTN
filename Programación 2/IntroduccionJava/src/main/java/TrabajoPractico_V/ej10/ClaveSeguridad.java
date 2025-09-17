/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico_V.ej10;

/**
 *
 * @author ushio
 */


import java.time.LocalDate;

public class ClaveSeguridad {
    private String codigo;
    private LocalDate ultimaModificacion;

    public ClaveSeguridad(String codigo, LocalDate ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }
}
