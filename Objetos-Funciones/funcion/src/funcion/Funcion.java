/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion;

import java.util.Scanner;

/**
 *Metodos estaticos
 * @author Christian
 */
public class Funcion {

    /**
     * @param args the command line arguments
     */
    public static void saludar(String nombre)
    {
        System.out.println("Hola "+nombre+" WE ARE WINNERS");
    }
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.print("Ingrese un nombre: ");
        String nombre = tecla.next();
        
        System.out.print("Ingrese un numero: ");
        int numero = tecla.nextInt();
        
        saludar(nombre);
        Digitos(numero);
    }
        public static void Digitos(int numero)
        {
           int digito = numero%100;
            System.out.println("Los 2 ultimos digitos del numero son. "+digito);
        }
}