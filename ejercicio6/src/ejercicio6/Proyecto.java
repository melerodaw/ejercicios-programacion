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
    private Participacion[] participaciones;

    public Proyecto() {
        this.nombre = "";
        this.presupuestoAsignado = 0;
        this.participaciones = null;
    }
    
    public Proyecto(String nombre, double presupuestoAsignado, Participacion[] participaciones) {
        this.nombre = nombre;
        this.presupuestoAsignado = presupuestoAsignado;
        this.participaciones = participaciones;
    }
    
    public Proyecto(Proyecto proyecto1) {
        this.nombre = proyecto1.nombre;
        this.presupuestoAsignado = proyecto1.presupuestoAsignado;
        this.participaciones = proyecto1.participaciones;
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
    
    void asignarEmpleado(Empleado empleado, int horas){
            if (this.participaciones == null) {
            this.participaciones = new Participacion[1];
            this.participaciones[0] = new Participacion(horas, empleado);
            } else {
            Participacion[] nuevoArray = new Participacion[participaciones.length+1];

            for (int i = 0; i < participaciones.length; i++) {
                nuevoArray[i] = participaciones[i];
            }

            nuevoArray[nuevoArray.length - 1] = new Participacion(horas, empleado);

            participaciones = nuevoArray;
            }
    }
    
    double calcularCosteTotal(){
        double total = 0;
        
        if(participaciones != null){
            for(int i = 0; i < participaciones.length; i++){
                // total = horas de la participacion * el salario del empleado de esa participación
                total += participaciones[i].getHorasTrabajadas() * participaciones[i].getEmpleado().getSalario();
            }
        }
        return total;
    }
    
    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", presupuestoAsignado=" + presupuestoAsignado + '}';
    }
    
}
