/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Semana_11;

/**
 *
 * @author Detz1
 */
class metodo{
    int producto(int x, int y){
        if(y==0){
            return 0;
        }else{
            return x+producto(x,y-1);
        }
    }
}
public class Ejer02 {    
    public static void main(String[] args) {
        metodo m=new metodo();
        System.out.println("El producto: "+m.producto(5, 5));
    }
}
