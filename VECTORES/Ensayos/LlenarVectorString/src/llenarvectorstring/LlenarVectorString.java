/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package llenarvectorstring;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Christian
 */
public class LlenarVectorString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int tamaño;
        
        tamaño = Integer.parseInt(JOptionPane.showInputDialog("Defina el tamaño del vector: "));
        String vector[] = new String[tamaño];
        
        for(int i=0; i<vector.length; i++)
        {
            System.out.print("Ingrese un nombre: ");
            vector[i] = tecla.next();
        }
        //----------------- FOR EACH  ---------------------------------------
        System.out.println("\nLos nombres almacenados en el vector son: ");
        for(String m:vector)
        {
            System.out.print("\t"+m);
        }
        System.out.println();
    }
    
}
