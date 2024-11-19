/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;



/**
 *
 * @author sandr
 */
public class OperacionesAritmeticas {
    public static void main (String [] args){
       
        int a= (int) (Math.random()*11);
        int b= (int) (Math.random()*11);
        
        System.out.println("Estos son los numeros seleccionados: "+a+" y "+b);
        
        
        
        System.out.println("La suma es: "+a+" + "+b+" = "+(a+b));
        System.out.println("La resta es: "+a+" - "+b+" = "+(a-b));
        System.out.println("La multiplicacion es: "+a+" x "+b+" = "+(a*b));
        
        if(b !=0){
            System.out.println("El cociente es: "+a+" / "+b+" = "+(a/b));
        }else{
           System.out.println("Operacion cociente no permitida.0 en la division."); 
        }
        
        
        if(b !=0){
         System.out.println("El producto es: "+a+" % "+b+" = "+(a%b));   
        }else{
         System.out.println("Operacion producto no permitida.0 en la division.");   
        }
        
        
        
    }
}
