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
public class Ej16 {
    public static void main(String[] args) {
        //16.- Evalúa las siguientes expresiones del lenguaje, teniendo en cuenta las siguientes tablas de verdad:
       
        //a.67>20 && 13>12
        System.out.println("67>20 && 13>12  " +(67>20 && 13>12 ) );
       
        //b.10<=2*5&&3<4||!(8>7)&&3*2<=4*2-1
        System.out.println("10<=2*5 && 3>4 || !(8>7)&& 3*2<=4*2-1  " +(10<=2*5 && 3>4 || !(8>7)&& 3*2<=4*2-1) );
       
        //c.!(a>b&&2*a<=b), con a = 5 y b = 3
        int a=5,b=3;
        System.out.println("!(a>b&&2*a<=b)  " +!(a>b&&2*a<=b));
       
        //d.a++/2<b&&(a++/2>b || (a*2<b*4)) con a = 5 y b = 3
        a=5;b=3;
        System.out.println("a++/2<b&&(a++/2>b || (a*2<b*4))   " +(a++/2<b&&(a++/2>b || (a*2<b*4))));
       
        //e.b++>3||a+b<=8&&!(a>b) con a = 5 y b = 3
        System.out.println("b++>3||a+b<=8&&!(a>b) " + (b++>3||a+b<=8&&!(a>b)));
    }
}
