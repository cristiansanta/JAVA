/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;
/**
 *
 * @author Christian
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String nombre; int hora, tarifa; double salarioBruto,salarioNeto,impuestos, aux;
        
        System.out.println("Nomina semanal - Salario Neto\n");
        System.out.println("Nombre del trabajador: ");
        nombre = teclado.next(); teclado.nextLine();
        System.out.println("Horas trabajadas: ");
        hora = teclado.nextInt();
        System.out.println("Tarifa por hora: ");
        tarifa = teclado.nextInt();
        
        if(hora <= 35)
        {
            salarioBruto = hora*tarifa; //SALARIO BRUTO
        }
        else{
            salarioBruto = (hora-35)*(1.5f*tarifa) + tarifa*35; //SALARIO BRUTO
        }
        //  CALCULAR LOS IMPUESTOS
        if(salarioBruto <= 2000)
        {
            impuestos = 0;
            salarioNeto = salarioBruto - impuestos;
        }
        else{
            
            if(salarioBruto <= 2220)
            {
                
                impuestos = (salarioBruto-2000) * .2;
                salarioNeto = salarioBruto - impuestos;
            }
            else{
                impuestos = 220*.2 + (salarioBruto-2220)*.3;
                salarioNeto = salarioBruto - impuestos;
            }
        }
        System.out.println("\nTrabajador: "+nombre+"\nSalario Bruto: "+salarioBruto+"\nImpuestos: "+impuestos+"\nSalario Neto: "+salarioNeto);
    }    
}