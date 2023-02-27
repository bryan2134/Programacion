package cat.institutmvm.utils;

public class Persona {
    private String nombre, apell;
    
    public Persona(String nom, String apellido){
        this.setDatos(nom, apellido);
    }
    
    public String getNom(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apell;
    }
    
    public void setDatos(String nom, String apellido){
        this.nombre = nom;
        this.apell = apellido;
    }
}
