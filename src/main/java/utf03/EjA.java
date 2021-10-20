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
public class EjA{
    public static void main(String[] args) {
        //Saber si un número es positivo, negativo, o cero

        //Declaracion variables
        int a;

        //pedir informacion
        System.out.println("Introducir el valor de A: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        //
        if (a == 0) {
            System.out.println(" El valor de A es Cero ");
        } else if (a > 0) {
            System.out.println(" El valor de A es Positivo ");
        } else {
            System.out.println(" El valor de A es Negativo ");
        }
    }
}
