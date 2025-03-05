package Ejercicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private Map<Integer, Ubicacion> ubicaciones;
    private Scanner scanner;

    public Main() {

        ubicaciones = new HashMap<>();
        scanner = new Scanner(System.in);

        ubicaciones.put(0, new Ubicacion(0, "Estás sentado en la clase de programación"));
        ubicaciones.put(1, new Ubicacion(1, "Estás en la cima de una montaña"));
        ubicaciones.put(2, new Ubicacion(2, "Estás bañándote en la playa"));
        ubicaciones.put(3, new Ubicacion(3, "Estás dentro de un edificio muy alto"));
        ubicaciones.put(4, new Ubicacion(4, "Estás de pie en un puente"));
        ubicaciones.put(5, new Ubicacion(5, "Estás en un bosque"));

        ubicaciones.get(1).addExit("N", 5);
        ubicaciones.get(1).addExit("S", 3);
        ubicaciones.get(1).addExit("E", 4);
        ubicaciones.get(1).addExit("O", 2);
        ubicaciones.get(1).addExit("Q", 0);

        ubicaciones.get(2).addExit("N", 5);
        ubicaciones.get(2).addExit("S", 1);
        ubicaciones.get(2).addExit("E", 4);
        ubicaciones.get(2).addExit("Q", 0);

        ubicaciones.get(3).addExit("N", 1);
        ubicaciones.get(3).addExit("Q", 0);

        ubicaciones.get(4).addExit("N", 1);
        ubicaciones.get(4).addExit("S", 2);
        ubicaciones.get(4).addExit("Q", 0);

        ubicaciones.get(5).addExit("N", 1);
        ubicaciones.get(5).addExit("S", 2);
        ubicaciones.get(5).addExit("Q", 0);

    }

    public void iniciarJuego(){
        int ubicacionActual=1;
        String entradaUsuario;

        do{
            Ubicacion ubicacion= ubicaciones.get(ubicacionActual);
            System.out.println("\n" + ubicacion.getDescripcion());

            System.out.println("Salidas disponibles");
            for (String direccion : ubicacion.getUbicacion().keySet()) {
                System.out.print(direccion + " ");
            }
            System.out.println("\nIngrese una dirección (o 'Q' para salir):");

            entradaUsuario = scanner.nextLine().toUpperCase();

            if (ubicacion.getUbicacion().containsKey(entradaUsuario)) {
                ubicacionActual = ubicacion.getUbicacion().get(entradaUsuario);
            } else if (!entradaUsuario.equals("Q")) {
                System.out.println("No puede ir en esa dirección.");
            }

        } while (!entradaUsuario.equals("Q"));

        System.out.println("¡Gracias por jugar! Has salido del juego.");
    }

    public static void main(String[] args) {
        Main juego = new Main();
        juego.iniciarJuego();
    }
}


