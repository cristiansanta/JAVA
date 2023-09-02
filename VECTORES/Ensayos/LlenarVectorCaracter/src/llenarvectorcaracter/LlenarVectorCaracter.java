/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package llenarvectorcaracter;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *Llenar un vector con caracteres e imprimir el vector resultante
 * @author Christian
 */
public class LlenarVectorCaracter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecla = new Scanner (System.in);
        int caracter;
        
        caracter = Integer.parseInt(JOptionPane.showInputDialog("Defina el tamaño del vector: "));
        char vector[] = new char[caracter];
        
        for(int i=0;i<vector.length;i++)
        {
            System.out.print(i+1+". Ingrese un caracter: ");
            vector[i] = tecla.next().charAt(0);            
        }
        //------------------------------------------------------------
        System.out.println("Los caracteres del arreglo son: ");
        for(int i=0;i<vector.length;i++)
        {
            System.out.print("\t"+vector[i]);
        }
        System.out.println();
    }
    
}
