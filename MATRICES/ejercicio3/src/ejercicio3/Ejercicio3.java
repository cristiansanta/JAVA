/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import javax.swing.JOptionPane;

/**
 Leer una matriz 3x4 entera y determinar en qué posiciones exactas se encuentran los números 
pares
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int matrix[][] = new int[100][100];
        int m, n;
        
        m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Filas: "));
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Columnas: "));
        
        for(int i=0; i<=m; i++)
        {
            for(int j=0;j<=n;j++)
            {
               matrix[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            }
        }
        //---------------------------------------
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                System.out.print("\t"+matrix[i][j]);
            }
            System.out.println("");
        }
        //--------------------------------------------
        System.out.println("Los numeros pares son: ");
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(matrix[i][j] %2 == 0)
                {
                    System.out.print("\t"+matrix[i][j]);
                }
            }
        }
        //---------------------------------------
        System.out.println("\nLas posiciones de los numeros pares son: ");
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(matrix[i][j]%2==0)
                {
                    System.out.print("\t"+i+","+j);
                }
            }
        }
    }    
}