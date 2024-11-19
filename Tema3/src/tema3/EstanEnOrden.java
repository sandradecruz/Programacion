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
public class EstanEnOrden {
    public static void main (String [] args){
       Scanner sc= new Scanner(System.in); 
        
        System.out.println("Escriba el primer numero:");
            int a= sc.nextInt();
        System.out.println("Escriba el segundo numero:");
            int b= sc.nextInt();
        System.out.println("Escriba el tercer numero:");
            int c= sc.nextInt();
        
       if(a<b && b<c){
           System.out.println("Estan ordenados de menor a mayor.");
       }else if (a>b && b>c){
           System.out.println("Están ordenados de mayor a menor.");
       }else{
           System.out.println("Están desordenados.");
       }
        
        
        
        
    }
}
