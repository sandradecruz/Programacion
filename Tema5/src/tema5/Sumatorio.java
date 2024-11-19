/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class Sumatorio {
    //metodo con recursividad
    public int sumaRecursiva (int n){
        if(n==1) return 1;
        return n+sumaRecursiva(n-1);
    }
    //metodo sin recursiviidad
    public int sumaNormal (int n){
        int sumando = 0;
        while (n > 0) {
            sumando += n;
            n--;  // Disminuir n en cada iteración
        }
        
        return sumando;
    }
    public static void main(String[] args) {
        System.out.println("Escriba un numero:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        Sumatorio app= new Sumatorio();
        System.out.println("sum("+num+")="+app.sumaRecursiva(num));
        
        System.out.println("sum("+num+")="+app.sumaNormal(num));
    }
}
