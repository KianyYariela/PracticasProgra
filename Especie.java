
package com.mycompany.acuariowallaby;

import javax.swing.JOptionPane;

public class Especie {
    String nombre;
    int cantidadPeces;
    String categoria;
    int precio;

    public Especie(String nombre, int cantidadPeces, String categoria, int precio) {
        this.nombre = nombre;
        this.cantidadPeces = cantidadPeces;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadPeces() {
        return cantidadPeces;
    }

    public void setCantidadPeces(int cantidadPeces) {
        this.cantidadPeces = cantidadPeces;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
