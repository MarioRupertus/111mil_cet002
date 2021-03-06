package com.ar.cet002.comprasLita;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Maxi
 */
public class Nodo {

    private String nombre;
    private Nodo antecesor;
    private int pesoAcumulado;
    private List<Proximos> vecinos = new ArrayList<>();
    private boolean visitado;

    public Nodo(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public void agregarVecino(Proximos vecino) {
        vecinos.add(vecino);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Proximos> getVecinos() {
        return vecinos;
    }

    public Nodo getAntecesor() {
        return antecesor;
    }

    public void setAntecesor(Nodo antecesor) {
        this.antecesor = antecesor;
    }

    public int getPesoAcumulado() {
        return pesoAcumulado;
    }

    public void setPesoAcumulado(int pesoAcumulado) {
        this.pesoAcumulado = pesoAcumulado;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nodo other = (Nodo) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

}
