/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;
//f) Determinar si el mòdul d'un nombre és menor que 15. No pots fer servir la funció valor absolut.

public class Ex3_f {
    private static final String MSG_1 = "Introduce un numero :  ";
    private static final String MSG_2 = "El modulo de los numeros es menor que 15";
    private static final String MSG_3 = "No es menor que 15";

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, num1;
        System.out.println(MSG_1);
        num = sc.nextInt();
        do{
        System.out.println(MSG_1);
        num1 = sc.nextInt();
        }while(num1==0);//Condicion para que el segundo numero no sea 0
        if(num%num1<15){
            System.out.println(MSG_2);
        }else{
            System.out.println(MSG_3);
        }
        
    
    }
}
