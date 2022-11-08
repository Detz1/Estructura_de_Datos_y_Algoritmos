/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Semana_13;

/**
 *
 * @author Detz1
 */
class fruta{
    String name;
    String color;
    public fruta(String n, String c){
        this.name=n;
        this.color=c;
    }
    String informacion(){
        return "Nombre: "+this.name+" Color: "+this.color;
    }
}
class nodo{
    fruta dato;
    nodo sgte,ant;
    public nodo(fruta f){
        this.dato=f;
        this.ant=this.sgte=null;
    }
}


class metodo{
    nodo origen, fin;
    public metodo(){
        this.origen=this.fin=null;
    }
    void ingresar(fruta f){
        nodo newnodo=new nodo(f);        
        if(origen==null){            
            fin=origen=newnodo;
        }else{
                newnodo.sgte=origen;
                origen.ant=newnodo;
                origen=newnodo;
                }
    }
    void mostrarColo(){
        nodo temp=fin;
        while(temp!=null){
            System.out.println(temp.dato.informacion());
            temp=temp.ant;
        }
    }
    void mostrarp(){
        nodo temp=origen;
        while(temp!=null){
            System.out.print(temp.dato.informacion()+"\t");
            temp=temp.sgte;
        }
    }
    
    void mostrarc(){
        nodo temp=fin;
        while(temp!=null){
            System.out.print(temp.dato.informacion()+"\t");
            temp=temp.ant;
        }
    }
}
public class Ejer02 {
    public static void main(String[] args) {
        metodo m=new metodo();
        m.ingresar(new fruta("A","Brown"));
        m.ingresar(new fruta("B","Blue"));
        m.ingresar(new fruta("C","Yellow"));
        m.ingresar(new fruta("D","Green"));
        m.ingresar(new fruta("E","Blue"));
        m.mostrarColo();
        
        System.out.println("\nPor Pila");
        m.mostrarp();
        System.out.println("\nPor cola");
        m.mostrarc();
    }
}
