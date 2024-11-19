/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

import java.util.Random;

/**
 *
 * @author sandr
 */
public class EjemploRandom {
    public static void main(String [] args){
        Random r=new Random();
        for(int i=0;i<10;i++){
            
                System.out.println(r.nextInt(10,21));
            
        }
    }
}
