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
public class Ordenar {
    //Escribe un programa ordenar que solicite al usuario un par de palabras(todas en la misma linea)
    //separadas por espacios. A continuación, el programa mostrará las palabras colocadas en orden alfabético (ascendente).
    //Ejemplo hola   adios --> adios hola
    //considera la posibilidad de que las palabras estén separadas por más de un espacio.
    
    public static void main (String [] args){
            
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un par de palabras separadas por espacios:");
        String palabras = sc.nextLine();
        
            if (palabras.isEmpty()) {
                System.out.println("Por favor, introduce exactamente dos palabras.");
            } else {
                //extraigo de la cadena original las palabras individuales
                palabras=palabras.trim(); //se convierte en otro objeto. Quitoo espacios de principio y final
                
                if(!palabras.contains(" ")){ //si no hay espacio entre dos palabras, es que no hay dos palabras
                    System.out.println("Debes de introducir dos palabras. Intentelo de nuevo");
                    
                }else{ //hay dos palabras
                    String palabra1= palabras.substring(0,palabras.indexOf(" "));                    
                    String resto= palabras.substring(palabras.indexOf(" "));
                    String palabra2=resto.trim();//quitamos los espacios de el resto, y ya tenemos la palabra
                
                    //ordenamos las dos palabras
                    if(palabra1.compareTo(palabra2)>0){
                        System.out.println(palabra2+" "+palabra1);
                    }else if(palabra1.compareTo(palabra2)<0){
                        System.out.println(palabra1+" "+palabra2);
                    }else{
                        System.out.println("Has introducido dos palabras iguales: "+palabra1+" "+palabra2);
                    }
                }
            }
    }
}