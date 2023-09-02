/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imprimeinversovector;

import javax.swing.JOptionPane;

/**
 *
 * @author Christian
 */
public class ImprimeInversoVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Defina el tamaño del vector: "));
        int vector[] = new int[num];
        
        for(int i=0;i<vector.length;i++)
        {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número en la posición "+i+" del vector"));
        }
        //------------------------------------------------
        System.out.println("El vectro original es: ");
        for(int i=0; i<vector.length ;i++)
        {
            System.out.print("\t"+vector[i]);
        }
        //-----------------------------------------------
        System.out.println("\nEl vector inverso es: ");
        for(int i=vector.length-1;i>=0;i--)
        {
            System.out.print("\t"+vector[i]);
        }
        System.out.println();
    }
    
}