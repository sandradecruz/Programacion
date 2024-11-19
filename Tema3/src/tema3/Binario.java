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
public class Binario {
     public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
            System.out.print("Escriba su primer numero binario: ");
                int a= sc.nextInt();
        
            
                
        if (a !=0 && a !=1){
            System.out.println("Caracter invalido. Intentelo de nuevo.");   
        }
        
         System.out.print("Escriba su segundo numero binario:");
         int b= sc.nextInt();
         
        if (b !=0 && b !=1){
            System.out.println("Caracter invalido. Intentelo de nuevo.");   
        }
        
        System.out.print("Escriba su tercer numero binario:");
         int c= sc.nextInt();
         
        if (c !=0 && c !=1){
            System.out.println("Caracter invalido. Intentelo de nuevo.");   
        }
     
        int operacion=2*2*a+2*b+c;
         System.out.println("El número binario " + a + b + c + " en decimal es: " + operacion);
    }
}
