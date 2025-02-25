/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmapexamen;

import boxeador.Boxeador;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import peleas.Peleas;

/**
 *
 * @author ALUMNOS_FP
 */
public class HashMapExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        // Crear HashMap

        HashMap<String, Double> mapaPrecios = new HashMap();

        //Añadir Elemento
        mapaPrecios.put("53581695w", 500.0);
        mapaPrecios.put("64531695t", 674.0);
        mapaPrecios.put("78451695j", 230.0);
        mapaPrecios.put("59862695K", 800.0);

        //Recorrer HashMap
        mapaPrecios.size();

        //Recorrer por Valor
        for (Double precio : mapaPrecios.values()) {
            System.out.println(precio);
        }

        //Recorrer por Clave
        for (String id : mapaPrecios.keySet()) {
            System.out.println(id);
        }

        //Recorrer por Clave y Valor
        for (String id : mapaPrecios.keySet()) {
            System.out.println(id + ": " + mapaPrecios.get(id));
        }
        
        
        
         */
        ///BOXEADORES HASMAP
        //Clave - "Apodo"   Boxeador - Categoria(ENUM) , Edad , Altura , Arraylist (Pelea)->(Assaltos,Contrincante,Ganado,KO)
        //Creamos el HashMap para el boxeo y  la arraylsit  peleas
        HashMap<String, Boxeador> boxeoPremium = new HashMap();
        ArrayList<Peleas> pelea = new ArrayList<>();
        ArrayList<Peleas> pelea1 = new ArrayList<>();
        ArrayList<Peleas> pelea2 = new ArrayList<>();
        ArrayList<Peleas> pelea3 = new ArrayList<>();

        //Creamos lo boxeadores que se pelearan
        Boxeador ivan = new Boxeador(Boxeador.Categoria.ligero, 25, 165, pelea);
        Boxeador enzo = new Boxeador(Boxeador.Categoria.ligero, 26, 174, pelea1);
        Boxeador loredo = new Boxeador(Boxeador.Categoria.pesado, 23, 170, pelea2);
        Boxeador diego = new Boxeador(Boxeador.Categoria.pesado, 26, 185, pelea3);

        //Creamos las peleas
        Peleas peleaivanenzo = new Peleas(ivan, 12, ivan, enzo, true);
        Peleas pelealoredodiego = new Peleas(loredo, 10, loredo, diego, true);

        //Añadimos las peleas
        ivan.getPelea().add(peleaivanenzo);
        enzo.getPelea().add(peleaivanenzo);
        loredo.getPelea().add(pelealoredodiego);
        diego.getPelea().add(pelealoredodiego);

        //Añadimos las peleas al hashmap
        boxeoPremium.put("La pulga", ivan);
        boxeoPremium.put("FrenchiNP", enzo);
        boxeoPremium.put("El conquistador", loredo);
        boxeoPremium.put("El cateador", diego);

        //Recorrer por Clave y Valor
        /*
        for (String apodo : boxeoPremium.keySet()) {
            System.out.println(apodo + ": " + boxeoPremium.get(apodo).getCategoria());
        }*/
        //Comprobar si boxeador ya existe
        System.out.println(existeboxeo(boxeoPremium));
    }

    public static boolean existeboxeo(HashMap<String, Boxeador> boxeadores) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce el nombre del boxeadore que comprobar");
        String nombre = escaner.nextLine();
        for (String apodo : boxeadores.keySet()) {
            if (apodo.equals(nombre)) {
                return true;
            }
        }
        return false;
    }
}
