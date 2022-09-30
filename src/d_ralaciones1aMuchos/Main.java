package d_ralaciones1aMuchos;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Rodolfo");
        empleado1.setEdad(33);
        empleado1.setFechaIncorporacion(new Date(89, 5, 2));

        Empleado empleado2 = new Empleado();
        empleado2.setNombre("Nicolas");
        empleado2.setEdad(28);
        empleado2.setFechaIncorporacion(new Date(90, 5, 2));

        Empleado empleado3 = new Empleado();
        empleado3.setNombre("Javier");
        empleado3.setEdad(39);
        empleado3.setFechaIncorporacion(new Date(95, 5, 2));

        Empresa donbarredora = new Empresa();
        donbarredora.setRazonSocial("Don Barredora");
        donbarredora.incorporarEmpleado(empleado1);
        donbarredora.incorporarEmpleado(empleado2);
        donbarredora.incorporarEmpleado(empleado3);

        System.out.println("lista de empleados");
        donbarredora.mostrarEmpleados();
        System.out.println("");
        System.out.println("empleados ordenados por edad");
        donbarredora.mostrarEmpleadosPorEdad();

    }
}
