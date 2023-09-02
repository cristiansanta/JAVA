/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio777;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Ejercicio777 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int aux=0,anios, mes, ac=0, k, n; float total, interes; boolean flag = false;
        System.out.println("Ingrese la cantidad de anios de ahorro: ");
        anios = tecla.nextInt();
        for( n=1; n <= anios; n++)
        {
            if(n > 1)
          {
              System.out.println("\nAnio "+n);
              ac=0;
              flag = true;
          }
            for( k=1;k<=12;k++){
              switch(k)
              {
                  case 1 -> {
                      System.out.println("Enero: ");
                      mes = tecla.nextInt();
                      ac+=mes;
                    }
                  case 2 -> {
                      System.out.println("Febrero: ");
                      mes = tecla.nextInt();
                      ac+=mes;
                    }
                  case 3 -> {
                      System.out.println("Marzo: ");
                      mes = tecla.nextInt();
                      ac+=mes;
                    }
                  case 4 -> {
                      System.out.println("Abril: ");
                      mes = tecla.nextInt();
                      ac+=mes;
                    }
                  case 5 -> {
                      System.out.println("Mayo: ");
                      mes = tecla.nextInt();
                      ac+=mes;
                    }
                  case 6 -> {
                      System.out.println("Junio: ");
                      mes = tecla.nextInt();
                      ac+=mes;
                    }
                  case 7 -> {
                      System.out.println("Julio: ");
                      mes = tecla.nextInt();
                      ac+=mes;
                    }
                  case 8 -> {
                      System.out.println("Agosto: ");
                      mes = tecla.nextInt();
                      ac+=mes;
                    }
                  case 9 -> {
                      System.out.println("Septiembre: ");
                      mes = tecla.nextInt();
                      ac+=mes;
                    }
                  case 10 -> {
                      System.out.println("Octubre: ");
                      mes = tecla.nextInt();
                      ac+=mes;
                    }
                  case 11 -> {
                      System.out.println("Noviembre: ");
                      mes = tecla.nextInt();
                      ac+=mes;
                    }
                  case 12 -> {
                      System.out.println("Diciembre: ");
                      mes = tecla.nextInt();
                      ac+=mes;
                    }
              }
          }
              aux = aux + ac;
              interes = ac * 0.1f;
              total = ac + interes;
              System.out.println("Ahorro en el anio "+n+ " es de: "+ac);
              System.out.println("Interes ganado en el anio "+n+ " es de: "+interes);
              System.out.println("Ahorro con interes en el anio "+n+ " es de: "+total);
        }
        if(n >= anios && flag == true)
          {
              n-=1;
              interes = aux * 0.1f;
              total = aux + interes;
              System.out.println("\n\nAhorro Total en "+n+ " anios es de: "+aux);
              System.out.println("Interes ganado en todos los anios es de: "+interes);
              System.out.println("Ahorro con interes en todos los anios es de: "+total);
          }
    }
}