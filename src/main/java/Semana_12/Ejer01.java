/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Semana_12;

/**
 *
 * @author Detz1
 */
class nodo{
    int dato;
    nodo sgte;
    public nodo(int n){
        this.dato=n;
        this.sgte=null;
    }
}
class metodo{
    nodo origen=null;
    void ingresar(int n){
        nodo newnodo=new nodo(n);
        if(origen==null){
            origen=newnodo;
        }else{
            newnodo.sgte=origen;
            origen=newnodo;
        }
        
    }
    void mostrar(){
        nodo temp=origen;
        while(temp!=null){
            System.out.print(temp.dato+"-->\t");
            temp=temp.sgte;
        }
    }
}
public class Ejer01 {
    public static void main(String[] args) {
        metodo m=new metodo();
        m.ingresar(10);
        m.ingresar(9);
        m.ingresar(8);
        m.ingresar(5);
        m.ingresar(2);
        m.mostrar();
    }
}
