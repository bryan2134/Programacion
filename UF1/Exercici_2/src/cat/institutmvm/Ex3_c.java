/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;
//c) Determinar si un nombre és positiu i menor que 100.
public class Ex3_c {

    private static final String MSG_1 = "Introduce un numero : ";
    private static final String MSG_2 = "Es positivo y menor que 100 ";
    private static final String MSG_3 = "Es negativo";
    private static final String MSG_4 = "Es positivo y mayor que 100 ";
    private static final String MSG_5 = " ";
//Pre: Introduce un numero 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println(MSG_1);
        num = sc.nextInt();
        if ((num < 100) && (num > 0)) {
            System.out.println(MSG_2);
        } else {
            if (num < 0) {
                System.out.println(MSG_3);
            } else {
                System.out.println(MSG_4);
            }
        }

    }
//Post: Determin si un numero es positivo o menor que 100
}
