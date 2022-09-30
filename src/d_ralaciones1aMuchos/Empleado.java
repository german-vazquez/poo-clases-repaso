package d_ralaciones1aMuchos;

import java.util.Date;

public class Empleado implements Comparable<Empleado>{
    private String nombre;
    private Integer edad;
    private Date fechaIncorporacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Date getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(Date fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public int calcularAntiguedad(){
        Date fechaActual = new Date();
        return fechaActual.getYear() - fechaIncorporacion.getYear();
    }

    // utilizaremos la edad para ordenar

    @Override
    public int compareTo(Empleado o) {
        return this.getEdad() - o.getEdad();
    }



}
