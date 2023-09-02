/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

import java.util.Scanner;
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
        Scanner tecla = new Scanner(System.in);
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Defina el tamaño del vector: "));
        int mat[] = new int[num],cont=0,priDig=0,mayor=0,pos=0,var;
        
        for(int i=0;i<mat.length;i++)
        {
            System.out.println("Ingrese un numero: ");
            mat[i] = tecla.nextInt();
        }
        for(int i=0;i<mat.length;i++)
        {
            System.out.print("\t "+mat[i]);
        }
        //-------------------------------------
        for(int i=0;i<mat.length;i++)
        {
            while(mat[i] > 0)
            {
                var = mat[i]%10;
                mat[i] /=10;
                for(int n=1;n<=var;n++)
                {
                    if(var%n==0)
                    {
                        cont++;
                    }
                }
                if(cont==2)
                {
                    priDig++;
                }
                cont=0;
            }
            if(priDig > mayor)
            {
                mayor = priDig;
                pos = i;
            }
            priDig = 0;
        }
        System.out.println("\nNumero con mayor cantidad de digitos primos esta en la posicion: "+pos);
    }
}