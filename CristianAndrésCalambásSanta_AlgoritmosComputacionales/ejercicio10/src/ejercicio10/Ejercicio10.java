/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Christian Un alumno desea saber cuál será su calificación final en la
 * materia de Algoritmos. Dicha calificación se compone de los siguientes
 * porcentajes: 55% del promedio de sus tres calificaciones parciales. 30% de la
 * calificación del examen final. 15% de la calificación de un trabajo final.
 *
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        tecla.useLocale(Locale.US);//Decirle que el idioma del scanner es el Estadounidense donde el punto es el separador
        double promedioNotas, ExamenFinal, TrabajoFinal, NotaFinal;
        System.out.println("Ingresar el promedio de las calificaciones parciales: ");
        promedioNotas = tecla.nextFloat();
        System.out.println("Ingrese nota examen final: ");
        ExamenFinal = tecla.nextFloat();
        System.out.println("Ingrese nota trabajo final: ");
        TrabajoFinal = tecla.nextFloat();

        NotaFinal = (promedioNotas * .55f) + (ExamenFinal * .3f) + (TrabajoFinal * .15f);
        System.out.println("La notal final es: " + NotaFinal);
    }

}
