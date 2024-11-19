/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

/**
 *
 * @author sandr
 */
public class Ejemploaleatorios {
    public static void main (System [] args){
        //generamos dos aleatorios [0,10}
        int a=(int)(11*Math.random());
        int b=(int)(11*Math.random());
        
        System.out.println("Los numeros generados son: "+a+" y "+b);
        
        
        System.out.printf("%s: %d %n", "Suma",(a+b)); //print f avisa que vas a poner indicadores
        System.out.printf("%s: %d %n", "Resta",(a+b)); 
        System.out.printf("%s: %d %n", "Producto",(a*b)); 
        System.out.printf("%s: %d %n", "Division",(a/b)); 
    
    }
}
