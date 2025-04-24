/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Vagabond
 */
public class Escritor {
    
    public static void escribirfichero(String fichero , String contenido){
        
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(fichero))){
            
            // Cr
            String [] lineas = contenido.split("\\.");
            for (int i=0; i < lineas.length; i++){
                escritor.write(lineas[i]);
                if(i< lineas.length - 1){
                    escritor.newLine();
                }
            }
        } catch (IOException e) {
        }
    }
}
