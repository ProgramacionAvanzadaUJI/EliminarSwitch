package gestor;

import data.Cliente;

import java.util.HashMap;
import java.util.Map;

public class GestorClientes {
    static final Cliente CLIENTE_NO_ENCONTRADO = new Cliente("", "Cliente no encontrado");
    Map<String, Cliente> clientes;

    public enum OpcionesMenu {
        SALIR("Salir.", new Salir()),
        NUEVO_CLIENTE("Añadir un nuevo cliente.", new NuevoCliente()),
        BORRAR_CLIENTE("Borrar un cliente existente.", new BorrarCliente()),
        BUSCAR_CLIENTE("Buscar un cliente por nif.", new BuscarCliente()),
        LISTAR_TODOS("Listar todos los clientes.", new ListarClientes());

        private String textoOpcion;
        private Accion accion;

        private OpcionesMenu(final String textoOpcion, final Accion accion) {
            this.textoOpcion = textoOpcion;
            this.accion = accion;
        }

        public static OpcionesMenu getOpcion(int posicion) {
            return values()[posicion];
        }

        public static String getMenu() {
            StringBuilder sb = new StringBuilder();
            for(OpcionesMenu opcion: OpcionesMenu.values()) {
                sb.append(opcion.ordinal());
                sb.append(".- ");
                sb.append(opcion.textoOpcion);
                sb.append("\n");
            }
            return sb.toString();
        }

        public void ejecutaOpcion(GestorClientes gestor) {
            accion.ejecutaAccion(gestor);
        }
    }

    public GestorClientes() {
        clientes = new HashMap<>();
    }

    public void ejecutaOpcion(OpcionesMenu opcion) {
        opcion.ejecutaOpcion(this);
    }
}
