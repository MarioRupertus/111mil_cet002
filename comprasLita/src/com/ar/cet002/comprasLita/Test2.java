package com.ar.cet002.comprasLita;

//import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class Test2 {

    public static void main(String args[]) {

        // Creo nodos
        Nodo A = new Nodo("A");
        Nodo B = new Nodo("B");
        Nodo C = new Nodo("C");
        Nodo D = new Nodo("D");
        Nodo E = new Nodo("E");
        Nodo F = new Nodo("F");
        Nodo G = new Nodo("G");
        Nodo H = new Nodo("H");
        Nodo I = new Nodo("I");
        Nodo J = new Nodo("J");

        // Creo mapa y agrego nodos
        Mapa mapa = new Mapa();

        mapa.agregarNodo(A);
        mapa.agregarNodo(B);
        mapa.agregarNodo(C);
        mapa.agregarNodo(D);
        mapa.agregarNodo(E);
        mapa.agregarNodo(F);
        mapa.agregarNodo(G);
        mapa.agregarNodo(H);
        mapa.agregarNodo(I);
        mapa.agregarNodo(J);

        // Defino vecinos de cada nodo
        // Ver porque se rompe la ejecucion si los vecinos se agregran en orden diferente al que fueron agregados al mapa. En este ejemplo, si no agregamos los vecinos en orden alfabetico, falla la ejecucion.
        A.agregarVecino(new Proximos(B, 2));
        A.agregarVecino(new Proximos(C, 3));
        A.agregarVecino(new Proximos(D, 1));

        B.agregarVecino(new Proximos(A, 2));
        B.agregarVecino(new Proximos(E, 6));
        B.agregarVecino(new Proximos(G, 8));

        C.agregarVecino(new Proximos(A, 3));
        C.agregarVecino(new Proximos(D, 2));
        C.agregarVecino(new Proximos(E, 6));
        C.agregarVecino(new Proximos(F, 4));
        C.agregarVecino(new Proximos(H, 1));

        D.agregarVecino(new Proximos(A, 1));
        D.agregarVecino(new Proximos(C, 2));
        D.agregarVecino(new Proximos(E, 5));

        E.agregarVecino(new Proximos(B, 6));
        E.agregarVecino(new Proximos(C, 6));
        E.agregarVecino(new Proximos(F, 10));
        E.agregarVecino(new Proximos(G, 1));

        F.agregarVecino(new Proximos(C, 4));
        F.agregarVecino(new Proximos(E, 10));
        F.agregarVecino(new Proximos(G, 4));
        F.agregarVecino(new Proximos(H, 1));
        F.agregarVecino(new Proximos(I, 1));

        G.agregarVecino(new Proximos(B, 8));
        G.agregarVecino(new Proximos(E, 1));
        G.agregarVecino(new Proximos(F, 4));
        G.agregarVecino(new Proximos(I, 2));

        H.agregarVecino(new Proximos(C, 1));
        H.agregarVecino(new Proximos(F, 1));
        H.agregarVecino(new Proximos(J, 3));

        I.agregarVecino(new Proximos(F, 1));
        I.agregarVecino(new Proximos(G, 2));
        I.agregarVecino(new Proximos(J, 4));

        J.agregarVecino(new Proximos(H, 3));
        J.agregarVecino(new Proximos(I, 4));

        Recorrido r = new Recorrido(mapa);
        r.setOrigen(E);
        r.agregarDestino(C);
        r.agregarDestino(H);
        r.agregarDestino(G);
        r.agregarDestino(B);
        r.setDestinoFinal(J);
        r.calcularRecorrido();

    }

}
