/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author Christian
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int products = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos: "));        
        String product[] = new String[products];
        
        for(int i=0;i<product.length;i++)
        {
            product[i] = JOptionPane.showInputDialog(i+1+". Ingrese el producto: ");//VECTOR A
        }
        System.out.println("Productos Disponibles Para La Venta: ");
        for(String i:product)//FOR EACH
        {
            System.out.print("\t"+i);
        }System.out.println();
        //---------------------------------------------------------------------------------------------
        
        String order[] = new String[product.length];
        for(int i=0; i<product.length; i++)
        {
           order[i] = JOptionPane.showInputDialog(i+1+". Ingrese el producto que necesita: ");//VECTOR B
        }
        System.out.println("\nProductos Solicitados Por El Cliente: ");
        for(String i:order)
        {
            System.out.print("\t"+i);
        }System.out.println();
        //-------------------------------------------------
        int cont=0;
        String stock[] = new String[product.length];
        for(int i=0; i<product.length;i++)
        {
            for(int n=0; n<product.length;n++)
            {
                    if(product[i].equals(order[n]))
                    {
                        stock[i] = order[n];
                        cont++;
                        break;
                    }
                    else{
                        stock[i] = "";
                    }
            }
        }
        if (cont==product.length)//A y B son iguales tanto pedido como stock
        {
            System.out.println("\nLos productos que se necesitan para mantener stock de inventario son: ");
            for(String i:stock)
            {
                System.out.print("\t"+i);
            }
            System.out.println();
        }
        else if(product.length > cont)//Hay más productos que pedidos
        {
            System.out.println("\nLos productos que se necesitan para mantener stock de inventario: ");
            for(String i:stock)
            {
                System.out.print("\t"+i);
            }
            System.out.println();
        }        
    }     
}