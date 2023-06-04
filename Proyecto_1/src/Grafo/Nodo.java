/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

/**
 *
 * @author andre
 */
public class Nodo {
        private Arista arista;
        private Nodo siguiente;
        
        public Nodo(Arista arista, Nodo siguiente) {
            this.arista = arista;
            this.siguiente = siguiente;
        }

    /**
     * @return the arista
     */
    public Arista getArista() {
        return arista;
    }

    /**
     * @param arista the arista to set
     */
    public void setArista(Arista arista) {
        this.arista = arista;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    }
