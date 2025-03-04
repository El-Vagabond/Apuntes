/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapa;

import java.util.HashMap;
import persona.Persona;

/**
 *
 * @author Vagabond
 */
public class Mapa {

    public static void rellenarMapa(HashMap<Integer, Persona> mapa, Persona perso) {

        //Creamos la variable clave que aumentara en cada interacion y la variable que guardara la persona
        int clave = 1;
        do {
            mapa.put(clave, perso);
            clave++;

            System.out.println("La persona se ha añadido con exito");

        } while (perso.equals(""));

        mapa.put(clave, perso);

    }

    public static void vaciarMapa(HashMap<Integer, Persona> mapa) {
        mapa.clear();
        System.out.println("El mapa se ha vaciado");

    }

    public static void mostrarMapa(HashMap<Integer, Persona> mapa) {
        if (mapa.isEmpty()) {
            System.out.println("El mapa no puede estar vacio");
        } else {

            for (Integer num : mapa.keySet()) {
                System.out.println("La clave es: " + num + " El valor es: " + mapa.get(num));
            }

        }

    }
}
