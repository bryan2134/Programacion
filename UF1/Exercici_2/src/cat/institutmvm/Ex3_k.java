/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;
//k) Donats 2 nombres, mostreu si un d’ells és múltiple de l’altre. Suposa que primer es dóna el nombre més gran.
public class Ex3_k {

    private static final String MSG_1 = "Introduce un número : ";
    private static final String MSG_2 = "Es multiple del primer numero : ";
    private static final String MSG_3 = "No es multiple del primer numero ";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, num1;
        System.out.println(MSG_1);
        num = sc.nextInt();
        do {
            System.out.println(MSG_1);
            num1 = sc.nextInt();
        } while (num1 == 0);
        if(num>num1){
            if(num%num1==0){
                System.out.println(MSG_2);
            }else{
                System.out.println(MSG_3);
            }
        }
    }
}
