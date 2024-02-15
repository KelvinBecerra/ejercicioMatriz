package main;

public class CNodo {

    private Object valor;
    private CNodo derecha;
    private CNodo abajo;
    private CNodo arriba;

    public CNodo getArriba() {
        return arriba;
    }

    public void setArriba(CNodo arriba) {
        this.arriba = arriba;
    }

    public CNodo() {
        this.valor = 0;
        this.derecha = null;
        this.abajo = null;
        this.arriba=null;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public CNodo getDerecha() {
        return derecha;
    }

    public void setDerecha(CNodo derecha) {
        this.derecha = derecha;
    }

    public CNodo getAbajo() {
        return abajo;
    }

    public void setAbajo(CNodo abajo) {
        this.abajo = abajo;
    }

}
