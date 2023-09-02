/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primo32768;

/**
 *Si 32768 es el tope superior para los números entero cortos, determinar
 *cuál es el número primo mas cercano por debajo de él.
 * @author Christian
 */
public class Primo32768 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=0, i;
        for(i=32768; i>=1;i--)
        {
            for(int n=1; n<=i; n++)
            {
                if(i%n==0)
                {
                    a++;
                }
            }
            if(a==2)
            {
               System.out.println("El numero primo mas cercano por debajo de 32768 es: "+i);
               i=0;
            }a=0;
        }
    }
}