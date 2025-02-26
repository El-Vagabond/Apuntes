/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vagabond
 */
public class Lista {

    public static void rellenarLista(ArrayList<String> lista) {

        //Primero vaciamos la lista 
        lista.clear();

        //Inicializamos el escaner y la variable que guardara las palabras
        Scanner escaner = new Scanner(System.in);
        String palabra = "";
        do {
            System.out.println("Que palabras quieres introducir a la lista?");
            palabra = escaner.nextLine();
            lista.add(palabra);

        } while (palabra.isEmpty());

    }
}
