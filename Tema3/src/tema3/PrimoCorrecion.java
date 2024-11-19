/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class PrimoCorrecion {
    @SuppressWarnings("DeadBranch")
    public static void main (String [] args){
        
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Escriba un numero:");
        int n= sc.nextInt();


        int i=2;
        boolean primo=true;
        while(i< n && primo){
            if(n%i !=0){
                primo=false;
            }
            i++;


        }
        
        if(primo){
            System.out.println("Numero primo.");
        }
        else{
            System.out.println("Numero NO primo.");
        }
    }
}
