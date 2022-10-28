/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;

public class Ex3_h {
    private static final String MSG_1 = "Introduce un número : ";
    private static final String MSG_2 = "Es par lo elevamos al cuadrado : ";
    private static final String MSG_3 = "Es impar lo elevamos al cubo : ";
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println(MSG_1);
        num = sc.nextInt();
        if(num%2==0){
            System.out.println(MSG_2 + num*num);
        }else{
            System.out.println(MSG_3 + num*num*num);
        }
        
    }
}
