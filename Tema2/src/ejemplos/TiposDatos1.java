/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

/**
 *
 * @author sandr
 * Ejemplos de declaración de variables de los tipos básicos
 * Numéricos de java, carácter y boleano
 * 
 */
public class TiposDatos1 {
    public static void main(String[]args){
        
    //variables enteras    
       int variableA;
       int edad;
       int numero; 
       variableA=123;
       edad=25;
       numero=-10;
        
      System.out.println("VariableA:" + variableA);
      System.out.println("Edad:" + edad);
      System.out.println("numero:"+ numero);
      
      double altura=1.8;
      double saldoCuenta=1000;
      
      System.out.println("Saldo:" + saldoCuenta);
      
      //Errores de precisión--> Solución: casting
      
      int i=12;
      byte b;
      b=(byte)i; //Casting de conversión de tipos, de int a byte.
      
      int i1;
      byte b2=125;
      i1=b2; //No es necesario casting porque int es más grande que byte.
      
      short s1;
      short s2=1;
      short s3=2;
      s1=(short)(s2 + s3); //casting de int a short a toda la suma.
      
      float f1=(float)1.1; //casting de double a float.
      float f2=0.123F; //atajo de casting a float.
      
      //lo mas común es utilizar double, el resto no se suelen usar.
      boolean cierto;
      cierto=true;
      cierto=false;
      System.out.println("Cierto??"+ cierto); //se qieda con el ultimo valor obtenido.
      
      boolean mayor;
      mayor=true;
      mayor=(6>9); //no es true, con lo cual cuando se lo pides aparee como true.
        System.out.println("Mayor??" + mayor);
      
      //Variables de tipo char.
      char letra;
      letra='A';
      letra='Z';
      
        System.out.println("Contenido de la variable letra:"+ letra);
      
      letra=99; //Entiende el código ASCI.
        System.out.println("Contenido de la variable \"letra\":"+ letra);
        // LA contrabarra se utiliza para escapar el caracter a continuación\.
    
    letra='A'; //String no puede pasar a char, ha de ser entrecomillado simple para un caracter
    //Si quieres poner mas de un caracter con las comillas dobles, y ya no seria string
    
    //void solo se utuliza como tipo de retorno, para indicar que no devuelve nada
    
    //Declaración de constantes. CONSTANTES DECLARADAS
        final int MESES=12; //No se pueden modificar, es siempre el valor que le indicamos
        // no se puede MESES=13;
        final double PI=3.14;
        final double IVA23=0.21;
    
    //ejemplo error compilación
    char c='T';
    c=(char)(c + 5);
        System.out.println("Contenido de \"c\": "+c);
   
        
        
        
        
        
    }
    
    
    
}
