package e_colecciones_presencial;

public class Jugador implements Comparable<Jugador> {
    private Integer nroCamiseta;
    private String nombre;
    private boolean lesionado;
    private boolean titular;

    public Jugador(Integer nroCamiseta, String nombre, boolean lesionado, boolean titular) {
        this.nroCamiseta = nroCamiseta;
        this.nombre = nombre;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    @Override
    public int compareTo(Jugador o) {
        return 0;
    }

    public Integer getNroCamiseta() {
        return nroCamiseta;
    }

    public void setNroCamiseta(Integer nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }
}
