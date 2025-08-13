/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package artistacirco;

/**
 *
 * @author Vagabond
 */
public abstract class ArtistaCirco {

    protected String nombreArtistico;

    public ArtistaCirco(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public static void piripi(String texto) {
        System.out.println("PIPIRIPI" + texto);

    }

    public abstract int realizarTruco(double num);

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    @Override
    public String toString() {
        return "ArtistaCirco{" + "nombreArtistico=" + nombreArtistico + '}';
    }

}
