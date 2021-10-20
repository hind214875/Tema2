/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utf03;

/**
 *
 * @author hinda
 */
public class Ej08 {
     public static void main(String[] args) {
        //a.- Declara e inicializa tres variables int (a=10,  b=5, i=0)
        int a = 10, b = 5, i = 0;

        //b.- Declara e inicializa dos variables double (c=71.3 y d=4.8)
        double c = 71.3, d = 4.8;

        //c.- Realiza las siguiente operaciones aritméticas a+b, a-b, a*b, a/b, c+d, c-d, c*d, c/d.
        //El resultado de cada operación se almacena en una nuevas variables que se crearán para tal efecto
        //declara variables para almacenar el resultado
        int suma, resta, multi, devis;
        double suma1, resta1, multi1, devis1;

        suma = a + b;
        resta = a - b;
        multi = a * b;
        devis = a / b;

        suma1 = c + d;
        resta1 = c - d;
        multi1 = c * d;
        devis1 = c / d;

        //d.- Muestra el resultado de cada operación, usando las variables creadas en el paso c).
        System.out.println("la suma de a+b es: " + suma + "\n"
                + "el resta de a-b es: " + resta + "\n"
                + "la multiplicacion de a*b es: " + multi + "\n"
                + "la devision de a/b es : " + devis + "\n");

        System.out.println("la suma de c+d es: " + suma1 + "\n"
                + "el resta de c-d es: " + resta1 + "\n"
                + "la multiplicacion de c*d es: " + multi1 + "\n"
                + "la devision de c/d es : " + devis1 + "\n");
        
        //e.- También muestra en pantalla los resultados de las siguientes operaciones:
        //a*=3, b-=1, a/=b, c+=d.
        
        a*=3;
        b-=1;
        a/=b;
        c+=d;
        System.out.println("el resultado es: "+a+" " +b+ ""+ c);
        
         
    }
}
