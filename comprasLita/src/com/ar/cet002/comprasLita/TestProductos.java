package com.ar.cet002.comprasLita;

import Swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laucha
 */
public class TestProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comercio comercio  = new Comercio(06,22);
        Carrito carrito=new Carrito();
        Producto a = new Producto("Harina", 20, comercio);
        Producto b = new Producto("Manteca", 30, comercio);
        Producto c = new Producto("Arroz", 10, comercio);
        carrito.agregarAlCarrito(a);
        carrito.agregarAlCarrito(b);
        carrito.agregarAlCarrito(c);
        Carro carro= new Carro(carrito);
    }
    
    
}
