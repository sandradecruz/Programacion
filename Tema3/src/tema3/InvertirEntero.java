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
public class InvertirEntero {
    public static void main (String [] args){
        
        
        Scanner sc= new Scanner(System.in);
        
        
        System.out.println("Vamos a invertir un numero");
        System.out.println("Introduce el numero que desee invertir: ");
        int num= sc.nextInt();
        
       String principal= Integer.toString(num);
       String invertido="";
        
       for(int i=principal.length()-1; i>=0;i--){
        invertido =invertido + principal.charAt(i);
        
    }
        System.out.println("El numero invertido es: "+invertido);
    }
}

