package restaurant;

public class Cliente{
    private final String nombre;
    private final int index;

    public Cliente(String nombre, int index) {
        this.nombre = nombre;
        this.index = index;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIndex() {
        return index;
    }
}
