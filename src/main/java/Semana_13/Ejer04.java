/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Semana_13;

/**
 *
 * @author Detz1
 */
class nodo{
    int dato;
    nodo sgte, ant;
    public nodo(int n){
        this.dato=n;
        this.ant=this.sgte=null;
    }
    int informacion(){
        return this.dato;
    }
}
class metodo{
    
    nodo origen, fin;
    public metodo(){
        this.origen=this.fin=null;
    }
    
    void ingresar(int p){
        nodo newnodo=new nodo(p);
        //System.out.println("Entro");
        if(origen==null){
            this.fin=this.origen=newnodo;
        }else{
            newnodo.sgte=origen;
            origen.ant=newnodo;
            origen=newnodo;
            fin.sgte=origen;
            origen.ant=fin;
        }
    }
    
    void mostrar(){
        nodo temp=origen;
        do {            
            System.out.println(temp.dato);
            temp=temp.sgte;
        } while (temp!=origen);
    }

    void eliminar(int i) {
        nodo temp=origen;
        
        if(i==temp.dato){  //Agregado
            origen=temp.sgte;
        }   
        
        do {            
            if(i==temp.dato){
                break;
            }
            temp=temp.sgte;
        } while (temp!=origen);
        
        temp.ant.sgte=temp.sgte;
        temp.sgte.ant=temp.ant;
        temp.ant=null;
        temp.sgte=null;
    }
}
public class Ejer04 {
    public static void main(String[] args) {
        metodo m=new metodo();
        m.ingresar(12);
        m.ingresar(10);
        m.ingresar(4);
        m.ingresar(7);
        m.ingresar(5);
        System.out.println("Elementos: ");
        m.mostrar();
        m.eliminar(10);
       System.out.println("\nElementos: ");
        m.mostrar();
    }
}
