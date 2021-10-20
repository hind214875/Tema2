/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utf04;

/**
 *
 * @author hinda
 */
public class Ej03 {
    public static void main(String[] args) {
         //declaracion variables

        //a
        boolean unaCondicion = true;
        int valor1 = 1, valor2 = 2;
        int resultado = unaCondicion ? valor1 : valor2;
        System.out.println(resultado);

        //b
        int x = 10;
        int y = (x > 9) ? 100 : 200;
        System.out.println(y);
        
        //c
        int publico = 19500;
    	int vendidas = 19000;
	int aforo = 2000;
  	String status = (publico < aforo) ? "Cabe mas gente": (vendidas < aforo) ? "Aun no hemos vendido todo" : "Esta todo vendido";
        System.out.println(status);
    }
}
