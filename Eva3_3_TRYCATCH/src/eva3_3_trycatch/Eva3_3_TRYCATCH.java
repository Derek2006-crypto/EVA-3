/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_trycatch;

/**
 *
 * @author Derek
 */
public class Eva3_3_TRYCATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        try{
            int x = 5, y = 0;
            int resu = x/y;
            
             System.out.println("RESULTADO: "+ resu);
        }catch(ArithmeticException e){
            //AQUI HAY QUE RESOLVER
            e.printStackTrace();
            
        }
        System.out.println("FINISH PROGRAM");
       
        
    }
    
}
