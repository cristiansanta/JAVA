/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primoterminadoen9;

/**
 *
 * @author Christian
 */
public class PrimoTerminadoen9 {

    /**Determinar numeros primos del 1 al 1000 terminados en 9
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont=0;
        System.out.println("Los primos terminados en 9 son: ");
        for(int i =1;i<=1000;i++)
        {
            for(int n=1;n<=i;n++)
            {
                if(i %n==0)
                {
                    cont++;
                }
            }
            if(cont==2)
            { int aux = i;
            
                aux %=10;
                   if(aux==9)
                   {
                       System.out.println(""+i);
                   }
            }
            cont=0;
        }
    }
    
}
