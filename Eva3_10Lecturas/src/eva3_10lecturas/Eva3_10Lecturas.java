/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10lecturas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Derek
 */
public class Eva3_10Lecturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta = "c:\\archivos\\texto.txt";
        try {
            readUsingFiles(ruta);//FILES: RECOMENDAABLE PARA ARCHIVOS PEQUEÑOS
            readUsingScanner( ruta);
            readUsingBufferedReader( ruta);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void readUsingFiles(String ruta) throws IOException {
        System.out.println("LECTURA DE ARCHIVOS USANDO FILES");
        Path path = Paths.get(ruta);
        String cade = Files.readString(path);
        System.out.println(cade);
    }

    public static void readUsingScanner(String ruta) throws FileNotFoundException {
        System.out.println("LECTURA DE ARCHIVOS EN SCANNER");
        File source = new File(ruta);
        Scanner leerArch = new Scanner(source);
        String cade;
        while (leerArch.hasNextLine()) {
            cade = leerArch.nextLine();
            System.out.println(cade);
        }
        leerArch.close();
    }

    public static void readUsingBufferedReader(String ruta) throws FileNotFoundException, IOException {
        System.out.println("LECTURA DE ARCHIVOS USANDO BUFFER");
        File file = new File(ruta);
        FileInputStream inStream = new FileInputStream(file);
        InputStreamReader in = new InputStreamReader(inStream);
        BufferedReader leerTxt = new BufferedReader(in);
        String cade;
        while ((cade = leerTxt.readLine()) != null) {
            System.out.println(cade);
        }
        leerTxt.close();

    }
}
