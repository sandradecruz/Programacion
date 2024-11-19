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
public class MCD {
    
    public static int mcd(int mayor, int menor) {
        while (menor != 0) {
            int aux = menor;
            menor = mayor % menor;
            mayor = aux;
        }
        return mayor;
    }

    public int mcdrecur(int mayor, int menor){
        int resto=0;
        resto=mayor%menor;
        if(resto==0)return menor;
        return mcdrecur(menor,resto);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número (mayor):");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo número (menor):");
        int num2 = sc.nextInt();

        //nos aseguramos de que el primero sea el mayor
        if (num1 < num2) {
            int aux = num1;
            num1 = num2;
            num2 = aux;
        }

        int resultado = mcd(num1, num2);
        System.out.println("El MCD de " + num1 + " y " + num2 + " es: " + resultado);
        
        MCD app= new MCD();
        System.out.println(app.mcdrecur(num1, num2));
    }
}
