/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Semana_09;

/**
 *
 * @author Detz1
 */
import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Detz1
 */

class Student{
    
    public String name;

    public Student(String name) {
        this.name = name;
         
    }
    
    public String getName() {
        return name;
    }   
}

class Registro extends Student{
    
    public String estado;
    private int n1;
    private int n2;
    private int n3;
    
    public Registro(String name, int nota1, int nota2, int nota3) {
        super(name);
        this.n1 = nota1;
        this.n2 = nota2;
        this.n3 = nota3;
    }
   
    public Float Promedio() {
        float pr= (float)(n1+n2+n3)/3;
        return pr;
    }
    
    public String Estado() {
        String est;
        est = ( Promedio()>=10.5) ? "APROBADO" : "DESAPROBADO";
        
        return est;
    }
    
    String Informacion() {
        return  "\nNombre: " + this.getName()+ "\nnota 1: " + n1 + "\nnota 2: " + n2 +
                "\nnota 3: " + n3+"\nESTADO:  "+this.Estado() ;
    }
    
     String dato(){
        return this.getName()+","+n1+"-"+n2+"-"+n3+"\t"+this.Estado();
    }
}


class metodo{
    ArrayList<Registro> lista=new ArrayList<>();
    File arch = new File("REGISTRO.txt"); // CREANDO TXT
    
    void escribir()throws IOException{   //ESCRIBE EL OBJETO EN EL TXT
        if(!arch.exists()){
            arch.createNewFile();
        }
        PrintWriter pw=new PrintWriter(arch);
        for(Registro s: lista){
            pw.println(s.dato());
        }
        pw.close();     
    }
    
    void leer()throws IOException{
        if(!arch.exists()){
            arch.createNewFile();
        }
        BufferedReader br=new BufferedReader(new FileReader(arch));
        String cad;
        while((cad=br.readLine())!=null){
            String cad2[]=cad.split(",");
            lista.add(new Registro( cad2[0],
                    Integer.parseInt(cad2[1]), Integer.parseInt(cad2[2]),Integer.parseInt(cad2[3]))  );
        }
    }
    
    void ingresar(Registro p){        //INGRESAR ESTUDIANTE A LA LISTA
        lista.add(p);
    }
    
    void mostrar(){                                // MOSTRAR EN CONSOLA
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).Informacion());
        }
    }
    
}

public class EjerTxt {
    
    public static void Ingresar_Datos(metodo x,int n){
        Scanner entrada = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.println("\nALUMNO "+(i+1));
            System.out.println("NOMBRE: ");String name = entrada.nextLine();           
            System.out.println("NOTA 1: ");int n1= entrada.nextInt();           
            System.out.println("NOTA 2: ");int n2= entrada.nextInt();           
            System.out.println("NOTA 3: ");int n3= entrada.nextInt();    
            x.ingresar(new Registro(name,n1,n2,n3));    
            entrada.nextLine();
        }
    }
    
    public static void main(String[] args) throws IOException {
        metodo met=new metodo();
        Scanner entrada = new Scanner(System.in);
        System.out.println("NUMERO DE ALUMNOS A INGRESAR: ");
        int n= entrada.nextInt();
        Ingresar_Datos(met,n);
       
        met.escribir(); //ESCRIBE EN EL TXT
        met.mostrar(); //MUESTRA EN PANTALLA

    }
}

