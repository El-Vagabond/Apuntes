/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escapista;

import mago.Mago;
import trucomagico.TrucoMagico;

/**
 *
 * @author Vagabond
 */
public class Escapista extends Mago {

    private String especialidadEscape;

    public Escapista(String nombreArtistico, TrucoMagico truco, String especialidadEscape) {
        super(nombreArtistico, truco);
        this.especialidadEscape = especialidadEscape;

    }

    private void escapar() {
        int nuevaDuracion = trucos.getDuracion() / 3; 
        trucos.setDuracion(nuevaDuracion);
    }

    public boolean intentaEscapar(){
        escapar();
        
        if(trucos.getDuracion()==0){
            return true;
        }else{
            return false;
        }
    }

    public String getEspecialidadEscape() {
        return especialidadEscape;
    }

    public void setEspecialidadEscape(String especialidadEscape) {
        this.especialidadEscape = especialidadEscape;
    }

    
}
