package cat.instutmvm.utils;


public class Vuelo {
    private String origen;
    private String destino;
    private int duracion;
    
    public Vuelo(String origen, String desti, int tiempo){
        this.setVuelo(origen, desti, tiempo);
    }
    public String getOrigen(){
        return this.origen;
    }
    
    public String getDestino(){
        return this.destino;
    }
    
    public int getDuracion(){
        return this.duracion;
    }
    public void setVuelo(String origen, String desti, int tiempo){
        this.origen = origen;
        this.destino = desti;
        this.duracion = tiempo;
    }
}
