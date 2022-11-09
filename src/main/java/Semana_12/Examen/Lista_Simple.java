/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_12.Examen;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Detz1
 */
class nodo_Simple{  
    
    Animales dato;
    nodo_Simple sgte;
    
    public nodo_Simple(Animales dato) {
        this.dato = dato;
        this.sgte = null;
    } 

    public Animales getDato() {
        return dato;
    } 
}

public class Lista_Simple {
    nodo_Simple origen=null;
    
    void ingresar(Animales n){
        nodo_Simple newnodo=new nodo_Simple(n);
        if(origen==null){
            origen=newnodo;
        }else{
            newnodo.sgte=origen;
            origen=newnodo;
        }
        
    }
    
    void mostrar(){
        nodo_Simple  temp=origen;
        while(temp!=null){
            System.out.print(temp.dato+" --> ");
            temp=temp.sgte;
        }
    }
    
    void escribirTxt()throws IOException{   //ESCRIBE EL OBJETO EN EL TXT
        File arch = new File("Deiby - Lista Simple.txt");
        if(!arch.exists()){
            arch.createNewFile();
        }
        PrintWriter pw=new PrintWriter(arch);
 
        nodo_Simple temp = origen;
        pw.println("LISTA DOBLE : ");
        while(temp!=null){
            pw.println(temp.getDato()+" -> ");
            temp=temp.sgte;
        }
        pw.close(); 
    } 
}