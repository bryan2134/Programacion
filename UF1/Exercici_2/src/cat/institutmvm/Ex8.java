/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;

public class Ex8 {
    private static final String MSG_1 = "Introduce un numero entero, presiona 0 si desea terminar : ";
    private static final String MSG_2 = "Cuantos numeros quieres introducir";
    private static final String MSG_3 = "Quieres introducir ";
    private static final String MSG_4 = "Introduce un numero : ";
    private static final String MSG_5 = "Fin del programa";
    
    public static void main(String[] args){
    //a) Demanar números enters a l’usuari fins que aquest escrigui el número 0.
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println(MSG_1);
        num = sc.nextInt();
        while(num!=0){
            num = sc.nextInt();
        }
     
    //b) Demanar números enters a l’usuari però fer que el primer número a demanar sigui el nombre de números que demanarà.     
        int num2, i=0, num3;
        System.out.println(MSG_2);
        num2 = sc.nextInt();
        System.out.println(MSG_3 + num2 + " numeros");
        while(i<num2){
            System.out.println(MSG_4);
            num3 = sc.nextInt();
            i++;
        }
        System.out.println(MSG_5);
    }
    
}
