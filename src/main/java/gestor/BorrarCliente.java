package gestor;

import java.util.Scanner;

class BorrarCliente implements Accion {
    @Override
    public void ejecutaAccion(GestorClientes gestor) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("NIF: ");
        gestor.clientes.remove(teclado.next());
    }
}
