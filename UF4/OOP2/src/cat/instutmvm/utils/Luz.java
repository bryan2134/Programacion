package cat.instutmvm.utils;


public class Luz {
    private int intensidad;
    private String color;
    
    public Luz(int inten, String color){
        this.setInfo(inten, color);
    
    }
    public int getIntensidad(){
        return this.intensidad;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setInfo(int inten, String color){
        this.intensidad = inten;
        this.color = color;
    }
}
