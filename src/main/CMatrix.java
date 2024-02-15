/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;

public class CMatrix {

    private int filas;
    private int columnas;
    private CNodo primerNodo;

    public CMatrix() {
        this.filas = 0;
        this.columnas = 0;
        this.primerNodo = null;
    }

    public boolean isEmpty() {
        return getPrimerNodo() == null;
    }

    public void insertar(int filas, int columnas) {
        if (isEmpty()) {
            primerNodo = new CNodo();
        }

        CNodo filaActual = primerNodo;

        for (int i = 0; i < filas; i++) {
            CNodo columnaActual = filaActual;

            for (int j = 1; j < columnas; j++) { 
                if (columnaActual.getDerecha() == null) {
                    CNodo nuevoNodo = new CNodo();
                    nuevoNodo.setValor("(" + i + ", " + j + ")");
                    columnaActual.setDerecha(nuevoNodo);
                }
                columnaActual = columnaActual.getDerecha();
            }

            if (filaActual.getAbajo() == null && i < filas - 1) {
                // Crear un nuevo nodo con el valor según las coordenadas
                CNodo nuevoNodo = new CNodo();
                nuevoNodo.setValor("(" + (i + 1) + ", " + 0 + ")");
                filaActual.setAbajo(nuevoNodo);
            }
            filaActual = filaActual.getAbajo();
        }
    }

    
    public void matrizView() {
        if (isEmpty()) {
            System.out.println("Sin datos suficientes");
        } else {
            CNodo nodocolumna = getPrimerNodo();
            for (int i = 0; i < this.getColumnas(); i++) {
                CNodo nodofila = nodocolumna;
                for (int j = 0; j < this.getFilas(); j++) {
                    System.out.print("[" + i + "]" + "[" + j + "]");
                    nodofila = nodofila.getDerecha();
                }
                System.out.println("");
                nodocolumna = nodocolumna.getAbajo();
            }
        }

    }

    public void mostrarMatriz() {
        CNodo nodoFila = primerNodo;

        while (nodoFila != null) {
            CNodo nodoColumna = nodoFila;

            while (nodoColumna != null) {
                System.out.print(nodoColumna.getValor() + " ");
                nodoColumna = nodoColumna.getDerecha();
            }

            System.out.println();
            nodoFila = nodoFila.getAbajo();
        }
    }




    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public CNodo getPrimerNodo() {
        return primerNodo;
    }

    public void setPrimerNodo(CNodo primerNodo) {
        this.primerNodo = primerNodo;
    }

}
