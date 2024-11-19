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
public class ContarPalabras {
        //Programa que cuente las palabras de una frase introducida por teclado.
        //-->Metodo que devuelva el numero de palabras
        
        public int contar(String frase){
            String[] palabras = frase.trim().split("\\s+");

            return palabras.length;
        }
        
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Escriba una frase:");
            String frase =sc.nextLine();
            
            ContarPalabras app=new ContarPalabras();
            System.out.println(app.contar(frase));
    }
}
