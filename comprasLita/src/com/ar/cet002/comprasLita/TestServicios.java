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
        List<Producto> productos = Servicios.getInstance().buscarProducto("martillo");
        for (Producto p : productos) {
            System.out.println(p);
        }

    }

}
