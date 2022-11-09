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

class nodo_Doble{
    Animales dato;
    nodo_Doble sgte,ant;
    
    public nodo_Doble(Animales n){
        this.dato=n;
        this.ant=this.sgte=null;
    } 

    public Animales getDato() {
        return dato;
    }  
}

public class Lista_Doble {
    nodo_Doble origen, fin;
   
    public Lista_Doble(){
        this.origen=this.fin=null;
    }
    void ingresar(Animales n){
        nodo_Doble newnodo=new nodo_Doble(n);        
        if(origen==null){            
            fin=origen=newnodo;
        }else{
                newnodo.sgte=origen;
                origen.ant=newnodo;
                origen=newnodo;
                }
    }
    
    void mostrar(){
        nodo_Doble temp=fin;
        while(temp!=null){
            System.out.print(temp.dato+" --> ");
            
            temp=temp.ant;
        }
    }
    
    void escribirTxt()throws IOException{   //ESCRIBE EL OBJETO EN EL TXT
        File arch = new File("Deiby - Lista Doble.txt");
        if(!arch.exists()){
            arch.createNewFile();
        }
        PrintWriter pw=new PrintWriter(arch);
 
        nodo_Doble temp1 = fin;
        pw.println("LISTA DOBLE : ");
        while(temp1!=null){
            pw.println(temp1.getDato()+" -> ");
            temp1=temp1.ant;
        }
        
        pw.close(); 
    }
}
