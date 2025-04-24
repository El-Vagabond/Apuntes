/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lector;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class Lector {
    
    public static int contarPalabras(String name){
        int contPalabras=0;
        //Crear BufferedReader
        try (BufferedReader lector = new BufferedReader(new FileReader(name))){
            String linea;
            while((linea=lector.readLine())!=null){
                
                //Contar palabras de la linea
                String[] palabras = linea.split(" ");           
                contPalabras+=palabras.length;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        return contPalabras;
    }
    
    public static int contarCaracteres(String name){
        int contCaracteres=0;
        //Crear BufferedReader
        try (BufferedReader lector = new BufferedReader(new FileReader(name))){
            String linea;
            while((linea=lector.readLine())!=null){
                
                //Contar palabras de la linea
                String[] palabras = linea.split("^");
        
                contCaracteres+=palabras.length;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        return contCaracteres;
    }
    
    public static int contarCaracteresSinEspacios(String name){
        int contCaracteres=0;
        //Crear BufferedReader
        try (BufferedReader lector = new BufferedReader(new FileReader(name))){
            String linea;
            while((linea=lector.readLine())!=null){
                
                //Contar palabras de la linea
                linea = linea.replaceAll(" ", "");
                String[] palabras = linea.split("");           
                contCaracteres+=palabras.length;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        return contCaracteres;
    }
    
    
    //Usando metodos
    public static int contar(String name, String separador){
        int contPalabras=0;
        //Crear BufferedReader
        try (BufferedReader lector = new BufferedReader(new FileReader(name))){
            String linea;
            while((linea=lector.readLine())!=null){
                
                //Contar palabras de la linea
                String[] palabras = linea.split(separador);           
                contPalabras+=palabras.length;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        return contPalabras;
    }

     public static int contarPalabras2(String name){
         return contar(name, " ");
     }
     
     public static int contarCaracteres2(String name){
         return contar(name, "");
     }
    
}
