/*
 3-. Modelar una clase Estudiante que nos permita almacenar los datos de 5 estudiantes. Los datos que nos interesan 
son el número de carnet, el nombre y el código de la carrera. Se debe de utilizar la clase HashTable para almacenar los 
datos de los estudiantes. La clase deberá de permitir almacenar los cinco estudiantes y almacenarlos en la clase 
Estudiante por medio de su constructor. Cuando los datos sean almacenados por medio del constructor, la clase deberá de 
tener un método para imprimir los datos de cada uno de los estudiantes.
 */
package Semana3Encapsulamiento;

import java.util.Hashtable;
import java.util.Scanner;


public class ClaseHashTable {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Hashtable<String,String> estudiante= new Hashtable<String,String>();
        
        for(int i = 1; i <= 5; i++){
            System.out.println("Ingrese el numero de carnet : ");
            Double carnet = leer.nextDouble();
            estudiante.put("a" +i,String.valueOf(carnet));
            System.out.println("Introdusca el nombre del estudiante : ");
            /* String nombre = leer.nextLine();
            estudiante.put( +i, String.(nombre));*/
            
        }
    }
}
