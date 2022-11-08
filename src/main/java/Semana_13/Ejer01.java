/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Semana_13;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Detz1
 */

class nodo{
    int dato;
    nodo ant;
    nodo sgte;
    public nodo(int x){
        this.dato=x;
        this.ant=this.sgte=null;
    }
    int informacion(){
        return this.dato;
    }
}
class metodo{
    nodo origen, fin;
    public metodo(){
        this.origen=null;
        this.fin=null;
    }
    void ingresar(int x){
        nodo newnodo=new nodo(x);
        if(origen==null){
            fin=origen=new nodo(x);
        }else{
            newnodo.sgte=origen;
            origen.ant=newnodo;
            origen=newnodo;
        }
    }
    void mostrarp(){
        nodo temp=origen;
        while(temp!=null){
            System.out.print(temp.informacion()+"\t");
            temp=temp.sgte;
        }
    }
    void mostrarc(){
        nodo temp=fin;
        while(temp!=null){
            System.out.print(temp.informacion()+"\t");
            temp=temp.ant;
        }
    }
   
    void escribirTxt()throws IOException{   //ESCRIBE EL OBJETO EN EL TXT
        File arch = new File("Lista.txt");
        if(!arch.exists()){
            arch.createNewFile();
        }
        PrintWriter pw=new PrintWriter(arch);
 
        nodo temp=origen;
        pw.print("Por Pila: \n");
        while(temp!=null){
            pw.print(temp.informacion()+" -> ");
            temp=temp.sgte;
        }
        
        nodo temp1=fin;
        pw.print("\n\nPor Cola: \n");
        while(temp1!=null){
            pw.print(temp1.informacion()+" -> ");
            temp1=temp1.ant;
        }
        pw.close();     
    }
    
    
    
    
} 

public class Ejer01 {
    public static void main(String[] args) throws IOException {
        metodo m=new metodo();
        m.ingresar(5);
        m.ingresar(7);
        m.ingresar(15);
        m.ingresar(10);
        m.ingresar(3);
        System.out.println("Por Pila");
        m.mostrarp();
        System.out.println("\nPor cola");
        m.mostrarc();
        m.escribirTxt();    
    }
}
