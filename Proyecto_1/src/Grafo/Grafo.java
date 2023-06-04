/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

/**
 *
 * @author andre
 */
public class Grafo {

    private Nodo[] nodos;
    private int numNodos;

    private class Nodo {

        int id;
        ListaEnlazada aristas;
        boolean eliminado;

        public Nodo(int id) {
            this.id = id;
            this.aristas = new ListaEnlazada();
            this.eliminado = false;
        }
    }

    public Grafo(int numNodos) {
        this.numNodos = numNodos;
        this.nodos = new Nodo[numNodos];
        for (int i = 0; i < numNodos; i++) {
            nodos[i] = new Nodo(i);
        }
    }

    public void agregarArista(int nodo1, int nodo2, int peso) {
        nodos[nodo1].aristas.insertarAlFinal(new Arista(nodo2, peso));
        nodos[nodo2].aristas.insertarAlFinal(new Arista(nodo1, peso));
    }

public void eliminarNodosSinAristas() {
    int numNodosSinAristas = 0;
    for (int i = 0; i < getNumNodos(); i++) {
        if (nodos[i].aristas.longitud() == 0) {
            numNodosSinAristas++;
        }
    }
    if (numNodosSinAristas == 0) {
        return; // No hay nodos sin aristas, no se hace nada
    }
    Nodo[] nuevosNodos = new Nodo[getNumNodos() - numNodosSinAristas];
    int j = 0;
    for (int i = 0; i < getNumNodos(); i++) {
        if (nodos[i].aristas.longitud() > 0) {
            nuevosNodos[j] = nodos[i];
            j++;
        }
    }
    nodos = nuevosNodos;
    numNodos = nodos.length;
}

    public void imprimirGrafo() {
        for (int i = 0; i < getNumNodos(); i++) {
            if (!nodos[i].eliminado) {
                System.out.print("Nodo " + nodos[i].id + ": ");
                ListaEnlazada aristas = nodos[i].aristas;
                for (int j = 0; j < aristas.longitud(); j++) {
                    Arista arista = aristas.obtener(j);
                    System.out.print("(" + nodos[i].id + "," + arista.destino + "," + arista.peso + ") ");

                }
                System.out.println();
            }
        }
    }
    public void borrarGrafo() {
    for (int i = 0; i < getNumNodos(); i++) {
        nodos[i].aristas = new ListaEnlazada();
    }
    nodos = new Nodo[0];
    numNodos = 0;
}

    /**
     * @return the numNodos
     */
    public int getNumNodos() {
        return numNodos;
    }
}