/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ar.cet002.comprasLita;

import java.util.List;

/**
 *
 * @author User
 */
public class TestServicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Producto> productos = Servicios.getInstance().buscarProducto("martillo");
        for (Producto p: productos){
               System.out.println(p);
        }
        
    }
    
}
