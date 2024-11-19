/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

/**
 *
 * @author sandr
 */
public class Multiplos23for {
    public static void main (String [] args){
        int m2=0;
        int m3=0;
        
        
        for(int i=1;i<=25; i++){
            if(i%2==0){
                m2++;
            }
            
            if(i%3==0){
                m3++;
            }
        }
        System.out.println("Los multiplos de 2 son : "+m2);
        System.out.println("Los multiplos de 3 son : "+m3);
        
        
        
        
        
        
    }
}
