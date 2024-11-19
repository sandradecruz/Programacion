/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;


/**
 *
 * @author sandr
 */
public class CaraCruz {
    //Simular el lanzamiento de una moneda y decir si ha salido cara o cruz.
    public static void main (String[]args){
        
        System.out.println("Se van a tirar 20 monedas.");
        
        for(int i=0; i<=20; i++){
            double a =(int) 2*Math.random();
            
     
            if (a<1){
                System.out.println("Ha salido cara.");
            }else{
                System.out.println("Ha salido cruz.");
            }
            
            
        }
        
        
        
        
        
    }
}
