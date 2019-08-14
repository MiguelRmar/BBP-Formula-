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
    //Crea las variables para el interbalo a ejecutar  
    int numInt = 0;
    int numFin = 0; 
    /**
    * @param numa Número inicial del rango.
    * @param numb Número final del rango.
    */
    public CountThread(int numa, int numb){
        numInt = numa;
        numFin = numb;
    }
   
        
    public void run(){
        for(int i =numInt;i<numFin+1;i++){
	            System.out.println(i);
	}
        System.out.println("Este hilo ha finalizado.");    
    }
    
    
}
