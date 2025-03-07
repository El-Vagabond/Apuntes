/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Vagabond
 */
public class Lista {

    public static void rellenarLista(ArrayList<String> lista) {
        if (lista==null) {
            System.out.println("Primero hay que rellenar la lista");
        } else {
            //Primero vaciamos la lista 
            lista.clear();

            //Inicializamos el escaner y la variable que guardara las palabras
            Scanner escaner = new Scanner(System.in);
            String palabra = "";
            //Creamos un bucle que mientras la palaba no este vacia pregunte  al usuario mas palabras
            do {
                System.out.println("Que palabras quieres introducir a la lista?");
                palabra = escaner.nextLine();
                lista.add(palabra);
            } while (!palabra.isEmpty());
        }
    }

    public static void ordenarLista(ArrayList<String> lista) {
        if (lista.isEmpty()) {
            System.out.println("Primero hay que rellenar la lista");
        } else {
            //Usamos el motodo sort para ordenar la lista y la mostramos
            Collections.sort(lista);
            System.out.println("La lista ordenada se veria asi");
            for (int i = 0; i < lista.size(); i++) {

                System.out.println(lista.get(i));
            }
        }
    }

    public static void palabraLista(ArrayList<String> lista) {
        //Creamos una variable para ir almacenando la palabra mas grande
        if (lista.isEmpty()) {
            System.out.println("Primero hay que rellenar la lista");
        } else {
            String grande = "";
            //Hacemos un bucle que recorra la lista y compruebe el tamaño de las palabras 
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).length() > grande.length()) {
                    grande = lista.get(i);
                }
            }

            System.out.println("La palabra mas grande la lista es " + grande);
        }
    }

    public static void comprobarLista(ArrayList<String> lista) {

        if (lista.isEmpty()) {
            System.out.println("Primero hay que rellenar la lista");
        } else {
            Pattern patch = Pattern.compile("(^[aA]),([0-9]{2}),(#B#+),((3-7){2,3})$");
            for (String elemento : lista) {
                Matcher match = patch.matcher(elemento);
                if (match.matches()) {
                    System.out.println("Esta palabra cumple los requisitos: " + elemento);
                } else {
                    System.out.println("Ninguna palabra cumple la expresionr regular");
                }
            }
        }
    }

    public static void mostrarLista(ArrayList<String> lista) {
        if (lista.isEmpty()) {
            System.out.println("Primero hay que rellenar la lista");
        } else {
            for (String elemento : lista) {
                System.out.println(elemento);
            }
        }
    }

}
