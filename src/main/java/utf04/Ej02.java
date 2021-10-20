/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utf04;

import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class Ej02 {
      public static void main(String[] args) {
        //declaracion variables
        int x;
        String resultado;

        //pedir datos
        System.out.println("Introducir el valor de X: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        resultado = (x >= 135) ? "Mayor" : "Menor";
        System.out.println(" el valor de x: " + x + " Es " + resultado + " que 135");

        //Si el número “x” es menor o igual que cero se imprimirá en pantalla “Menor que cero”, si no se imprimirá “Mayor que cero”.
        x = sc.nextInt();
        resultado=(x<=0) ? "Menor que cero" :"Mayor que cero";
        System.out.println("El valor de X: "+x+" Es "+resultado);
        
        //Guardar el valor absoluto de un número entero en una variable entera (sin usar la función Math.abs())
        x = sc.nextInt();
        int numero;
        numero=(x > 0) ? x : -x;
        System.out.println("El valor del numero absoluto es: "+numero);
    }
}
