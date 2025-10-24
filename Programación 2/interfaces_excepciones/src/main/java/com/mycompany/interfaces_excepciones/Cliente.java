/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaces_excepciones;

/**
 *
 * @author ushio
 */
public class Cliente implements Notificable {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() { return nombre; }
    public String getEmail() { return email; }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificación a " + nombre + " (" + email + "): " + mensaje);
    }

    @Override
    public String toString() {
        return nombre + " <" + email + ">";
    }
}
