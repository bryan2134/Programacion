package cat.institutmvm.utils;

/**
 * Informacion el contenido de una carta
 *
 * @param Carta
 */
public class Carta {

    private String remitente;
    private String destinatario;
    private String texto;

    /**
     * @return Inicializa mis atributos
     */
    public Carta(String remitente, String destino, String contenido) {
        this.setCarta(remitente, destino, contenido);
    }

    /**
     * @return Regresa informacion de mi carta
     */
    public void getCarta() {
        System.out.println("De: " + remitente + "\n" + "para: " + destinatario + "\n" + "mensaje: " + texto);
    }
    /**
     * Establece valor a los atributos
     *
     * @param setCarta
     */
    public void setCarta(String remitente, String destino, String contenido) {
        this.remitente = remitente;
        this.destinatario = destino;
        this.texto = contenido;
    }

}
