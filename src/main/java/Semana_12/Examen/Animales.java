/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_12.Examen;

/**
 *
 * @author Detz1
 */
public class Animales {
    private String especie;
    private String nombre;
    private int edad;
    private String sexo;

    public Animales(String especie, String nombre, int edad, String sexo) {
        this.especie = especie;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "( Especie=" + especie + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo+" )" ;
    }
    
}
