import java.util.Queue;
import java.util.Scanner;

public class Utils {
    public Queue<Persona> Ingresar(Queue<Persona> cola, Scanner sc) {
        boolean bandera = true;
        String opcion1 = "";
        while (bandera) {
                Persona o = new Persona();
                System.out.println("Ingrese el nombre");
                while (sc.hasNextInt()) {
                    System.out.println("Solo caracteres");
                    sc.next();
                }
                o.setNombre(sc.next());
                System.out.println("Ingrese la cedula");
                while (!sc.hasNextInt()) {
                    System.out.println("Solo datos numericos");
                    sc.next();
                }
                o.setCedula(sc.nextInt());
                System.out.println("ingrese la edad");
                while (!sc.hasNextInt()) {
                    System.out.println("Solo datos numericos");
                    sc.next();
                }
                o.setEdad(sc.nextInt());
                System.out.println("Desplazado?");
                while (sc.hasNextInt()) {
                    System.out.println("Solo caracteres");
                    sc.next();
                }
                opcion1 = sc.next();
                if (opcion1.equalsIgnoreCase("Si")) {
                    o.setDesplazado(true);
                }
                if (opcion1.equalsIgnoreCase("No")) {
                    o.setDesplazado(false);
                }

                else {
                    System.out.println("Respuesta invalida");
                    o.setDesplazado(false);
                }
                System.out.println("Ingrese el estrato");
                while (!sc.hasNextInt()) {
                    System.out.println("Solo datos numericos");
                    sc.next();
                }
                o.setEstrato(sc.nextInt());

                cola.add(o);
                auxilio(cola);

                System.out.println("Desea ingresar otra persona?");
                System.out.println("Si o No");
                opcion1 = sc.next();
                if (opcion1.equalsIgnoreCase("No")) {
                    bandera = false;
                }
        }

        return cola;
    }

    public Queue<Persona> auxilio(Queue<Persona> cola) {

        for (Persona o : cola) {
            if (o.getEdad() > 0 && o.getEdad() <= 18) {

                if (o.getEstrato() <= 2 && o.getEstrato() > 0) {
                    if (o.isDesplazado()) {
                        o.setAuxilio(80);
                    }
                }
                if (!o.isDesplazado()) {
                    if (o.getEstrato() <= 2 && o.getEstrato() > 0) {
                        o.setAuxilio(0);
                    }
                }
            }
            if (o.getEdad() > 18) {

                if (o.getEstrato() <= 2 && o.getEstrato() > 0) {
                    if (o.isDesplazado()) {
                        o.setAuxilio(10);
                    }
                }
                if (!o.isDesplazado()) {
                    if (o.getEstrato() <= 2 && o.getEstrato() > 0) {
                        o.setAuxilio(0);
                    }
                }
            }
        }
        return cola;
    }


    public void mostrar(Queue<Persona> cola) {
        for (Persona o : cola) {
            System.out.println("Nombre: " + o.getNombre());
            System.out.println("Cedula: " + o.getCedula());
            System.out.println("Edad: " + o.getEdad());
            System.out.println("Estrato: " + o.getEstrato());
            if (o.isDesplazado()) {
                System.out.println("Es desplazado");
            }
            if (!o.isDesplazado()) {
                System.out.println("No es desplazado");
            }
            System.out.println("Auxilio: " + o.getAuxilio() + "%");
            System.out.println("------------------");
            System.out.println();
        }
    }

}