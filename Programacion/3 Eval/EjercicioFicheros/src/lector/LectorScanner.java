/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lector;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class LectorScanner {
    
    public static void leer(String name){
        File f = new File(name);
        
        try (Scanner sc = new Scanner(f)) {
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LectorScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void leerConDelimitador(String name){
        try (Scanner sc = new Scanner(new File(name))) {
            sc.useDelimiter(",");
            
            while(sc.hasNext()){
                System.out.println(sc.next());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LectorScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
