/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import javax.swing.JOptionPane;

/**
 *Leer una matriz 4x3 entera y determinar en qué posiciones exactas se encuentran los números 
  primos.
 * @author Christian
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mat[][] = new int[4][3], cont=0, contAux=0, cont11=0;
        
        for(int f=0; f<=3; f++)
        {
            for(int c=0;c<=2;c++)
            {
                mat[f][c] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            }
        }
        //----------------------------------------------------
        for(int f=0;f<=3;f++)
        {
            for(int c=0;c<=2;c++)
            {
                System.out.print("\t"+mat[f][c]);
            }
            System.out.println("");
        }
        System.out.println("\nLos numeros primos son: ");
        //---------------------------------------------
        for(int f=0;f<=3;f++)
        {
            for(int c=0;c<=2;c++)
            { 
                for(int k=1;k<=mat[f][c];k++)
                {
                    if(mat[f][c]%k==0)
                    {
                        contAux++;
                    }
                }
                if(contAux == 2)
                {
                    System.out.print("\t"+mat[f][c]);
                }
                contAux = 0;
            }
        }
        System.out.println("\nLas posiciones de los numeros primos es: ");
        //------------------------------------------
        for(int f=0;f<=3;f++)
        {
            for(int c=0;c<=2;c++)
            { 
                for(int k=1;k<=mat[f][c];k++)
                {
                    if(mat[f][c]%k==0)
                    {
                        cont++;
                    }
                }
                if(cont == 2)
                {
                    cont11++;
                    System.out.print("\t"+f+","+c);
                }
                cont = 0;
            }
        }
        System.out.println("\nHay "+cont11+" Numeros primos");
    }
    
}
