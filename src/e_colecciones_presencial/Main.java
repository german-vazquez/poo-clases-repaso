package e_colecciones_presencial;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


    Jugador alonso= new Jugador(8, "Alonso", false,true);
    Jugador messi= new Jugador(7, "Messi", false,true);

    Equipo millonarios = new Equipo("millonarios");
    millonarios.agregarJugador(alonso);
    millonarios.agregarJugador(messi);
    List<Jugador> listaJugadores = millonarios.getJugadores();

        for (int i = 0; i < listaJugadores.size(); i++) {
            System.out.println("jugador:" + listaJugadores.get(i).getNombre());

        }

    }

}
