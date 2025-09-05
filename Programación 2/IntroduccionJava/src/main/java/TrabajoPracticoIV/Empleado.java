/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPracticoIV;

/**
 *
 * @author ushio
 */
public class Empleado {
    
    // Atributos Encapsulados
    private int id;
    private String nombre;
    private String puesto;
    private Double salario;

    // Contador Global de empleados y  soporte para Id (Estaticos)
    private static int totalEmpleados = 0;
    private static int proximoId = 1;
    
    // Getters
    public int getId() {
    return id;
    }
    
    public String getNombre(){
    return nombre;
    }
    
    public String getPuesto(){
    return puesto;
    }
    
    public double getSalario() { 
    return salario; 
    }
    
    // Setters
    public void setNombre(String nombre){
    this.nombre = nombre;
    }
    
    public void setPuesto(String puesto){
    this.puesto = puesto; 
    }
    
    public void setSalario(Double salario){
    this.salario = salario;
    }
    
    // Constructor que recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
    this.id = id;
    this.nombre = nombre;
    this.puesto = puesto;
    this.salario = salario;

    totalEmpleados++;

    if (id >= proximoId) {
        proximoId = id + 1;
        }
    }
    
    
    // Contruuctor que asigna Id automatico y salrio por defecto
    public Empleado(String nombre, String puesto) {
    this.id = proximoId++; // ID automático
    this.nombre = nombre;
    this.puesto = puesto;
    this.salario = 0.0; // salario por defecto

    totalEmpleados++;
    }
    
    public void actualizarSalario(double porcentaje) {
     if (porcentaje > 0) {
         this.salario += this.salario * (porcentaje / 100);
        }
    }

    public void actualizarSalario(int montoFijo) {
    if (montoFijo > 0) {
        this.salario += montoFijo;
        }
    }
    
    @Override
    public String toString() {
    return "Empleado {" +
               "ID=" + id +
               ", Nombre='" + nombre + '\'' +
               ", Puesto='" + puesto + '\'' +
               ", Salario=" + salario +
               '}';
    }

    public static int mostrarTotalEmpleados() {
    return totalEmpleados;
    }
    
}
