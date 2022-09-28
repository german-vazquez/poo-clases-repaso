package preparcial1;

public class ExamenParcial extends Examen {

    private Integer unidad;
    private Integer reintento;

    public ExamenParcial(String titulo, String enunciado, Integer nota, Alumno alumno, Integer unidad, Integer reintento) {
        super(titulo, enunciado, nota, alumno);
        this.unidad = unidad;
        this.reintento = reintento;
    }

    @Override
    public boolean estaAprobado() {
        return getNota() >= 4;
    }

    public boolean esRecuperable() {
        return (unidad > 3 && reintento < 3 || unidad <= 3 && reintento < 4);
    }
}
