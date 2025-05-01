/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_stack;

/**
 *
 * @author Derek
 */
public class Eva3_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("INICIA MAIN");
       A();
       System.out.println("TERMINA MAIN"); 
    }

    private static void A() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public static void B(){
    System.out.println("INICIA A");
    B();
    System.out.println("TERMINA A");
    }
    public static void C(){
        String resu = null;
        System.out.println("RESULTADO = "+ resu);
        System.out.println("TERMINA C");

        
    }

    
    
}

