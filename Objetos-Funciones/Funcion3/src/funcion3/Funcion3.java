/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion3;

import java.util.Scanner;

/**
 *TRABAJANDO CON VARIABLES ESTATICAS
 * @author Christian
 */
public class Funcion3 {
    static int num1=34,num2=98;

    public static void saludar(String nombre, int numero)
    {   
        System.out.println("Hola "+nombre+" WE ARE WINNERS");
        int digito = numero%100;
            System.out.println("Los 2 ultimos digitos del numero son. "+digito);
    }
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.print("Ingrese un nombre: ");
        String nombre = tecla.next();
        
        System.out.print("Ingrese un numero: ");
        int numero = tecla.nextInt();
        
        saludar(nombre,numero);
        sumar();
    }
     public static void sumar()
    {
        int suma = num1 + num2;
        System.out.println("La suma de los 2 numeros es: "+suma);
    }
}
