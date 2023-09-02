/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int alumnos, totalPagar;
        
        System.out.println("Calcula el precio que debe pagar cada alumno en el viaje de Fin de Curso");
        System.out.print("Ingrese la cantidad de alumnos que viajaran: ");
        alumnos = tecla.nextInt();
        
        if(alumnos >= 100)
        {
            totalPagar = alumnos*65;
            System.out.println("El pago a la agencia es de "+totalPagar+" y cada alumno debe pagar $ 65.00 Dolares");
        }
        else if(alumnos >= 50 && alumnos <= 99)
        {
            totalPagar = alumnos*70;
            System.out.println("El pago a la agencia es de "+totalPagar+" y cada alumno debe pagar $ 70.00 Dolares");
        }
        else if(alumnos >= 30 && alumnos <= 49)
        {
            totalPagar = alumnos*95;
            System.out.println("El pago a la agencia es de "+totalPagar+" y cada alumno debe pagar $ 95.00 Dolares");
        }
        else{
            totalPagar = 4000/alumnos;
            System.out.println("La renta del bus cuesta $ 4000 y a cada alumno le corresponde pagar: $ "+totalPagar+" Dolares");
        }
    }
    
}
