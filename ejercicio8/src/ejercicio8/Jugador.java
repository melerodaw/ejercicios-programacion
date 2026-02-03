/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author Alberto
 */
public class Jugador {
    private String nombre;
    private int nivel;

    public Jugador() {
        this.nombre = "";
        this.nivel = 0;
    }
    
     public Jugador(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }
    
     public Jugador(Jugador j1) {
        this.nombre = j1.nombre;
        this.nivel = j1.nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    void subirNivel(){
        this.nivel++;
    }
    
    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", nivel=" + nivel + '}';
    }
    
    
}
