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
    int exponente(int x, int y){
        if(y==0){
            return 1;
        }else{
            return x*exponente(x, y-1);
        }
    }
}
public class Ejer03 {
    public static void main(String[] args) {
        metodo m=new metodo();
        System.out.println(m.exponente(4, 2));
        //2*2*2*2*2
    }
}
