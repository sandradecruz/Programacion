/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;
import java.util.Random;

/**
 *
 * @author sandr
 */

public class Aleatorios25 {
    public static void main(String[] args) {
        Random r = new Random();
        int max = 0;

        for (int i = 0; i < 25; i++) {
            int numero = r.nextInt(1, 1001);
            System.out.println(numero);
            if (numero > max) {
                max = numero;
            }
        }
        System.out.println("El mayor numero generado es: " + max);
    }
}