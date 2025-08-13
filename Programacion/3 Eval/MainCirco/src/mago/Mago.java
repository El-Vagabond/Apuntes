/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mago;

import artistacirco.ArtistaCirco;
import trucomagico.TrucoMagico;

/**
 *
 * @author Vagabond
 */
 public class Mago extends ArtistaCirco {
    protected TrucoMagico trucos;

    public Mago(String nombreArtistico, TrucoMagico truco) {
        super(nombreArtistico);
        this.trucos = truco;
    }

    @Override
    public int realizarTruco(double dificultad) {
        return (int) dificultad;
    }

    public TrucoMagico getTruco() {
        return trucos;
    }

    public void setTruco(TrucoMagico truco) {
        this.trucos = truco;
    }
}
