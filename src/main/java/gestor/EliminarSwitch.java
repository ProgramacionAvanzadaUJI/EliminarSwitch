package gestor;

import java.util.Scanner;

public class EliminarSwitch {
    private final transient Scanner teclado = new Scanner(System.in);
    private final GestorClientes gestor = new GestorClientes();


    public void run() {
        GestorClientes.OpcionesMenu opcion;

        do {
            mostrarMenu();
            opcion = pedirOpcion();
            gestor.ejecutaOpcion(opcion);
            teclado.reset();
        } while (opcion != GestorClientes.OpcionesMenu.SALIR);
    }

    private void mostrarMenu() {
        System.out.println(GestorClientes.OpcionesMenu.getMenu());
    }

    private GestorClientes.OpcionesMenu pedirOpcion() {
        System.out.print("Por favor, introduce una opción válida: ");
        return GestorClientes.OpcionesMenu.getOpcion(teclado.nextInt());
    }
}
