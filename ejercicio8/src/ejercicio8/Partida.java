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
        
    }
    void finalizarPartida(){
        
    }
    
    @Override
    public String toString() {
        return "Partida{" + "duracion=" + duracion + ", jugadores=" + jugadores + '}';
    }
    
    
}
