import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Menu {
    public void menu() {
        Scanner sc = new Scanner(System.in);
        Queue<Persona> personas = new LinkedList<>();
        boolean bandera = true;
        int opt1 = 0;
        Utils u = new Utils();

        System.out.println("Bienvenido al censo de medellin");

        while (bandera) {
            System.out.println("1. Ingresar Persona, 2.Mostrar registros, 3. salir");
            while (!sc.hasNextInt()) {
                System.out.println("ingrese datos numericos");
                sc.next();
            }
            opt1 = sc.nextInt();

            System.out.println();
            if (opt1 < 1 || opt1 > 2) {
                System.out.println("Opcion invalida");
                continue;
            }

            switch (opt1) {
                case 1:
                    u.Ingresar(personas, sc);
                    break;
                case 2:
                    u.mostrar(personas);
                    break;

                case 3:
                    bandera = false;
                    break;
                default:
                    System.out.println("Pagina en remodelacion");
                    break;
            }
        }

    }
}
