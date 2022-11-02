/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;

public class Ex7 {
    private static final String MSG_1 = "";
    
    public static void main(String[] args){
    //a) escriure per pantalla els 10 primers números començant pel 0    
        int i=0;
        System.out.println("Del 1 al 10 : ");
        while(i<11){
            System.out.println(i);
            i++;
        }
        
    //b) Escriure per pantalla els 100 primers números començant pel 0.
        i=0;
        System.out.println("Del 1 al 100 : ");
        while(i<101){
            System.out.println(i);
            i++;
        }
     
    //c) Escriure els 100 primers números parells començant pel 0.
        i=0;
        System.out.println(" Numeros pares: ");
        while(i<101){
            if(i%2==0){
            System.out.println(i);
            }
            i++;
        }
    //d) Escriure els números del 0 al 100 en ordre descendent.
        i = 100;
        System.out.println("Del 0 al 100 en forma descendente");
        while(i>=0){
            System.out.println(i);
            i--;
    
        }
        
    }
}
