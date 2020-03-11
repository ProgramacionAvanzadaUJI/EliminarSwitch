package gestor;

import data.Cliente;

import java.util.Scanner;

class NuevoCliente implements Accion {
    @Override
    public void ejecutaAccion(final GestorClientes gestor) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("NIF: ");
        String nif = teclado.next();
        System.out.print("Nombre: ");
        String nombre = teclado.next();
        gestor.clientes.put(nif, new Cliente(nif, nombre));
    }
}
