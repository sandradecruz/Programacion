/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

/**
 *
 * @author sandr
 */
public class Aleatorios {
    //Programa que genere 25 aleatorios entre 1 y 1000, y que diga cuantos pares han salido y cuantos impares
    public static void main (String [] args){
        int ale=0;
        int par=0;
        int impar=0;
        
        
        
        
        while (ale<25){
            int num=(int)(1001* Math.random());
            System.out.println(num);
            ale++;
        
            if(num%2==0){
                par++;
                
            }else if (num%2!=0){
                impar++;
            }    
            
            
        }
        System.out.println("Han salido "+par+" numeros pares.");
        System.out.println("Han salido "+impar+" numeros impares.");
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
}
