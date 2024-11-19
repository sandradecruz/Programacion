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
public class Primo {
    public Scanner sc=new Scanner(System.in);
    
    public boolean esPrimo(int num){
        
        boolean primo = true;
        
        if (num <= 1) {
                System.out.println("El número " +num+ " no es primo.");
                return false;
        }
        
        int i = 2;
        while (i < num && primo) {
            if (num % i == 0) {
                primo = false;
            }
            i++;
        }

//        if (primo) {
//            System.out.println("El número " +num+ " es primo.");
//        } else {
//            System.out.println("El número " +num+ " no es primo.");
//        }
        System.out.println(primo);
        return primo;
    }
    
    
    public static void main(String[] args) {
        Primo app=new Primo();
        
        System.out.println("Escriba un numero para indicar si es primo o no:");
        int num=app.sc.nextInt();
        System.out.println(app.esPrimo(num));
        
    }
}