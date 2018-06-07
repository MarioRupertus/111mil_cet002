/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ar.cet002.comprasLita;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Carrito {
    
    private List<Producto> listaDeProductos;

    public Carrito() {
        listaDeProductos = new ArrayList<>();
    }
    
    public void agregarAlCarrito(Producto p){
        listaDeProductos.add(p);
    }
    
    public void eliminarProducto(Producto p){
        listaDeProductos.remove(p);
    }
    
    public void eliminarCarrito(){
        listaDeProductos.clear();
    }
    
    
    
    
}
