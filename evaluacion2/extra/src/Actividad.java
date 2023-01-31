import java.util.ArrayList;
import java.util.Collections;

public class Actividad{
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        Empleado empleado1 = new Empleado("1", 12,"pepe", Rol.BECARIO);
        Empleado empleado2 = new Empleado("2", 13,"jose", Rol.FIJO);
        Empleado empleado3 = new Empleado("3", 14,"ana", Rol.SECRETARIO);

        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        EmpleadoComparador empleadoComparador = new EmpleadoComparador();
        Collections.sort(empleados, empleadoComparador);

        for (Empleado e: empleados) {
            System.out.println(e);
        }
    }
}