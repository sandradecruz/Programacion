/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.Ejercicios;

import java.util.Scanner;


/**
 *
 * @author sandr
 */
public class toFahrenheit {
    
    
    public static int celsius;
    
    public int Fahrenheit (){
        int sol=9*celsius/5+32;
        return sol;
    }
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce los grados en Celsius:");
        celsius=sc.nextInt();

        toFahrenheit tf = new toFahrenheit(); 
        int sol = tf.Fahrenheit(); 
        System.out.println("Grados Fahrenheit: " + sol); 
    }
    
}
