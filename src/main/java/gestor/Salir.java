package gestor;

class Salir implements Accion {
    @Override
    public void ejecutaAccion(GestorClientes gestor) {
        System.out.println("Adios.");
    }
}
