/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utf04;

import java.util.ArrayList;
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
        int randomAlumno = (int) (Math.random() * AlumnoAleatorio.size());
        //JOptionPane.showConfirmDialog(null, (AlumnoAleatorio.get(randomAlumno)));
        JOptionPane.showMessageDialog(null, "Alumno es: " + (AlumnoAleatorio.get(randomAlumno)), "Alumno Aleatorio", JOptionPane.INFORMATION_MESSAGE,icon);
        AlumnoAleatorio.remove(randomAlumno);
        
        //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
        
      
    }

}
