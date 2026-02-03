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
    private Proyecto proyecto;

    public Participacion() {
        this.horasTrabajadas = 0;
        this.empleado = null;
        this.proyecto = null;
    }
    
    public Participacion(double horasTrabajadas, Empleado empleado, Proyecto proyecto) {
        this.horasTrabajadas = horasTrabajadas;
        this.empleado = empleado;
        this.proyecto = proyecto;
    }
    
    public Participacion(Participacion p1) {
        this.horasTrabajadas = p1.horasTrabajadas;
        this.empleado = p1.empleado;
        this.proyecto = p1.proyecto;
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

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
    
    double calcularCosteTotal(String nombreProyecto){
        double costeTotal = 0;
        
        return costeTotal;
    }
    
    @Override
    public String toString() {
        return "Participacion{" + "horasTrabajadas=" + horasTrabajadas + ", empleado=" + empleado + ", proyecto=" + proyecto + '}';
    }
    
    
}
