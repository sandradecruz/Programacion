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
public class Palindromo {
    //Programa que determine si una palabra es un palindromo (palabra que se le de alante o detras)
    //-->Metodo que devuelva un booleano indicando si es palindromo.
    
    public String voltear(String palabra){
       String volteada="";
       for(int i=palabra.length()-1;i>=0;i--){
           volteada=volteada+palabra.charAt(i);
       }
       return volteada;
    }
    
    public boolean esPalindromo(String palabra){
        String palabVolt=voltear(palabra);
        return palabra.equals(palabVolt);
        
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba una palabra para determinar si es palindromo o no:");
        String palabra=sc.next();
        
        Palindromo app=new Palindromo();
        if(app.esPalindromo(palabra)){
            System.out.println("Es un palindromo");
            
        }else{
            System.out.println("No es un palindromo");
        }
        
    }
}
