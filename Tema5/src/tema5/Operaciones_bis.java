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
public class Operaciones_bis {

    public Scanner sc=new Scanner(System.in);
    
    
    
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
    public int pedirNumero1(){
        System.out.println("Primer numero:");
        int n1=sc.nextInt();
        return n1;
    }
    public int pedirNumero2(){
        System.out.println("Segundo numero:");
        int n2=sc.nextInt();
        return n2;
    }
    

    public static void main(String[] args) {
        // Programa que realice operaciones aritmetricas basicas con dos operandos
        Operaciones op=new Operaciones();
        
        
        int n1 = op.n1; 
        int n2 = op.n2;

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
