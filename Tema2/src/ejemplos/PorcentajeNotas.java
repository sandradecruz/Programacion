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
public class PorcentajeNotas {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos los datos
        System.out.print("Introduce el numero de sobresalientes: ");
        int sobresalientes = sc.nextInt();

        System.out.print("Introduce el numero de notables: ");
        int notables = sc.nextInt();

        System.out.print("Introduce el numero de aprobados: ");
        int aprobados = sc.nextInt();

        System.out.print("Introduce el numero de suspensos: ");
        int suspensos = sc.nextInt();

        System.out.print("Introduce el numero de no presentados: ");
        int noPresentados = sc.nextInt();

        // Calculamos los datos obtenidos
        int totalAlumnos = sobresalientes + notables + aprobados + suspensos + noPresentados;
        int totalPresentados = sobresalientes + notables + aprobados + suspensos;
        int totalAprobados = sobresalientes + notables + aprobados;
        int totalNoAprobados = suspensos;

        // Calculamos los porcentajes
        double porcentajeSB = (sobresalientes * 100.0) / totalAlumnos;
        double porcentajeN = (notables * 100.0) / totalAlumnos;
        double porcentajeA = (aprobados * 100.0) / totalAlumnos;
        double porcentajeS = (suspensos * 100.0) / totalAlumnos;
        double porcentajeNP = (noPresentados * 100.0) / totalAlumnos;

        double porcentajePresentados = (totalPresentados * 100.0) / totalAlumnos;
        double porcentajeAprobados = (totalAprobados * 100.0) / totalPresentados;
        double porcentajeSuspensos = (totalNoAprobados * 100.0) / totalPresentados;
        double porcentajeNoPresentados = porcentajeNP;

        // Resultados de los porcentajes
        System.out.printf("SB=%d (%.2f%%)\n", sobresalientes, porcentajeSB);
        System.out.printf("N=%d (%.2f%%)\n", notables, porcentajeN);
        System.out.printf("A=%d (%.2f%%)\n", aprobados, porcentajeA);
        System.out.printf("S=%d (%.2f%%)\n", suspensos, porcentajeS);
        System.out.printf("NP=%d (%.2f%%)\n", noPresentados, porcentajeNP);

        System.out.printf("Total=%d (100%%)\n", totalAlumnos);
        System.out.printf("Total presentados=%d (%.2f%%)\n", totalPresentados, porcentajePresentados);
        System.out.printf("Total aprobados=%d (%.2f%%)\n", totalAprobados, porcentajeAprobados);
        System.out.printf("Total suspensos=%d (%.2f%%)\n", totalNoAprobados, porcentajeSuspensos);
        System.out.printf("Total no presentados=%d (%.2f%%)\n", noPresentados, porcentajeNoPresentados);

        sc.close();
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
}
