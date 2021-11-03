/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany._elaboratoretamponi;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gian
 */
public class ElaboratoreTamponi extends Thread
{
    private boolean[] arrayEsiti;
    private int posizioneMinima;
    private int posizioneMassima;
    
    public ElaboratoreTamponi(boolean[] array, int min, int max)
    {
        arrayEsiti=array;
        posizioneMinima=min;
        posizioneMassima=max;        
    }
    
    public void run()
    {
        Random casuale=new Random();
        int msAttesa;
        for (int i=posizioneMinima;i<=posizioneMassima;i++)
        {
            msAttesa=100+casuale.nextInt(301);
            try 
            {
                Thread.sleep(msAttesa);
            } 
            catch (InterruptedException ex) 
            {
                System.out.println("Error");
            }
            //per semplicità, se msAttesa è pari  esito =True, altrimenti esito=false
            if (msAttesa%2==0)
                arrayEsiti[i]=true;
            else
                arrayEsiti[i]=false;
        }  
    }
}
