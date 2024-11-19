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
public class PotenciaRecursiva {
    public float potencia(int base, int exp){
        if(exp==0) return 1;
        if(exp>0){
            return base*potencia(base,exp+1);
        }else{
            return 1/base *potencia(base,exp +1);
        }
    }
    
    public float potenciaI(int base, int exp){
        int potencia=1;
        for(int i=0;i<exp;i++){
        potencia=potencia*base;
        }
        return potencia;
    }
    
    public static void main(String[] args) {
        PotenciaRecursiva app = new PotenciaRecursiva();
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int base = sc.nextInt();

        System.out.print("Introduce el exponente: ");
        int exp = sc.nextInt();

        System.out.println(app.potencia(base, exp));
        
        
        System.out.println(app.potenciaI(base, exp));
    }
}
