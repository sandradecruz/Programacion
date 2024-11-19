/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.Ejercicios.Practica1;


import java.security.SecureRandom;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class deCruz_Tordable_Sandra_FirstTry {
    public static Scanner sc=new Scanner(System.in);
    public static Random random = new Random();
    
    //Metodo de la creacion del usuario.
    public String crearUsuario(String nombre, String apellido1, String apellido2){
        String usuario="";
        
        for(int i=0;i<2;i++){
            usuario=usuario+Character.toLowerCase(apellido2.charAt(i));
        }
        
        for(int i=0;i<2;i++){
            usuario=usuario+Character.toLowerCase(apellido1.charAt(i));
        }
        
        for(int i=0;i<3;i++){
            usuario=usuario+Character.toLowerCase(nombre.charAt(i));
        }
        
        return usuario;
    }
    
    //(1)Metodo de la contrase�a mediante metodos mecanicos.
    public String contrasenaMecaninca (){
        String contrasenaMecanica="";
        char[][] tablaFraccionamiento = {
        {'a', 'b', 'c', 'd', 'e', 'f'},
        {'g', 'h', 'i', 'j', 'k', 'l'},
        {'m', 'n', 'o', 'p', 'q', 'r'},
        {'s', 't', 'u', 'v', 'w', 'x'},
        {'y', 'z', '0', '1', '2', '3'},
        {'4', '5', '6', '7', '8', '9'}};

        int longitudContrasena1 = random.nextInt(5) + 4;
        
        for (int i = 0; i < longitudContrasena1; i++) {
            int fila = random.nextInt(6);
            int columna = random.nextInt(6);
            char caracter = tablaFraccionamiento[fila][columna];
            //Lanzamiento de moneda para la elecci�n final del caracter.
            if (Character.isLetter(caracter)) { //En caso de que sea una letra
                if (random.nextBoolean()) {
                    caracter = Character.toUpperCase(caracter);
                }
            }else{ //En caso de que sea un digito
                if (random.nextBoolean()) { 
                    switch (caracter) {
                        case '0': 
                            caracter = '='; 
                            break;
                        case '1': 
                            caracter = '!'; 
                            break;
                        case '2': 
                            caracter = '@';
                            break;
                        case '3': 
                            caracter = '#'; 
                            break;
                        case '4': 
                            caracter = '$'; 
                            break;
                        case '5': 
                            caracter = '%'; 
                            break;
                        case '6': 
                            caracter = '&'; 
                            break;
                        case '7': 
                            caracter = '/'; 
                            break;
                        case '8': 
                            caracter = '('; 
                            break;
                        case '9': 
                            caracter = ')'; 
                            break;
                        default: break;
                    }
                }
            }
            contrasenaMecanica=contrasenaMecanica + caracter;
        }
        //Devolvemos la contrase�a resultante.
        return contrasenaMecanica;
    }
    
    //(2)Metodo de la contrase�a mediante algoritmos.
    public String contrasenaAlgortimo (){
        SecureRandom sr=new SecureRandom();
        String contrasenaAlgoritmo="";
        String caracteres="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%/&()="; //Todos los caracteres validos para generar la contrase�a
        int longitudContrasena2 = random.nextInt(5) + 4; //Generamos la longitud de contrase�a aleatoria entre 4 y 8.
        
        for (int i = 0; i < longitudContrasena2; i++) {
            // Seleccionamos un indice aleatorio de la cadena de caracteres.
            int indiceAleatorio = sr.nextInt(caracteres.length());
            contrasenaAlgoritmo =contrasenaAlgoritmo + caracteres.charAt(indiceAleatorio);
        }
        //Devolvemos la contrase�a resultante. 
        return contrasenaAlgoritmo;
    }   
    
    //(3)Metodo de la contrase�a mediante la idea propuesta. 
    public String contrasenaIdea (String nombre, String apellido1, String numdni, String fechaNacimiento){
        String contrasenaIdea="";
        
        
        //Creamos un aleatorio que indique la longitud de la contrase�a.
        int longitudContrasena3=random.nextInt(5) + 4; 
        int indice=0;
        while(indice<longitudContrasena3){
            //Hallamos la letra del DNI.
            int numeros=Integer.parseInt(numdni);
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            int resto = numeros % 23;
            char letra=letras.charAt(resto);

            //Primera letra del nombre en may�sculas.
            if (indice < longitudContrasena3) {
                contrasenaIdea=contrasenaIdea+Character.toUpperCase(nombre.charAt(0));
                indice++;
            }
            
            //�ltima letra del primer apellido en min�sculas.
            if (indice < longitudContrasena3) {
                int ultimaLetra=apellido1.length()-1;
                contrasenaIdea=contrasenaIdea+Character.toLowerCase(apellido1.charAt(ultimaLetra));
                indice++;
            }    
     
            //Dos �ltimas cifras del DNI.
            if (indice < longitudContrasena3) {
                for(int i=6;i<8 && indice < longitudContrasena3;i++){
                    contrasenaIdea=contrasenaIdea+numdni.charAt(i);
                indice++;    
                }
            }
            //Letra de d�gito de control del DNI en may�sculas.
            if (indice < longitudContrasena3) {
                contrasenaIdea=contrasenaIdea+letra;
                indice++;
            }
            
            //Dos �ltimas cifras del a�o de nacimiento.
            if (indice < longitudContrasena3) {
                for(int a=8;a<10 && indice < longitudContrasena3;a++){
                    contrasenaIdea=contrasenaIdea+fechaNacimiento.charAt(a);
                    indice++;
                }
            }
            
            //S�mbolo aleatorio de entre los que aparecen en un teclado est�ndar encima de los n�meros (0-9). 
            String simbolos = "!@#$%/&()="; //String de los simbolos del 0 al 9.
            if (indice < longitudContrasena3) {
                int indiceAleatorio = random.nextInt(simbolos.length()); //Solicitamos un numero random correspondiente a la longitud de la cadena.
                char simboloAleatorio = simbolos.charAt(indiceAleatorio); 
                contrasenaIdea=contrasenaIdea+simboloAleatorio;
                indice++;
            }
        }
        //Devolvemos la contrase�a final.
        return contrasenaIdea;
    }
    
    //Comprobamos si la contrase�a resultante tiene caracteres especiales
    public boolean contieneCaracteresEspeciales(String contrasena, String caracteresEspeciales) {
    for (int i = 0; i < contrasena.length(); i++) {
        if (caracteresEspeciales.contains(String.valueOf(contrasena.charAt(i)))) {
            return true;
        }
    }
    return false;
}
    
    public static void main(String[] args) {
        deCruz_Tordable_Sandra_FirstTry app=new deCruz_Tordable_Sandra_FirstTry();
        String nombre;
        String apellido1;
        String apellido2;
        String numdni;
        String fechaEntrada;
        
        //Comenzamos a solicitar y validar los datos uno por uno, para que el usuario no tenga que repetir
        //todo al escribir mal algun dato, hacemos que la solicitud del dato se repita en un bucle
        //hasta que el dato introducido sea adecuado.
        
        boolean valido; //Variable para ayudarnos con la validacion
        do{
            System.out.println("Escriba su nombre:");
            nombre=sc.nextLine().trim();
                if (nombre.isEmpty()) {
                    System.out.println("El nombre no puede estar vac�o. Intentelo de nuevo.");
                    valido=false;
                }else if (nombre.matches(".*\\d.*")) { //En caso de que haya puesto numeros
                    System.out.println("El nombre no puede contener n�meros. Intentelo de nuevo.");
                    valido=false;
                }else{
                  valido=true; 
                }                 
        }while(!valido);
        
        do{
            System.out.println("Escriba su primer apellido:");
            apellido1=sc.nextLine().trim();
        if (apellido1.isEmpty()) {
                valido=false;
                System.out.println("El apellido no puede estar vac�o. Intentelo de nuevo.");
            }else if (apellido1.matches(".*\\d.*")) { 
                valido=false;
                System.out.println("El apellido no puede contener n�meros. Intentelo de nuevo.");
            }else{
              valido=true; 
            }
        }while(!valido);
        
        do{
            System.out.println("Escriba su segundo apellido:");
            apellido2=sc.nextLine().trim();
            if (apellido2.isEmpty()) {
                    valido=false;
                    System.out.println("El apellido no puede estar vac�o. Intentelo de nuevo.");
                }else if (apellido2.matches(".*\\d.*")) { 
                    valido=false;
                    System.out.println("El apellido no puede contener n�meros. Intentelo de nuevo.");
                }else{
                  valido=true; 
                }                 
        }while(!valido);
        
        do{
            System.out.println("Escriba su DNI sin incluir la letra:");
            numdni=sc.nextLine().trim();
                if (numdni.matches("\\d{8}")) {
                    valido=true; // Si cumple el formato
                }else{
                    System.out.println("El DNI debe contener 8 d�gitos. Intentelo de nuevo.");
                    valido=false;
                }
        } while (!valido);
        
        LocalDate fechaNacimiento;
        do{
            System.out.println("Escriba su fecha de nacimiento (dd/mm/aaaa):");
            fechaEntrada=sc.nextLine().trim();
            try {
                //Formateo para que la fecha este escrita correctamente
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                fechaNacimiento = LocalDate.parse(fechaEntrada, dtf);

                //Verificamos que la fecha es anterior a la actual
                if (fechaNacimiento.isBefore(LocalDate.now())) {
                    valido = true;
                } else {
                    System.out.println("La fecha de nacimiento debe ser anterior a la fecha actual. Intentelo de nuevo.");
                    valido = false;
                }
            } catch (DateTimeParseException e) {
                System.out.println("Formato de fecha invalido. Por favor, use el formato dd/mm/aaaa. Intentelo de nuevo.");
                valido = false;
            }
        } while (!valido);
        
        //Color de las letras
        String RESET = "\u001B[0m";
        String ROJO = "\u001B[31m";
        String AMARILLO = "\u001B[33m";
        String VERDE = "\u001B[32m";
        
        
        String contrasena1=app.contrasenaMecaninca();
        String contrasena2=app.contrasenaAlgortimo();
        String contrasena3=app.contrasenaIdea(nombre, apellido1, numdni, fechaEntrada);
        String caracteresEspeciales = "!@#$%/&()="; //Variable para detectar si hay caracteres especiales dentro de la contrase�a
        
        
        System.out.println("----------------");
        
        //Llamamos al metodo de la creacion del usuario.
        System.out.println("Su usuario es: "+app.crearUsuario(nombre, apellido1, apellido2));
        
        
        //Mostramos la primera contrase�a
        if(contrasena1.length()<6){ //Comprobamos que tan segura es la contrase�a generada.
            System.out.println("La primera contrase�a generada es: "+contrasena1+" y es "+ROJO+" poco segura."+RESET);
        }else if(contrasena1.length() >= 6 && app.contieneCaracteresEspeciales(contrasena1, caracteresEspeciales)){
            System.out.println("La primera contrase�a generada es: "+contrasena1+" y es "+VERDE+" muy segura."+RESET);
        }else{
            System.out.println("La primera contrase�a generada es: "+contrasena1+" y es "+AMARILLO+" segura."+RESET);
        }
        
        //Mostramos la segunda contrase�a
        if(contrasena2.length()<6){ //Comprobamos que tan segura es la contrase�a generada.
            System.out.println("La segunda contrase�a generada es: "+contrasena2+" y es "+ROJO+" poco segura."+RESET);
        }else if(contrasena2.length()>=6 && app.contieneCaracteresEspeciales(contrasena2, caracteresEspeciales)){
            System.out.println("La segunda contrase�a generada es: "+contrasena2+" y es "+VERDE+" muy segura."+RESET);
        }else{
            System.out.println("La segunda contrase�a generada es: "+contrasena2+" y es "+AMARILLO+" segura."+RESET);
        }
        
        //Mostramos la tercera contrase�a
        if(contrasena3.length()<6){ //Comprobamos que tan segura es la contrase�a generada.
            System.out.println("La tercera contrase�a generada es: "+contrasena3+" y es "+ROJO+" poco segura."+RESET);
        }else if(contrasena3.length()>=6 && app.contieneCaracteresEspeciales(contrasena3, caracteresEspeciales)){
            System.out.println("La tercera contrase�a generada es: "+contrasena3+" y es "+VERDE+" muy segura."+RESET);
        }else{
            System.out.println("La tercera contrase�a generada es: "+contrasena3+" y es "+AMARILLO+" segura."+RESET);
        }
        System.out.println("----------------");
    }
}