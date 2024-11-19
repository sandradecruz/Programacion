/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class EjemploOperadoresAritmeticos {
   //Ejemplo operador ?
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    System.out.print("Introduce tu edad: ");
    int edad= sc.nextInt();
    double beca=(edad >=18) ? 500 : 0;
        //boolean mayorEdad ? 500:0;
    
    System.out.println("Tu beca es de: " + beca+"€");
    
    //otro ejemplo de ?
    //Pido una nota, y el programa me dice si esta aprobado o suspenso
        System.out.println("Introduce nota de examen:");
    double nota= sc.nextDouble();
    String calificacion=(nota>=5)?"Aprobado":"Suspenso";
        System.out.println("Calificacion:"+calificacion);
    
    }
}
