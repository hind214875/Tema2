/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utf04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author hinda
 */
public class AlumnoAleatorio {

    public static void main(String[] args) {
        //declaracion variables
        ArrayList<String> AlumnoAleatorio = new ArrayList<String>();
        //ArrayList<String> AlumnoContadorP = new ArrayList<String>();
        Map<String, Integer> AlumnoContadorP = new HashMap<String, Integer>();
        String opcion;int contador=1;
        //constantes
        final ImageIcon icon = new ImageIcon("surprise.png");

        //initialisation de la lista
        AlumnoAleatorio.add("Edgardo Gabriel Allende");
        AlumnoAleatorio.add("Juan Antonio Barbero Mena");
        AlumnoAleatorio.add("Juan José Bazán Espinosa");
        AlumnoAleatorio.add("Badreddine Belasri");
        AlumnoAleatorio.add("Imad El Fahssi");
        AlumnoAleatorio.add("David Fernández Fernández");
        AlumnoAleatorio.add("Domingo Flores Ortega");
        AlumnoAleatorio.add("Gabriel García Tallai");
        AlumnoAleatorio.add("Alberto Garzón Rodríguez");
        AlumnoAleatorio.add("Maximiliano Hoffmann Foyo");
        AlumnoAleatorio.add("Ismael Jerruz Jellouly");
        AlumnoAleatorio.add("Cristina del Carmen Jiménez Fernández");
        AlumnoAleatorio.add("Samuel Alejandro Jiménez Mazas");
        AlumnoAleatorio.add("Alex López Guerrero");
        AlumnoAleatorio.add("Juan Diego Marín Morales");
        AlumnoAleatorio.add("Miguel Martín Fernández");
        AlumnoAleatorio.add("Álvaro Martínez Flores");
        AlumnoAleatorio.add("Francisco José Mateos Gil");
        AlumnoAleatorio.add("Jesús Narbona Aguilar");
        AlumnoAleatorio.add("Lorena Olay Unciano");
        AlumnoAleatorio.add("Eduardo Orellana Pomares");
        AlumnoAleatorio.add("Javier Parodi Piñero");
        AlumnoAleatorio.add("Sergio David Romero Berlanga");
        AlumnoAleatorio.add("José Ignacio Salcedo Guarde");
        AlumnoAleatorio.add("Victoria Sampalo García");
        AlumnoAleatorio.add("Alejandro Santaella Urbano");
        AlumnoAleatorio.add("Adrián Vallejo Robles");
        AlumnoAleatorio.add("Rubén Vélez Simón");

        //saca uno aleatorio
        Random random = new Random();
        
        //JOptionPane.showConfirmDialog(null, (AlumnoAleatorio.get(randomAlumno)));
        do {

            opcion = JOptionPane.showInputDialog(null, "si quieres ejecutar el programa entrar S si no N");
        
            if (opcion.equalsIgnoreCase("s")) {
                 
                int randomAlumno = (int) (Math.random() * AlumnoAleatorio.size());
                JOptionPane.showMessageDialog(null, "Alumno es: " + (AlumnoAleatorio.get(randomAlumno)), "Alumno Aleatorio", JOptionPane.INFORMATION_MESSAGE, icon);
                //Añadir el alumno eligado en la lista de positivos
                AlumnoContadorP.put(AlumnoAleatorio.get(randomAlumno),contador);
                contador++;
                System.out.println(AlumnoContadorP);
                contador=0;
                //remove el alumno eligedo de la lista para que no sale otravez
               // AlumnoAleatorio.remove(randomAlumno);
               // System.out.println(AlumnoAleatorio);
            } else {
                JOptionPane.showConfirmDialog(null, "Termina");
            }
           

        } while (!opcion.equalsIgnoreCase("n"));
        System.out.println(AlumnoContadorP);
    }

}
