/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoparteluis;

import javax.swing.JOptionPane;

/**
 *
 * @author luisr
 */
public class listaSimpler {
    private Relaciones pFirstr;
    private Relaciones pLastr;
    private int Sizer;

    public listaSimpler() {
        this.pFirstr = null;
        this.pLastr = null;
        this.Sizer = 0;
    }


    public Relaciones getpFirstr() {
        return pFirstr;
    }

    public void setpFirstr(Relaciones pFirstr) {
        this.pFirstr = pFirstr;
    }

    public Relaciones getpLastr() {
        return pLastr;
    }

    public void setpLastr(Relaciones pLastr) {
        this.pLastr = pLastr;
    }

    public int getSize() {
        return Sizer;
    }

    public void setSizer(int Sizer) {
        this.Sizer = Sizer;
    }
    
    public boolean itsEmpty(){
        return this.getpFirstr() == null;
    }
    
    public void empty(){
        setpFirstr(null);
        setpLastr(null);
        setSizer(0);
    }
    
    
    public void insertRelacion(Relaciones data){
        if(itsEmpty()){
            this.setpFirstr(data);
            this.setpLastr(data);
        }else{
            this.getpLastr().setNext(data);
            this.setpLastr(data);
        }
        Sizer++;
    }
    
    public void recorrerListaRelaciones() {
        Relaciones actual = pFirstr;
        while (actual != null) {
            System.out.println(actual.getUsuario1()+ ", "+ actual.getUsuario2()+ ", "+ actual.getAños());

            actual = actual.getNext();
        }
    }
    
}
