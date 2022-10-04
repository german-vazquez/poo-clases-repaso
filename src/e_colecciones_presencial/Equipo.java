package e_colecciones_presencial;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> jugadores;
    private Jugador jugador;


    public Equipo(String nombre){
        this.nombre=nombre;
        this.jugadores=new ArrayList<>();
    }


    public Jugador agregarJugador(Jugador jugador){
        jugadores.add(jugador);
        return jugador;
    }

    public List<Jugador> mostrarJugadoresTitulares() {
        return jugadores;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public Integer cantidadJugadoresLesionados(){
        return jugadores.size();
    }
}
