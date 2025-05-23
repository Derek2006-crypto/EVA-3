/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11escrituraarch;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Derek
 */
public class Eva3_11EscrituraARCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String ruta = "c\\archivos\\";
        try{
        writeUsingFiles(ruta,"Hola mundo! \n Escribiendo archivos con Files");
        writeUsingFilesWriter(ruta,"Hello mundo! \n Escribiendo archivos con Files");
         }catch (IOException ex){
             ex.printStackTrace();
         }
    }
    public static void writeUsingFiles(String ruta,String texto) throws IOException{
        System.out.println("LEER USANDO FILES");
        Path path = Paths.get(ruta + "files.txt");
        Files.write(path, texto.getBytes());//EL TEXTO SE GUARDA (NO FUNCIONA PARA ARCHIVOS GRANDES
    }
    public static void writeUsingFilesWriter(String ruta,String texto) throws IOException{
        System.out.println("ESCRIBIR USANDO FILEWRITER");
        File file = new File(ruta + "filewriter.txt");
        FileWriter escArch = new FileWriter(file);
        escArch.write(texto);
        escArch.close();
    }
}
