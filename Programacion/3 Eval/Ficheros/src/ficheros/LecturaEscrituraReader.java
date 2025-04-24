/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
//Clase que lee y escribe utilizando las clases FileReader y FileWriter
public class LecturaEscrituraReader {
    
            /*
            CREAR FILE WRITER
            FileWriter(File file)
            FileWriter (File file, boolean append)
            FileWriter (String fileName)
            FileWriter (String fileName, boolean append)
         */
 /*
            METODOS FILEWRITER
            public void write() - String o char
            public void flush()
            public void close()
         */
    public static void escribir(){
        File f = new File("fichero1.txt");
        
        try {        
            FileWriter escritor = new FileWriter(f, true);

            //Escribir 
            escritor.write("\nHola. Este es mi primerito dia\n");
            escritor.write("\nHola. Este es mi segunda linea del dia\n");
            escritor.write('A');
            escritor.close();
            
        } catch (IOException ex) {
            Logger.getLogger(LecturaEscrituraReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void escribirWithResources(){
        
        try (FileWriter escritor = new FileWriter("fichero2.txt")){
            //Escribir en fichero
            escritor.write("Primera linea\n");
            escritor.write("Segunda linea\n");
            escritor.write("Fin\n");
            
            //No hace falta cerrarlo (el try-with-resources se ocupa de ello)
            
        } catch (IOException ex) {
            Logger.getLogger(LecturaEscrituraReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*
        CREATE FILE READER
        FileReader(File file) –
        FileReader(String fileName)
        
         */
 /*
            METODOS FILEREADER
            public int read() - char o char[]
            public void flush()
            public void close()
         */
    
    
    public static void leer(){
        try (FileReader lector = new FileReader(new File("fichero2.txt"))){

            int c;
            //Leer
            while((c = lector.read()) != -1){
                System.out.println((char) c);
            }
            
        } catch (FileNotFoundException ex) {        
            Logger.getLogger(LecturaEscrituraReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LecturaEscrituraReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
