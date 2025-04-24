/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class Ficheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Introduccion ficheros
        /*
        //Maneras de indicar el fichero a leer o escribir
        String fichero = "fichero1.txt"; //Ruta local
        String fichero1 = "C:\\Users\\diego\\Desktop\\NetBeans\\Ficheros\\fichero1.txt"; //Ruta absoluta
        
        File f = new File("fichero1.txt");

        
        try {
            //Crear fichero
            if(f.createNewFile()){
                System.out.println("Fichero creado con exito");
            }
            else{
                System.out.println("El fichero ya existe");
            }  
            
            //Eliminar fichero
            f.delete();
  
        } catch (IOException ex) {
            Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
        
        //Escribir con fileWriter
        LecturaEscrituraReader.escribir();
        
        LecturaEscrituraReader.escribirWithResources();
        
        
        LecturaEscrituraReader.leer();
        
    }
    
}
