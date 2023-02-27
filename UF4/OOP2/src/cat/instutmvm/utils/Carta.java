package cat.instutmvm.utils;


public class Carta {
    private String remitente;
    private String destinatario;
    private String texto;
    
    public Carta(String remitente, String destino, String contenido){
        this.setCarta(remitente, destino, contenido);
    }
    public void getCarta(){
        System.out.println("De: " + remitente + "\n" + "para: " + destinatario + "\n" + "mensaje: " + texto );
    }
    
    public void setCarta(String remitente, String destino, String contenido){
        this.remitente = remitente;
        this.destinatario = destino;
        this.texto = contenido;
    }

}