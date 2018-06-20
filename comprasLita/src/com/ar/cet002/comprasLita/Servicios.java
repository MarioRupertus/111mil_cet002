package com.ar.cet002.comprasLita;

import com.ar.cet002.comprasLita.db.LitaDB;
//import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Servicios {

    private List<Producto> listaDeProductos;
    private LitaDB litaDB;

    private static final Servicios servicios = new Servicios();

    public static Servicios getInstance() {
        return servicios;
    }

    private Servicios() {
        litaDB = new LitaDB();
    }

    public List<Producto> buscarProducto(String nombre) {
        return litaDB.buscarProductoPorNombre(nombre);

    }
}
