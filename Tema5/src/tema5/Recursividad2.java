/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

/**
 *
 * @author sandr
 */
public class Recursividad2 {
    public int factorial (int n){
        if(n==1) return 1;
        return n*factorial(n-1);
    }
    
    public static void main(String[] args) {
        Recursividad2 app= new Recursividad2();
        System.out.println(app.factorial(5));
    }
}
