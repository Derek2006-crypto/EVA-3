/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Derek
 */
public class Eva3_6Trycatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nume=0;
        while(true){
        try{
        Scanner captu = new Scanner(System.in);
        System.out.println("INTRODUCE UN NUMERO: ");
        nume = captu.nextInt();
        break;
        }catch (InputMismatchException e){
                
                }
        }
        System.out.println("EL VALOR CAPTURADO ES: " + nume);

        
        
            
                
            
        
   }
}
