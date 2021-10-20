/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utf03;

import java.time.Duration;
import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class Ej14 {
     public static void main(String[] args) {
        /* El programa tendrá una variable entera tiempo inicializada con un valor leído por teclado, 
         en segundos, y queremos conocer este tiempo pero expresado en horas, minutos y segundos, 
         mostrando los resultados por pantalla.*/

        //declaracion de variables
        int tiempo, horas, minutos, segundos;

        //Pedir datos
        System.out.println("Introducer el tiempo: ");
        Scanner sc = new Scanner(System.in);
        tiempo = sc.nextInt();

        //conocer este tiempo en horas 
        // horas = tiempo / 3600;
        // minutos = (tiempo % 3600) / 60;
        // segundos = (tiempo % 3600) % 60;
        
        //usando class Duration
        Duration d = Duration.ofSeconds(tiempo);
        horas = (int) d.toHoursPart();
        minutos = (int) d.toMinutesPart();
        segundos = (int) d.toSecondsPart();

        System.out.println("Hours: " + horas + ", Minutos: " + minutos + ", Segundos : " + segundos);

    }
}
