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
public class Ej15 {
     public static void main(String[] args) {

        //a. fonciona porque la condiciona a vuelve trur y true es true
        boolean adivina = ((97 == 'a') && true);
        System.out.println(adivina);

        //b.fonciona porque a es 97 entonces podemos guardar a in int
        int a = 'a';
        System.out.println(a);

        //c.- no porque pi es int no podemos guardar un decimal
        //int pi = 3.14;
        //System.out.println(pi);

        //d.- no fonciona porque tenemos que escribir 3.14 not 3,14
        //double pi= 3,14;
        //System.out.println(pi);
       
        //e.- no fonciona porque 1 no es egual a 4
        boolean adivinae = (1==4);
	System.out.println(adivinae);
    }
}
