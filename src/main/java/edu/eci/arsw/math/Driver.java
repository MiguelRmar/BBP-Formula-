/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.math;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 2099444
 */
public class Driver {
    
     public static String getDigits(int start, int count,int N) throws InterruptedException {
        int partes= count/N;
        String resultado = "";
        List<PiDigits> hilos = new ArrayList<PiDigits>();
        //Hilo[] hilos=new Hilo[partes];
        for (int i = 0; i < N; i++) {  
            PiDigits h = new PiDigits(start,count);
            hilos.add(h);
            start=count+1;
            count=count+partes; 
            h.start();
        }   
        
        for (int u=0; u<hilos.size(); u++){       ;
            hilos.get(u).join();
        }
        for (int u=0; u<hilos.size(); u++){       ;
            resultado=resultado+hilos.get(u).getResultado();
        }
       
       
        return resultado;
    }
    
}
