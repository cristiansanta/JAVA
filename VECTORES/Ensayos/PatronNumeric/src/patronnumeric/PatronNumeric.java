/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronnumeric;

/**
 *23. Leer 10 números enteros, almacenarlos en un vector y determinar si existe al menos un número repetido.
 * @author Christian
 */
public class PatronNumeric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b=4,c=2,aux=1;
           for(int i=1;i<10;i++)
           {
               a=b+c;
               c=a;
               b = b+2;
               aux++;
               
               System.out.print("\t"+c);
           }System.out.println("");
    }
    
}
