/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;



/**
 *
 * @author sandr
 */
public class CarreraCaballos {
    public static void main(String [] args){
        System.out.println("Que comience la carrera de caballos.");
        //caballos 
         int ca=0;
         int cb=0;
         

         
        //linea de meta
        int meta= (int)(1+ Math.random() *  100);
        
        //carrera
        while (ca< meta && cb < meta) {
            // Elegimos aleatoriamente cuál caballo avanza (1 o 2)
            int avance =(int)(2*Math.random());
            
            //hacemos el avance
            if (avance == 1) {
                ca++;
            } else {
                cb++;
            }
        
            //mostramos el avance
            for (int i = 0; i < ca; i++) {
                System.out.print("1");
            }
            System.out.println(" "); //Linea separadora
            
            for (int i = 0; i < cb; i++) {
                System.out.print("2");
            }
        }

//variable ganador
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Ganadores:");
            if(ca>=meta){
                System.out.println("El caballo 1 es el ganador!");
            }else{
                System.out.println("El caballo 2 es el ganador!");
            }
        
        
        
    }
        
}
