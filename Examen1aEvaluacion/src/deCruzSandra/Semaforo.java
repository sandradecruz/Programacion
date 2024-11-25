/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deCruzSandra;

import java.util.Scanner;

/**
 *
 * @author crutorsa
 */
public class Semaforo {
    //Variables de los colores del semaforo
    public static final String RED = "🔴 ROJO"; // 🔴
    public static final String GREEN = "🟢 VERDE"; // 🟢
    public static final String YELLOW = "� AMARILLO"; // �

    public String aRojo(){
        return RED;
    }
    
    public String aVerde(){
        return GREEN;
    }
    
    public String aAmarillo(){
        return YELLOW;
    }
    
    public String generarCiclo(int ciclo){
        if(ciclo==0) return"";
        //Hacemos un bucle de los ciclos segun el orden que pide el ejercicio.
        // Rojo --> Verde --> Amarillo
        for(int i=0;i<ciclo;i++){ 
        System.out.println(aRojo());
        System.out.println(aVerde());
        System.out.println(aAmarillo());
        System.out.println();
        }
        return "";
    }
    public static void main(String[] args) {
        Semaforo app=new Semaforo();
        Scanner sc=new Scanner(System.in);
        System.out.print("Escriba cuantos ciclos quiere:");
        int ciclos=sc.nextInt();
        
        //Llamamos al generador de ciclos
        app.generarCiclo(ciclos);
    }
}
