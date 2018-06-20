package com.ar.cet002.comprasLita;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author User
 */
public class Comercio {

    private List<Producto> listaDeProductos;
    private Nodo ubicacion;
    private String duenio;
    private Date horario;
    private int horarioApertura;
    private int horarioCierre;
    private int calificacionPositiva;
    private int calificacionNegativa;

    public List<Producto> getListaDeProductos() {
        return listaDeProductos;
    }

    public void setListaDeProductos(List<Producto> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }

    public Nodo getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Nodo ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public int getCalificacionPositiva() {
        return calificacionPositiva;
    }

    public void setCalificacionPositiva(int calificacionPositiva) {
        this.calificacionPositiva = calificacionPositiva;
    }

    public int getCalificacionNegativa() {
        return calificacionNegativa;
    }

    public void setCalificacionNegativa(int calificacionNegativa) {
        this.calificacionNegativa = calificacionNegativa;
    }

    public Comercio(int horarioApertura, int horarioCierre) {
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
    }

    public void saberSiEstaAbierto(int horaApertura, int horaCierre) {
        Calendar fecha = new GregorianCalendar();
        int horaActual = fecha.get(Calendar.HOUR_OF_DAY);

        if ((horaActual) >= (horaApertura) && (horaActual) <= (horaCierre)) {
            System.out.println("Abierto");
        } else {
            System.out.println("Cerrado");
        }

    }
}
