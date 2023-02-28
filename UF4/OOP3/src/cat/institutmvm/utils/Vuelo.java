package cat.institutmvm.utils;

/**
 * Informacion sobre el contenido de un vuelo
 *
 * @param Carta
 */
public class Vuelo {

    private String origen;
    private String destino;
    private int duracion;

    /**
     * @return Inicializa mis atributos
     */
    public Vuelo(String origen, String desti, int tiempo) {
        this.setVuelo(origen, desti, tiempo);
    }

    /**
     * @return Regresa informacio n sobre oigen del vuelo
     */
    public String getOrigen() {
        return this.origen;
    }

    /**
     * @return Regresa informacion sobre el destinodel vuelo
     */
    public String getDestino() {
        return this.destino;
    }

    /**
     * @return Regresa informacion sobre la duracion del vuelo
     */
    public int getDuracion() {
        return this.duracion;
    }

    /**
     * Establece valor a los atributos
     *
     * @param setVuelo
     */
    public void setVuelo(String origen, String desti, int tiempo) {
        this.origen = origen;
        this.destino = desti;
        this.duracion = tiempo;
    }
}
