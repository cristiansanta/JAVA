/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion4;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Funcion4 {

    /**RETORNO DE VALOR
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        entrada();
    }
 
    public static int producto(int x, int y)
    {
        return x*y;
    }
    public static long factorial(int n) 
    {
        long fact = 1;
        for(int i=2;i<=n;i++)
        {
            fact *=i;
        }
        return fact;
    }
    
    public static void entrada()
    {
        //int m=5;
        Scanner tecla = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = tecla.nextInt();
        System.out.println("Tabla de multiplicar del "+num+": ");
        
        for (int i = 0; i <= 10; i++)
        {
            System.out.println("5 x "+i+" = "+producto(num,i));
        }
        System.out.println("El factorial de "+num+" es: "+factorial(num));
    }
}
