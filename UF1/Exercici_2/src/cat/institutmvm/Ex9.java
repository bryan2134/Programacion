/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;

public class Ex9 {
    //Calcula la mitjana aritmètica d’un seguit de nombres que introduirà l’usuari (fins que l’usuari introdueixi un 0).

    private static final String MSG_1 = "Introduce un nuemro para calcular la media aritmetica: ";
    private static final String MSG_2 = "Si desea terminar ingrese un 0 para terminar de ingresar numeros : ";
    private static final String MSG_3 = "La media aritmetica es : ";
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, i=0, suma=0;
        System.out.println(MSG_1);
        System.out.println(MSG_2);
        do{
            num = sc.nextInt();
            suma = suma + num;
            i++;    
        }while(num!=0);
        System.out.println(MSG_3 + suma/i);
    }
    
}
