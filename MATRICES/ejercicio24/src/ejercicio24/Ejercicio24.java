/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

import javax.swing.JOptionPane;

/**
 *
 * @author Christian
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz1[][] = new int[2][3],a=2,b=2;
        int matriz2[][] = new int [2][3],con=0,cont1=0,pri=0,mayor=0,mayor2=0;
        
        for(int f=0;f<a;f++)
        {
            for(int c=0;c<b;c++)
            { con++;
                matriz1[f][c] = Integer.parseInt(JOptionPane.showInputDialog(con+". MATRIZ-1 Ingrese un numero:"));
            }
        }
        for(int f=0;f<a;f++)
        {
            for(int c=0;c<b;c++)
            { cont1++;
                matriz2[f][c] = Integer.parseInt(JOptionPane.showInputDialog(cont1+". MATRIZ-2 Ingrese un numero:"));
            }
        }
        System.out.println("La matriz 1 es: ");
        for(int f=0;f<a;f++)
        {
            for(int c=0;c<b;c++)
            {
                System.out.print("\t"+matriz1[f][c]);
            }
            System.out.println();
        }
        System.out.println("\nLa matriz 2 es: ");
        for(int f=0;f<a;f++)
        {
            for(int c=0;c<b;c++)
            {
                System.out.print("\t"+matriz2[f][c]);
            }
            System.out.println();
        }
        //--------------------------------------------------------
        for(int i=0;i<a;i++)
        {
            for(int n=0;n<b;n++)
            {
                for(int k=1;k<=matriz1[i][n];k++)
                {
                    if(matriz1[i][n]%k==0)
                    {
                        pri++;
                    }
                }
                if(pri==2)
                {
                    if(matriz1[i][n]>mayor)
                    {
                        mayor = matriz1[i][n];
                    }
                }pri=0;
            }
        }
        //------------------------------------------------
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                for(int k=1;k<=matriz2[i][j];k++)
                {
                    if(matriz2[i][j]%k==0)
                    {
                        pri++;
                    }
                }
                if(pri==2)
                {
                    if(matriz2[i][j]>mayor2)
                    {
                        mayor2 = matriz2[i][j];
                    }
                }pri=0;
            }
        }
        if(mayor==mayor2)
        {
            System.out.println("El numero primo mayor esta en las 2 matrices");
        }
        else if(mayor>mayor2)
        {
            System.out.println("La primer matriz tiene un numero primo mayor que la segunda");
        }
        else{
            System.out.println("La segunda matriz tiene un numero primo mayor que la primera");
        }
    }
}