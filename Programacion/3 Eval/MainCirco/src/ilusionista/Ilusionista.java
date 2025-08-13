/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ilusionista;

import mago.Mago;
import trucomagico.TrucoMagico;

/**
 *
 * @author Vagabond
 */
public class Ilusionista extends Mago {

    public Ilusionista(String nombreArtistico, TrucoMagico truco) {
        super(nombreArtistico, truco);
    }

    @Override
    public int realizarTruco(double numero) {
        return 0;
    }

    public String realizarIlusion(String texto) {
        String textoreverse = "";

        for (int i = texto.length()-1; i >= 0; i--) {

            textoreverse += texto.charAt(i);

        }
        return textoreverse;
    }
}
