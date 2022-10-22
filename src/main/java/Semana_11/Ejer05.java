/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Semana_11;

/**
 *
 * @author Detz1
 */
import java.util.Random;

class metodo{
    void llenar(int v[], int x){
        Random rd=new Random();
        for (int i = 0; i < x; i++) {
            v[i]=rd.nextInt(5);
        }
    }
    int sumar(int v[], int i){
        if(i==0) return v[i];
        else return v[i]+sumar(v,i-1);
    }
    void mostrar(int v[]){        
        for(Integer i:v){
            System.out.print(i.toString()+"\t");
        }
    }
}
public class Ejer05 {
    public static void main(String[] args) {
        metodo m=new metodo();
        int vector[]=new int[10];
        m.llenar(vector, 10);
        //System.out.println(vector[5]);
        //System.out.println(vector[6]);
        //System.out.println(vector[7]);
        m.mostrar(vector);
        System.out.println("\nLa suma es: "+m.sumar(vector, 9));
    }
}
