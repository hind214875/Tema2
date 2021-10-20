/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utf03;

import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class EjC {
     public static void main(String[] args) {
        /*C. Leer un número entero entre 1 y 10 y mostrar el número escrito en numeros romanos. Usa Switch*/

        //Declaracion variables
        int a;

        //pedir informacion
        System.out.println("Introducir un numero entre 1 a 10: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a>0 && a<11){
            switch (a) {

            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
            default:
                System.out.println("numero fuera del rango");
                break;
        }

        }
        
        
    }
}
