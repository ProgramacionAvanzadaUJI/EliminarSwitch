package data;

public class Cliente {
    private String nif;
    private String nombre;

    public Cliente(String nif, String nombre) {
        this.nif = nif;
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    @Override
    public String toString() {
        return "NIF:" + nif + ", Nombre: " + nombre;
    }
}
