/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg44.fibovector;

import javax.swing.JOptionPane;

/**
 *
 * @author Christian
 */
public class FiboVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vector[] = new int[5], cont=0; int vectAux[] = new int[11], n, pos=0;
        long x,y=0,z=1;
        
        for(int i=0;i<vector.length;i++)
        {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog(i+1+". Ingrese un número: "));
        }
        System.out.println("Matriz Original: ");
        for(int i=0;i<vector.length;i++)
        {
            System.out.print("\t"+vector[i]);
        }System.out.println();
        
        for(int i=0;i<100;i++)
        {
            x = y + z;
            y = z;
            z = x;
            for(n=0;n<vector.length;n++)
            {
                if(vector[n]==z)
                {
                    cont++;
                    vectAux[pos] = n;
                    pos++;
                }
            }
        }        
        System.out.println("\nDe la serie Fibonacci en la lista hay: "+cont+" numeros.");
        System.out.println("\nEn las posiciones: ");
        for(int kp=0;kp<cont;kp++)
        {
            System.out.print("\t"+vectAux[kp]);
        }System.out.println();
    }
    
}