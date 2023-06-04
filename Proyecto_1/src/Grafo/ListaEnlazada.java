/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

/**
 *
 * @author andre
 */
public class ListaEnlazada {
    private Nodo cabeza;
    private int longitud;
    
    
    public ListaEnlazada() {
        cabeza = null;
        longitud = 0;
    }
    
    public void insertarAlFinal(Arista arista) {
        if (cabeza == null) {
            cabeza = new Nodo(arista, null);
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(new Nodo(arista, null));
        }
        longitud++;
    }
    
    public Arista obtener(int indice) {
        Nodo actual = cabeza;
        for (int i = 0; i < indice; i++) {
            actual = actual.getSiguiente();
        }
        return actual.getArista();
    }
    
    public int longitud() {
        return longitud;
    }
}
