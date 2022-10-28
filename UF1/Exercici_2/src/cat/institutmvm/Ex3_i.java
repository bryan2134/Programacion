/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;

public class Ex3_i {
    private static final String MSG_1 = "Introduce un número : ";
    private static final String MSG_2 = "El máximo de los dos numeros dados es : ";
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, num1;
        System.out.println(MSG_1);
        num = sc.nextInt();
        System.out.println(MSG_1);
        num1 = sc.nextInt();
        if(num>num1){
            System.out.println(MSG_2 + num);
        }else{
            System.out.println(MSG_2 + num1);
        }
    
    }
}
