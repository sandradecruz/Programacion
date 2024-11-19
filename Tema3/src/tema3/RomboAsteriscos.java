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
public class RomboAsteriscos {
    public static void main (String [] args){
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Vamos a hacer un rombo con asteriscos.");
        
        int altura=0;
       
        
        do{
            System.out.println("Indique la altura del rombo: ");
            altura= sc.nextInt();
            
            if(altura<1 || altura>20){
                System.out.println("Intentelo de nuevo. Datos no validos");
            }
     
        }while(altura<2||altura>20 ||altura%2==0);
        
        int mitad=altura/2; //La mitad del triangulo
        
        for(int i=0; i<=altura;i++){
            
            for(int j=1;j <=mitad;j++){
                System.out.print(" ");
                
            }
            
            for(int j=1;j <=mitad;j++){
                System.out.print("*");
                
            }
                
            System.out.println(); 
        }
        
        for (int i = mitad - 1; i >= 0; i--) {
           
            for (int j = 0; j < mitad - i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        
        
        
        
        
        
    }
}
