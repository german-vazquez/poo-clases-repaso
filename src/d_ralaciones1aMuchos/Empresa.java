package d_ralaciones1aMuchos;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String razonSocial;
    private List<Empleado> empleados = new ArrayList<>();

    public void incorporarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public Integer cantidadEmpleados() {
        return empleados.size();
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public void mostrarEmpleados(){
        for (Empleado empleado: empleados) {
            System.out.println(empleado.getNombre());
        }
    }

    public void mostrarEmpleadosPorEdad(){
        empleados.sort(null);
        mostrarEmpleados();
    }
}
