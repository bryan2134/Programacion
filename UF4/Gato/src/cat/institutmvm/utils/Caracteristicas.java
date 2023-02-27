
package cat.institutmvm.utils;

public class Caracteristicas {
    private String nombre, raza, comida;
    private int edad;
    public Caracteristicas(String nom, int edad, String raza, String comida){
        this.setDatos(nom, edad, raza, comida);
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public String getRaza(){
        return this.raza;
    }
    
    public String getComida(){
        return this.comida;
    }
    
    public void acciones(){
        System.out.println("¡Miau!");
        System.out.println(this.nombre + "Esta jugando!!");
        System.out.println("Se esta bañando");
        System.out.println("Esta comiendo");
        System.out.println("Esta cazando!!");
        
    }
    
    public void setDatos(String nom, int edad, String raza, String comida){
        this.nombre = nom;
        this.edad = edad;
        this.raza = raza;
        this.comida = comida;
    }

    public Caracteristicas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
