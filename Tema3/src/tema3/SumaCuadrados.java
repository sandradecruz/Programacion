/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

/**
 *
 * @author sandr
 */
public class SumaCuadrados {
    public static void main (String [] args){

//Programa que muestre la suma de los cuadrados de los numeros impares entre 0 y 100
            int num=0;
            int suma=0;
            while (num<100){
                num++;
                if(num%2 !=0){
                    System.out.println(num);
                    suma=(num*num)+suma;
                    
                    
                    
                }
            
            }
        System.out.println("La suma de los cuadrados de los numeros impares es: "+suma);
    }    
    
    
    
    
    
    
    
    
    
    
    
}
