/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThread extends Thread {

    private int inicio;
    private int fin;

     /**
     * Constructor que inicializa los límites del conteo.
     * 
     * @param inicio número inicial del rango
     * @param fin número final del rango
     */

    public CountThread(int inicio, int fin){
        this.inicio = inicio;
        this.fin = fin;
    }

    /**
     * Método run() que define lo que ejecuta el hilo.
     * En este caso, imprime los números entre inicio y fin.
     */

    @Override
    public void run(){
        for(int i = inicio; i<=fin; i++){
            System.out.println(i);
        }
    }
    
}
