/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;


public class ActGrupal {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

        CMatrix matriz = new CMatrix();
        matriz.insertar(columnas, filas);
        matriz.mostrarMatriz();
        

        

        scanner.close();
    
    }
}
