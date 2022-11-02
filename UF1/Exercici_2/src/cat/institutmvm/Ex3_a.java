/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;

public class Ex3_a {
    private static final String MSG_1 = "Introduce un numero : ";
    private static final String MSG_2 = "No es negativo : ";
    private static final String MSG_3 = "Es negativo : ";
    
 //Pre: Introduce un numero    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println(MSG_1);
        num = sc.nextInt();
        if(num<0){
            System.out.println(MSG_3 + num);
        }else{
            System.out.println(MSG_2 + num);
        }
    
    }
//Post: Determina si un numero es negtivo   
}
