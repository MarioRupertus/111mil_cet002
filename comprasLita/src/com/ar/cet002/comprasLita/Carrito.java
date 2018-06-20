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

    public void agregarAlCarrito(Producto producto) {
        listaDeProductos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        listaDeProductos.remove(producto);
    }

    public void eliminarProducto(int indice) {
        listaDeProductos.remove(indice);
    }

    public void eliminarCarrito() {
        listaDeProductos.clear();
    }

    public List<Producto> getListaDeProductos() {
        return listaDeProductos;
    }

    public void setListaDeProductos(List<Producto> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }

}
