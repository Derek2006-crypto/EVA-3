/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8;

/**
 *
 * @author Derek
 */
public class Eva3_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Persona P = null;
        try{
            P = new Persona("Juan","Piedra",2000);
        }catch(Exception ex){
            ex.printStackTrace();
        }  
                System.out.println("VARIABLES: " + P);
    }
    
        
        
    }

class Persona{
        private String nombre;
        private String apellido;
        private int edad;
        
        public Persona() {
            this.nombre = " ";
            this.apellido = " ";
            this.edad = 0;
        }

        public Persona(String nombre, String apellido, int edad) throws Exception {
            this.nombre = nombre;
            this.apellido = apellido;
            setEdad(edad);
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public int getEdad() {
            return edad;
        }

        
        
        public void setEdad(int edad)throws Exception{
            if(edad < 0)
                throw new Exception("LA EDAD NO PUEDE SER NEGATIVA");
                else
                this.edad = edad;
        }
                
                @Override
                public String toString(){
            return "DATOS DE LA PERSONA: \n" +
                    "Nombre: " + nombre + "\n" +
                    "Apellido: " + apellido + "\n" +
                    "Edad: " + edad + "\n";
                    
                 }
}

