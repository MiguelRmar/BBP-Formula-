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
public class CountThreadsMain {

    
    public static void main(String a[]){
        //Crea los tres hilos con los interbalos para imprimir
        CountThread hilo1 = new CountThread(0,99);
        CountThread hilo2 = new CountThread(100,199);
        CountThread hilo3 = new CountThread(200,299);
        //Ejecuta los hilos con el metodo .stat()
        hilo1.start();
        hilo2.start();
        hilo3.start();
        //Ejecuta los hilos con el metodo .run()
        //hilo1.run();
        //hilo2.run();
        //hilo3.run();   
    }
            
}
