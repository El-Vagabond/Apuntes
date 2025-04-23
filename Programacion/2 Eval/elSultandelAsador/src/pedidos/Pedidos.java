/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos;

/**
 *
 * @author ALUMNOS_FP
 */
public class Pedidos {
    double precio;
    int numPedido;
    int numMesa;
    String nombreCamarero;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public String getNombreCamarero() {
        return nombreCamarero;
    }

    public void setNombreCamarero(String nombreCamarero) {
        this.nombreCamarero = nombreCamarero;
    }

    public Pedidos(double precio, int numPedido, int numMesa, String nombreCamarero) {
        this.precio = precio;
        this.numPedido = numPedido;
        this.numMesa = numMesa;
        this.nombreCamarero = nombreCamarero;
    }

    @Override
    public String toString() {
        return "Pedidos{" + "precio=" + precio + ", numPedido=" + numPedido + ", numMesa=" + numMesa + ", nombreCamarero=" + nombreCamarero + '}';
    }
    
    
    
}
