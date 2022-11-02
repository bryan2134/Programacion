/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;
//Donat un any qualsevol, el programa ha d’informar si és un any de traspàs o no
public class Ex5 {
    private static final String MSG_1 = "Introduce un año para saber si es bisiesto";
    private static final String MSG_2 = "Este año es bisiesto";
    private static final String MSG_3 = "Este año no es bisiesto";
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int año;
        System.out.println(MSG_1);
        año = sc.nextInt();
        if((año%4==0)||(año%400==0)){
            System.out.println(MSG_2);
        }else{
            System.out.println(MSG_3);
        }
    
    }
}
