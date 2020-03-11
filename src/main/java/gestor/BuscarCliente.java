package gestor;

import data.Cliente;

import java.util.Scanner;

class BuscarCliente implements Accion {
    @Override
    public void ejecutaAccion(GestorClientes gestor) {
        System.out.print("Introduzca el NIF: ");
        Scanner teclado = new Scanner(System.in);
        String nif = teclado.next();
        Cliente cliente = gestor.clientes.containsKey(nif) ? gestor.clientes.get(nif) : GestorClientes.CLIENTE_NO_ENCONTRADO;
        System.out.println(cliente);
    }
}
