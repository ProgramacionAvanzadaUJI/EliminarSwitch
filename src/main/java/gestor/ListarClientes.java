package gestor;

import data.Cliente;

class ListarClientes implements Accion {
    @Override
    public void ejecutaAccion(GestorClientes gestor) {
        for(Cliente cliente: gestor.clientes.values()) {
            System.out.println(cliente);
        }
    }
}
