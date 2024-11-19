/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class Operaciones {

    public Scanner sc=new Scanner(System.in);
    public int n1;
    public int n2;
    
    public int suma(int a, int b){
            int resultado=a+b;
            return resultado;
        }
    
    public int resta(int a, int b){
            int resultado=a-b;
            return resultado;
        }
    
    public int producto(int a, int b){
            int resultado=a*b;
            return resultado;
        }
    
    public int cociente(int a, int b){
            int resultado=a/b;
            return resultado;
        }
    
    public void pedirNumeros(){
        
        System.out.println("Primer numero:");
       n1=sc.nextInt();
        
        System.out.println("Segundo numero:");
       n2=sc.nextInt();
    }
    

    
    public static void main(String[] args) {
        // Programa que realice operaciones aritmetricas basicas con dos operandos
        
        Operaciones op=new Operaciones();
        
        op.pedirNumeros();
        
        int resultado=op.suma(op.n1,op.n2);
        System.out.println(resultado);
        
        resultado=op.resta(op.n1,op.n2);
        System.out.println(resultado);
        
        resultado=op.producto(op.n1,op.n2);
        System.out.println(resultado);
        
        resultado=op.cociente(op.n1,op.n2);
        System.out.println(resultado);
    }
    
}
