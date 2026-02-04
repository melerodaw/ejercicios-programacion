/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author Alberto
 */
public class Participacion {
    private double horasTrabajadas;
    private Empleado empleado;

    public Participacion() {
        this.horasTrabajadas = 0;
        this.empleado = null;
    }
    
    public Participacion(double horasTrabajadas, Empleado empleado) {
        this.horasTrabajadas = horasTrabajadas;
        this.empleado = empleado;
    }
    
    public Participacion(Participacion p1) {
        this.horasTrabajadas = p1.horasTrabajadas;
        this.empleado = p1.empleado;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void setProyecto(Proyecto proyecto) {
    }
    
    @Override
    public String toString() {
        return "Participacion{" + "horasTrabajadas=" + horasTrabajadas + ", empleado=" + empleado + '}';
    }
    
    
}
