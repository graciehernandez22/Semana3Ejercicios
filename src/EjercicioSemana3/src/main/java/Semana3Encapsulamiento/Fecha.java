/*
3-. Crear la clase FormatoFecha para probar el POLIMORFISMO. La clase deberá de tener definidos dos métodos que 
reciban una fecha sin guiones ni plecas en formato String. Ejemplo 10062012. 
a) El primer método deberá de imprimir la fecha con guiones. Ejemplo: 10-06-2012.
b) El segundo método deberá de imprimir la fecha con plecas. Ejemplo: 10/06/2012
 */
package Semana3Encapsulamiento;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Fecha {
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat fech1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat fech2 = new SimpleDateFormat("yyyy/MM/dd");
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Introdusca la fecha:");
        String fecha = leer.nextLine();
        
        Date fecha1 = fech1.parse(fecha);
        System.out.println("--------------------------------------");
        System.out.println(fech1.format(fecha1));
        System.out.println("-------------------------------------- ");
        
        System.out.println("Introdusca la fecha:");
        String fech = leer.nextLine();
        
        Date fecha2 = fech1.parse(fecha);
        System.out.println("--------------------------------------");
        System.out.println(fech2.format(fech));
        System.out.println("-------------------------------------- ");
    }
    
}
