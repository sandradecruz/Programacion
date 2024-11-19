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
public class MultiplicarRecursivo {
    //Realiza un programa que calcule el producto de 2 enteros, con recursividad.
    public int producto(int n1, int n2) {
        if (n2 == 0) {
            return 0;
        }

        if (n2 > 0) {
            return n1 + producto(n1, n2 - 1);
        } else {
            return -n1 + producto(n1, n2 + 1);
        }
    }

    public static void main(String[] args) {
        MultiplicarRecursivo app = new MultiplicarRecursivo();
        System.out.println(app.producto(-2, 3));
    }
}
