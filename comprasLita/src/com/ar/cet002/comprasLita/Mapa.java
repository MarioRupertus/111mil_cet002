package com.ar.cet002.comprasLita;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maxi
 */
public class Mapa {

    private List<Nodo> mapa = new ArrayList<>();

    public List<Nodo> getMapa() {
        return mapa;
    }

    public void agregarNodo(Nodo nodo) {
        mapa.add(nodo);
    }

}
