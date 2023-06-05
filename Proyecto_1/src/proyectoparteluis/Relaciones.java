/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoparteluis;

/**
 *
 * @author luisr
 */
public class Relaciones {
    private int usuario1;
    private int usuario2;
    private int años;
    private Relaciones next;

    public Relaciones(int usuario1, int usuario2, int años) {
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
        this.años = años;
        this.next= null;
    }

    public Relaciones getNext() {
        return next;
    }

    public void setNext(Relaciones next) {
        this.next = next;
    }
    

    public int getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(int usuario1) {
        this.usuario1 = usuario1;
    }

    public int getUsuario2() {
        return usuario2;
    }

    public void setUsuario2(int usuario2) {
        this.usuario2 = usuario2;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }
    
    
    
    
}
