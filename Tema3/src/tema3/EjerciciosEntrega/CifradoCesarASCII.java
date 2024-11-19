/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.EjerciciosEntrega;

import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class CifradoCesarASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario que introduzca a cifrar
        System.out.println("Escriba el texto que desee cifrar:");
        String texto = sc.nextLine();
        
        // Pedimos al usuario que introduzca el desplazamiento
        System.out.println("Escriba la clave numérica, que será el desplazamiento:");
        int desplazamiento = sc.nextInt();

        String encriptado = "";  // Cadena vacía para el texto cifrado

        //Bucle del Cifrado César 
        for (int i = 0; i < texto.length(); i++) {
            char caracActual = texto.charAt(i);  // Obtenemos el carácter actual
            int codigoASCII = (int) caracActual;  // Obtenemos el código ASCII del carácter

            // Aplicamos el desplazamiento en el rango 0-255 (añadimos el ASCII extendido)
            int codigoDesplazado = codigoASCII + desplazamiento;
            
                if(codigoDesplazado>255){//En caso de que el desplazamiento supere los 256 carácteres
                    codigoDesplazado= codigoDesplazado-256; //Volemos al principio de la tabla ASCII
                }
            
            //En el ejemplo del enunciado, en el cual el cifrado de 'Mesa' es ',DR@', se debe a que 
            //el rango en realidad está entre 0-254, si cambiaramos "-256" a "-255" en mi código,
            //sí da como resultado lo que se muestra en el enunciado, pero si queremos usar todo 
            //el codigo ASCII, debemos de utilizar "-256"
            
            // Convertimos el código a carácter y lo añadimos al resultado
            encriptado = encriptado + (char) codigoDesplazado;
        }

        // Mostramos la encriptación resultante
        System.out.println("Texto cifrado en ASCII extendido: " + encriptado);
    }
}