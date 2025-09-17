/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico_V.ej8;

/**
 *
 * @author ushio
 */

import java.time.LocalDate;

public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma;

    public Documento(String titulo, String contenido, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(generateHash(contenido), LocalDate.now(), usuario);
    }

    private String generateHash(String contenido) {
        return Integer.toHexString(contenido.hashCode());
    }

    public FirmaDigital getFirma() {
        return firma;
    }
}
