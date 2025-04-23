/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainmedievo;

import bufon.Bufon;
import caballero.Caballero;
import caballo.Caballo;
import java.util.Scanner;
import rey.Rey;

/**
 *
 * @author ALUMNOS_FP
 */
public class MainMedievo {

    public static void MainMedievo(String[] args) {
        //Creamos objetos de cada tipo de clase
        Caballo perdigon = new Caballo("negro", 7, Caballo.ORIGEN.astur, false);
        Bufon loredo = new Bufon("Van dos y cae el del medio", "Español", Bufon.HABILIDAD.comedia);
        Caballero ivan = new Caballero("Ivan", perdigon);
        Rey Diego = new Rey("Diego", "El sabio", 5);

        //Pedimos por pantalla que introduzca el numero de castillos del rey y capturamos la excepcion
        Scanner escaner = new Scanner(System.in);
        try{
            System.out.println("Introduce el numero de castillos que tiene el rey");
        int castillos = escaner.nextInt();
        }catch(Exception ex){
            System.out.println("El gran rey diego no tiene mas castillo para usted , pero aun asi le honro");
        }
        

    }
}
