/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciaciclos;

/**
 *
 * @author Christian
 */
public class SecuenciaCiclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=0, con=1, k=1;
        while(i <= 9)
        {   
                while( k <= 5)
                {
                    System.out.println(i+" "+k);
                    if(con == 2)
                    {
                        k++;
                        con=0;
                        break;
                    }
                    else
                    {
                        break;
                    }
                }
            con++;
            i++;
            
        }
    }
}
