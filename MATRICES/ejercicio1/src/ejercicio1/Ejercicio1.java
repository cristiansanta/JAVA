/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

//import java.util.Scanner;
import javax.swing.JOptionPane;

/**
  Leer una matriz 4x4 entera y determinar en qué fila y en qué columna se encuentra el número
  mayor.
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //  Scanner tecla = new Scanner(System.in);
        int matriz[][] = new int [3][3],condic=1;
        int may=0, ff=0,cc=0;
        
        for(int f=0;f<=condic;f++)
        {
            for(int c=0;c<=condic;c++)
            {
                matriz[f][c] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            }               
        }        
        //-----------------------------------------------
        System.out.println("Matriz original: ");
        for(int f=0;f<=condic;f++)
        {
            for(int c=0;c<=condic;c++)
            {
                System.out.print("\t"+matriz[f][c]);
                
            }    
            System.out.println(""); 
        }
        //-------------------------------------------------------------
        for(int f=0;f<=condic;f++)
        {
            for(int c=0;c<=condic;c++)
            {
                if(matriz[f][c] > may)
                {
                    may = matriz[f][c];
                }
            }
        }
        System.out.println("El mayor es : "+may);
        //-------------------------------------------
        for(int f=0;f<=condic;f++)
        {
            for(int c=0;c<=condic;c++)
            {
                if(matriz[f][c] == may)
                {
                    ff=f;
                    cc=c;
                    
                }
            }
        }
        System.out.println("La posicion del numero mayor es: "+ ff+","+cc);
        
    }
    
}