/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

/**
 *
 * @author sandr
 */
public class Recursividad1 {
    public void mostrar(int i){
        if (i==101)return;
        System.out.println(i);
        mostrar(i+1);
    }
    public static void main(String[] args) {
        Recursividad1 app=new Recursividad1();
        app.mostrar(0);
    }
}
