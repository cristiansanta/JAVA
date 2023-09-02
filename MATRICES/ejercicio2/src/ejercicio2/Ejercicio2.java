/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

//import java.util.ArrayList;
//import java.util.List;
import javax.swing.JOptionPane;

/*
// Leer una matriz 4x4 entera y determinar cuántas veces se repita en ella el número mayor.
 */
public class Ejercicio2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][] = new int[4][4], mayo=0, cont=0;
        
        for(int f=0;f<=3;f++)
        {
            for(int c=0;c<=3;c++)
            {
                matriz[f][c] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            }
        }
        //--------------------------------------------
        for(int f=0;f<=3;f++)
        {
            for(int c=0;c<=3;c++)
            {
                System.out.print("\t"+matriz[f][c]);
            }
            System.out.println("");
        }
        //---------------------------------------------------
        for(int f=0;f<=3;f++)
        {
            for(int c=0;c<=3;c++)
            {
                if(matriz[f][c] > mayo)
                {
                    mayo = matriz[f][c];
                }
            }
        }
        System.out.println("El numero mayor es: "+mayo);
        System.out.println("Las posiciones del numero mayor son: ");
        for(int f=0;f<=3;f++)
        {
            for(int c=0;c<=3;c++)
            {
                if(matriz[f][c] == mayo)
                {
                    cont++;
                    System.out.print("\t"+ f+","+c);
                }
            }
        }        
        System.out.println("\nEl numero de veces que se repite el numero mayor es: "+cont);      
    }
    
}
