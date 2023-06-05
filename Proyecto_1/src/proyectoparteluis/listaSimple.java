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
class listaSimple {
    private Nodo pFirst;
    private Nodo pLast;
    private int Size;

    public listaSimple() {
        this.pFirst = null;
        this.pLast = null;
        this.Size = 0;
    }
    
    
public boolean itsEmpty(){
        return this.getpFirst() == null;
    }
    
    public void empty(){
        setpFirst(null);
        setpLast(null);
        setSize(0);
    }
    
    public void insert(Nodo data){
        if(itsEmpty()){
            this.setpFirst(data);
            this.setpLast(data);
        }else{
            this.getpLast().setnext(data);
            this.setpLast(data);
        }
        Size++;
    }
    

    
    
    public void recorrerLista() {
        Nodo actual = pFirst;
        while (actual != null) {
            System.out.println(actual.getNombre()+ ", "+ actual.getId());
            actual = actual.getnext();
        }
    }
    


    /**
     * @return the pFirst
     */
    public Nodo getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(Nodo pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public Nodo getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(Nodo pLast) {
        this.pLast = pLast;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }

}

    /**
     * @param size the size to set
     */

