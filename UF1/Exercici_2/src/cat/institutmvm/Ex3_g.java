/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;
//g) Determinar si un enter és senar (ho serà quan el residu de la seva divisió per 2 sigui diferent de zero).

public class Ex3_g {
    private static final String MSG_1 = "Introduce un numero : ";
    private static final String MSG_2 = "Es par";
    private static final String MSG_3 = "Es impar";
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println(MSG_1);
        num = sc.nextInt();
        if(num%2!=0){
            System.out.println(MSG_3);
        }else{
            System.out.println(MSG_2);
        }
        
     }
    
}
