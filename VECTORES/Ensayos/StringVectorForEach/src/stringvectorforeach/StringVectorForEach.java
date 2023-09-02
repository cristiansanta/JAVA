/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringvectorforeach;

/**
 *
 * @author Christian
 */
public class StringVectorForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String vector[] = {"Maria","Cristian","Raul"};
        //FOR EACH
        for(String i:vector)
        {
            System.out.print("\t"+i);
        }
        System.out.println();
    }
    
}
