/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deCruzSandra;

/**
 *Escribe un método recursivo en Java que cuente la cantidad de dígitos de un número entero 
positivo. El método debe recibir un número y devolver cuántos dígitos tiene.
 * @author crutorsa
 */

//Incompleto

public class Recursividad {
    public int cuantosDigitos(String numero){
        if(numero.length()==0) return 0;
        int digitos=0;
        digitos++;
        return cuantosDigitos("");
    }
    public static void main(String[] args) {
        Recursividad app=new Recursividad();
        String numero="12345";
        System.out.print("Las cifras que tiene el numero "+numero+" es de: ");
        System.out.print(app.cuantosDigitos(numero));
    
    }
}
