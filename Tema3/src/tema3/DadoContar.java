/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

/**
 *
 * @author sandr
 */
public class DadoContar {
    //Lanzar un dado 100 veces que ha salido 6.
    public static void main (String[]args){
        System.out.println("Se va a tirar un dado 100 veces.");
        int seis=0;
        int num;
        for(int i=0;i<=100;i++){
            num= (int) (6*Math.random()+1);
            System.out.println(num);
            if(num==6){
                seis++;
            }
            
        }
        System.out.println("Ha salido "+seis+" veces la cara 6.");
        
    }
}
