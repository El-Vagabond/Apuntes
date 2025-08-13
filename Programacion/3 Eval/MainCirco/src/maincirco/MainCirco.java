/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maincirco;

import artistacirco.ArtistaCirco;
import escapista.Escapista;
import ilusionista.Ilusionista;
import java.util.ArrayList;
import mago.Mago;
import trucomagico.TrucoMagico;

/**
 *
 * @author Vagabond
 */
public class MainCirco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo un truco para el ilusionista y el escapista para crealos posteriormente
        
        TrucoMagico  trucoivan = new TrucoMagico("Y se fue",14);
        TrucoMagico  trucoluis = new TrucoMagico("Al limite",10);
        
        
        
        // Objeto de la clase ilusionista y de la clase Escapista
        
        Escapista ivan = new Escapista ("El guindilla",trucoivan,"Las jaulas");
        Ilusionista luis = new Ilusionista("Señor Espejismo",trucoluis);
    
        //Meto estatico artista circo
        ArtistaCirco.piripi("El show va a empezar");
        
        
        //Creamos el arraylist Para guardar a los magos
        
        ArrayList<Mago> magos = new ArrayList<>();
        magos.add(luis);
        magos.add(ivan);
        
        for(Mago todo:magos){
            
            System.out.println("Nombre del mago: " + todo.getNombreArtistico());
            //Mostramos el truco que hace cada mago
            todo.getTruco().mostrarTruco();
        }
        
        //Mostramos la llamada a realizar el truco
        
        System.out.println("Ivan a realizado "+ ivan.realizarTruco(9));
        System.out.println("Luis a realizado "+ luis.realizarTruco(5));
    
        //Llamamos al metodo intentar escapar del escapista
        
        ivan.intentaEscapar();
        if(ivan.intentaEscapar()){
            System.out.println("!Ha Escapado!");
        }else{
            System.out.println("No ha podido escapar");
        }
    }
    
}
