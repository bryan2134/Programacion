package cat.institutmvm.utils;

/**
 * Informacion sobre la luz
 *
 * @param Luz
 */
public class Luz {

    private int intensidad;
    private String color;

    /**
     *@return Inicializa mis atributos
     */
    public Luz(int inten, String color) {
        this.setInfo(inten, color);

    }

    /**
     * @return Regresa la intensidad de la luz
     */
    public int getIntensidad() {
        return this.intensidad;
    }

    /**
     * @return Regresa la el color de la luz
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Establece valor a los atributos
     *
     * @param setInfo
     */
    public void setInfo(int inten, String color) {
        this.intensidad = inten;
        this.color = color;
    }
}
