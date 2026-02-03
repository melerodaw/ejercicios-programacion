/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author Alberto
 */
public class Empleado {
    private String nombre;
    private double salario;
    private Proyecto[] proyectos;

    public Empleado() {
        this.nombre = "";
        this.salario = 0;
        this.proyectos = null;
    }
    
    public Empleado(String nombre, double salario, Proyecto[] proyectos) {
        this.nombre = nombre;
        this.salario = salario;
        this.proyectos = proyectos;
    }
    
    public Empleado(Empleado empleado1) {
        this.nombre = empleado1.nombre;
        this.salario = empleado1.salario;
        this.proyectos = empleado1.proyectos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Proyecto[] getProyectos() {
        return proyectos;
    }

    public void setProyectos(Proyecto[] proyectos) {
        this.proyectos = proyectos;
    }
    
    void asignarEmpleado(){
    
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", salario=" + salario + '}';
    }
    
    
}
