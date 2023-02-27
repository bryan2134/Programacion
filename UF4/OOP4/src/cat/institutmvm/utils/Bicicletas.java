package cat.institutmvm.utils;

public class Bicicletas {

    private int mide, velocidad, precio;
    private String nombre, material;

    public Bicicletas(String tipo, String material, int mida, int velocidad, int precio) {
        this.setDatos(tipo, material, mida, velocidad, precio);
    }

    public String getTipo() {
        return this.nombre;
    }

    public String getMaterial() {
        return this.material;
    }

    public int getMide() {
        return this.mide;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setDatos(String tipo, String material, int mida, int velocidad, int precio) {
        this.mide = mida;
        this.nombre = tipo;
        this.material = material;
        this.velocidad = velocidad;
        this.precio = precio;
    }
}
