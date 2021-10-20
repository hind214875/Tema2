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
public class MenuCalculos {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        int opcion, area, a;

        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");

        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            System.out.println("Ha seleccionado calcular el área de un cuadrado...");
            System.out.println("Introduce el valor de a: ");
            a = entrada.nextInt();
            area = (int) Math.pow(a, 2);
            System.out.println("el area de un cuadrado es: " + area);
        } else {
            if (opcion == 2) {
                System.out.println("Ha seleccionado calcular el área de un triángulo...");
                System.out.println("Introduce el valor de base y altura del triangulo: ");
                int altura = entrada.nextInt();
                int base = entrada.nextInt();
                area = base * altura / 2;
                System.out.println("el area del triangulo es: " + area);
            } else {
                if (opcion == 3) {
                    System.out.println("Ha seleccionado calcular el área de un círculo...");
                    System.out.println("Introduce el valor del radio del circulo : ");
                    int radio = entrada.nextInt();
                    area = (int) (Math.PI * (Math.pow(radio, 2)));
                    System.out.println("el area del circulo es: " + area);
                } else {
                    System.out.println("Ha seleccionado terminar");
                    System.exit(0);
                }
            }
        }
    }
}
