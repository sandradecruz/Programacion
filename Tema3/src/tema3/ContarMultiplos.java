/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

/**
 *
 * @author sandr
 */
public class ContarMultiplos {
    //Que muestre y cuente los multiplos de 2 y 3 que hay entre 1 y 100.
    public static void main (String [] args){
        int num=0;
        int mula=0;
        int mulb=0;
        
        while (num<100){
           num++;
           if (num%2==0){
               System.out.println(num+" multiplo de 2.");
               mula++;
           }else if (num%3==0){
               System.out.println(num+" multiplo de 3.");
               mulb++;
           }
        }
        System.out.println("Los multiplos de 2 son : "+mula);
        System.out.println("Los multiplos de 3 son : "+mulb);
        
    }
}
