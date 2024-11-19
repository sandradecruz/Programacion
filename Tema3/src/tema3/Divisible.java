/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class Divisible {
    public static void main (String [] args){
    Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el primer numero: ");
        double a=sc.nextDouble();
        System.out.println("Introduzca el segundo numero: ");
        double b=sc.nextDouble();
        
        if (a%b ==0){
            System.out.println("Es divisible.");
            
        }else{
            System.out.println("No es divisible.");
        }
        
        
        
        
        
    }
}
