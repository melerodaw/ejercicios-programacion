/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author Alberto
 */
public class Partida {
    private int duracion;
    private Jugador[] jugadores;

    public Partida(){
        this.duracion = 0;
        this.jugadores = null;
    }
    
    public Partida(int duracion, Jugador[] jugadores) {
        this.duracion = duracion;
        this.jugadores = jugadores;
    }
    
    public Partida(Partida p1) {
        this.duracion = p1.duracion;
        this.jugadores = p1.jugadores;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    void añadirJugador(Jugador j){
        
        if(this.jugadores == null) {
            this.jugadores = new Jugador[1];
            this.jugadores[0] = j;
        } else {
            // crear array auxiliar
            Jugador[] nuevoArray = new Jugador[jugadores.length+1];
            // copiar el array
            for(int i = 0; i < jugadores.length; i++){
                nuevoArray[i] = jugadores[i];
            }
            // agregar el nuevo jugador
            nuevoArray[nuevoArray.length-1] = j;
            // guardar el nuevo array donde estaba el anterior
            this.jugadores = nuevoArray;
            System.out.println("Jugador añadido.");
        }
            
    }
    void finalizarPartida(){
        for(int i = 0; i < jugadores.length; i++){
            jugadores[i].subirNivel();
        }        
        System.out.println("Partida finalizada.");
    }
    
    // no podemos usar este toString habiendo un array, porque mostraria su direccion de memoria
    /*
        @Override
    public String toString() {
        return "Partida{" + "duracion=" + duracion + ", jugadores=" + jugadores + '}';
    }
    */

    @Override
    public String toString() {
    String nombresJugadores = "";
    
    if (this.jugadores != null) {
        for (int i = 0; i < this.jugadores.length; i++) {
            // agregamos el nombre de cada jugador a la variable
            nombresJugadores += this.jugadores[i].getNombre(); 
            
            // meto separacion si no es el ultimo
            if(i < this.jugadores.length - 1){
                nombresJugadores += ", ";
            }
        }
    } else {
        nombresJugadores = "Sin jugadores";
    }

    return "Partida { Duracion: " + duracion + ", Jugadores={" + nombresJugadores + "} }";
}
    
    
}
