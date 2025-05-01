/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Derek
 */
public class Eva3_4_TRycatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
       try{
             System.out.println("INTRODUCE VALORES ENTEROS: ");
        int valor = captu.nextInt();
        System.out.println("EL VALOR ES: "+ valor);
       }catch(InputMismatchException e){
           e.printStackTrace();
       }
        System.out.println("FINISH PROGRAM");
                
       
    }
    
}
