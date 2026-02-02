/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author Alberto
 */
public class Proyecto {
    private String nombre;
    private double presupuestoAsignado;

    public Proyecto() {
        this.nombre = "";
        this.presupuestoAsignado = 0;
    }
    
    public Proyecto(String nombre, double presupuestoAsignado) {
        this.nombre = nombre;
        this.presupuestoAsignado = presupuestoAsignado;
    }
    
    public Proyecto(Proyecto proyecto1) {
        this.nombre = proyecto1.nombre;
        this.presupuestoAsignado = proyecto1.presupuestoAsignado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPresupuestoAsignado() {
        return presupuestoAsignado;
    }

    public void setPresupuestoAsignado(double presupuestoAsignado) {
        this.presupuestoAsignado = presupuestoAsignado;
    }
    
    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", presupuestoAsignado=" + presupuestoAsignado + '}';
    }
    
}
