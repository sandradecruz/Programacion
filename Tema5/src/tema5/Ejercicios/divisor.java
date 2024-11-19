/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class divisor {
    public static int num;
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe un numero para encontrar un divisor:");
        num=sc.nextInt();
        
        divisor dv=new divisor();
        int sol=dv.div();
        System.out.println("El mayor divisor de "+num+" es: "+sol);
        
    }
    
    public int div(){
        
        int sol=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sol=i;
            }
        }
        return sol;
    }
}
