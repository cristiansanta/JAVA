/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rangoprimos;

import javax.swing.JOptionPane;

/**
 *
 * @author Christian
 */
public class RangoPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2,cont=0,pos=0,digPri=0;
        while(true)
        {
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número inicial:"));
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número limite: "));
            if(num1 < num2)
            {
                break;
            }
        }
        for(int i=num1; i<=num2; i++)
        {
            for(int n=1;n<=i;n++)
            {
                if(i%n==0)
                {
                    cont++;
                }
            }
            if (cont==2)
            {
                digPri++;
            }cont=0;
        }
        //--------------------------------------
        int vector[] = new int[digPri];
        for(int i=num1; i<num2 ;i++)
        {
            for(int n=1; n<=i; n++)
            {
                if(i%n==0)
                {
                    cont++;
                }
            }
            if(cont==2)
            {
                vector[pos] = i;
                pos++;
            }cont=0;
        }
        //-------------------------------------
        for(int i=0;i<vector.length;i++)
        {
            System.out.print("\t"+vector[i]);
        }System.out.println();
    }
    
}