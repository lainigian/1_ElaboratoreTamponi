/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany._elaboratoretamponi;

/**
 *
 * @author gian
 */
public class Main 
{
    public static void main(String[] args) throws InterruptedException 
    {
        boolean[] arrayEsiti= new boolean[100];
        int posizioneMinima=0;
        int posizioneMassima=99;
        
        ElaboratoreTamponi elaboratoreTamponi1=new ElaboratoreTamponi(arrayEsiti, 0, 25);
        ElaboratoreTamponi elaboratoreTamponi2=new ElaboratoreTamponi(arrayEsiti, 26, 50);
        ElaboratoreTamponi elaboratoreTamponi3=new ElaboratoreTamponi(arrayEsiti, 51, 75);
        ElaboratoreTamponi elaboratoreTamponi4=new ElaboratoreTamponi(arrayEsiti, 76, 99);


        elaboratoreTamponi1.start();
        elaboratoreTamponi2.start();
        elaboratoreTamponi3.start();
        elaboratoreTamponi4.start();
        
        elaboratoreTamponi1.join();
        elaboratoreTamponi2.join();
        elaboratoreTamponi3.join();
        elaboratoreTamponi4.join();
        
        for(int i=posizioneMinima;i<=posizioneMassima;i++)
            System.out.println(i+" --> "+arrayEsiti[i]);
        
    }
}


