package a_preparcial1;


public class ExamenFinal extends Examen implements Comparar {

    private Integer notaOral;
    private String tema;

    public ExamenFinal(String titulo, String enunciado, Integer nota, Alumno alumno, Integer notaOral, String tema) {
        super(titulo, enunciado, nota, alumno);
        this.notaOral = notaOral;
        this.tema = tema;
    }

    @Override
    public boolean estaAprobado() {
        return (getNota() >= 4 && notaOral >= 4);
    }

    public Integer comparar(ExamenFinal o){
        Integer notaFinalPromedio=(getNota()+this.notaOral)/2;
        Integer notaFinal2Promedio = (o.getNota()+o.getNotaOral())/2;
        //si notaFinal1Promedio > notaFinal2Promedio ->1
        //si notaFinal1Promedio < notaFinal2Promedio -> 2
        // si notaFinal1Promedio == notaFinal2Promedio ->0
        return 1;
    }

    public Integer getNotaOral() {
        return notaOral;
    }
}
