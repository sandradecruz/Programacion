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
public class Primo {
    public static void main (String[] args){
        System.out.print("Escriba cualquier numero: ");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int suma=0;
        
        
        for(int i=2;i<=num ;i++){
            int aux=num%i;
            
            if(aux==0){
                suma++;
                
            }
        }
        if(suma<2){
            
            System.out.println("Es primo.");
            
            
        }else{
            System.out.println("No es primo.");
        }
        
        
        
        
        
        
        
        
        
        
    }
}
