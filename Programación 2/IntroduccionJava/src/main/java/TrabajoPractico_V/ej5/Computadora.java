/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico_V.ej5;

/**
 *
 * @author ushio
 */


public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placa;
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, String placaModelo, String placaChipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placa = new PlacaMadre(placaModelo, placaChipset);
    }

    public void setPropietario(Propietario p) {
        this.propietario = p;
        if (p != null && p.getComputadora() != this) p.setComputadora(this);
    }

    public PlacaMadre getPlaca() {
        return placa;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public String getMarca() {
        return marca;
    }
}
