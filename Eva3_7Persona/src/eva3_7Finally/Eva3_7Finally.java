/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7Finally;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Derek
 */
public class Eva3_7Finally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Scanner cap = new Scanner(System.in);
            System.out.println("DA UN NUMERO ENTERO: ");
            int numero =cap.nextInt();
            System.out.println("EL NUMERO ES: " + numero);
        }catch(InputMismatchException e){
            System.out.println("EL NUMERO NO ES ENTERO.");        
        }finally{
            System.out.println("ESTA LINEA SIEMPRE SE VA A EJECUTAR.");
        }
            System.out.println("x-SE CERRARA EL PROGRAMA-x.");
        

    }
   
}

   