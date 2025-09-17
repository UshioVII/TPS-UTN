/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico_V.ej13;

/**
 *
 * @author ushio
 */

public class GeneradorQR {
    public CodigoQR generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor + "-" + usuario.getNombre());
        return qr;
    }
}
