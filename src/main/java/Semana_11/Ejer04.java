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
    int mcd(int a, int b){
        if(a==0 | b==0){
            return 0;
        }
        if(a==b){
            return a;
        }
        if(a>=b) {
            return mcd(a-b,b);
        }
        else {
            return mcd(a, b-a);
        }
    }
}
public class Ejer04 {
    public static void main(String[] args) {
        System.out.println(new metodo().mcd(10, 7));
    }
}
