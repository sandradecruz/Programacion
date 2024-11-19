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
public class MayorDe3 {
    
    Scanner sc=new Scanner(System.in);
    //Metodo que solicita al usuario un numero entero
    public int pedirNumeros(){
        try{
            System.out.print("Introduce un numero: ");
            String entrada=sc.next();
            
            int n=Integer.parseInt(entrada);
            return n;
            
        }catch(NumberFormatException ex){
            System.out.println("Error.Introduzca un dato numerico.");
        }
        
        return Integer.MIN_VALUE; //caso de error (?)
    }
    
    public int elMayor(int n1, int n2, int n3){
       int mayor=elMayor(n1,n2);
       return elMayor(n3, mayor);
    }
    
    public int elMayor(int n1, int n2){
        if(n1>n2) return n1;
        else return n2;
    }
    
    public static void main(String[] args) {
       MayorDe3 app=new MayorDe3();
       //pedimos los 3 numeros enteros
       
       int a=app.pedirNumeros();
       int b=app.pedirNumeros();
       int c=app.pedirNumeros();
       
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        if(a!=Integer.MIN_VALUE && b!=Integer.MIN_VALUE && c!=Integer.MIN_VALUE){
            
            int mayor=app.elMayor(a, b, c);
            System.out.println("El mayor es: "+mayor);
            
            
        }else{
            System.out.println("Error. Vuelve a intentarlo, algun dato es no valido.");
        }
    }
}
