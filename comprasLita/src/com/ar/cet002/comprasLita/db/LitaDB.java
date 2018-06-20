package com.ar.cet002.comprasLita.db;

import com.ar.cet002.comprasLita.Comercio;
import com.ar.cet002.comprasLita.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class LitaDB {

    public List<Producto> buscarProductoPorNombre(String nombre) {
        List<Producto> lista = new ArrayList<>();
        Comercio c1 = new Comercio(9, 18);
        Comercio c2 = new Comercio(9, 20);
        Comercio c3 = new Comercio(7, 18);
        lista.add(new Producto("Martillo verde", 1, c1));
        lista.add(new Producto("Martillo de goma", 233, c2));
        lista.add(new Producto("Martillo neumatico", 1234, c3));
        return lista;

    }

}
