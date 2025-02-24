/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmapexamen;

import java.util.HashMap;

/**
 *
 * @author ALUMNOS_FP
 */
public class HashMapExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            System.out.println(id+ ": "+mapaPrecios.get(id));
        }
    }
}
