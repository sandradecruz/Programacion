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
public class par {
    
    public static int num;
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba un numero para indicar si es par o impar: ");
        num=sc.nextInt();
        
        par pr=new par();
        boolean parimp=pr.par();
        if(parimp==false){
            System.out.println("El numero es impar.");
        }else{
            System.out.println("El numero es par.");
        }
        
    }

    public boolean par(){
        
        boolean parimp;
        if (num%2==0){
          parimp=true;  
        }else{
          parimp=false;
        }
    return parimp;
        
    }

}
