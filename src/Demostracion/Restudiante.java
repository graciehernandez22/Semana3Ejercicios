package Demostracion;

import java.util.Scanner;

public class Restudiante {

    public static void main(String[] args) {
   String nombre, apellido;
   int carnet, edad;
   String info = "";
   double promedio;
   String cualidad ="";

        Estudiante objecto = new Estudiante();
        // Estudiante  objecto1 = new Estudiante("Graciela", "Hernandez");
        //Estudiante  objecto2 = new Estudiante(209121, "Graciela", "Hernandez", 22);
        Scanner leer = new Scanner(System.in);
        
        
         System.out.println("Digite el carnet del estudiante: ");
         objecto.setCarnet(Integer.parseInt(leer.nextLine()));
         
        System.out.println("Digite el nombre del estudiante: ");
        objecto.setNombre(leer.nextLine());
        
         System.out.println("Digite el apellidos del estudiante: ");
        objecto.setApellido(leer.nextLine());
        
        System.out.println("Digite el edad del estudiante: ");
         objecto.setEdad(leer.nextInt());
         
          System.out.println("Digite el nota 1 del estudiante: ");
         objecto.setN1(leer.nextDouble());
         
         System.out.println("Digite el nota 2 del estudiante: ");
         objecto.setN2(leer.nextDouble());
         
         System.out.println("Digite el nota 3 del estudiante: ");
         objecto.setN3(leer.nextDouble());
         
        //  info = objecto.informacion();
        // info = objecto.info1();
          // info = objecto.info3(objecto);
         info = objecto.info2(objecto.getCarnet(), objecto.getNombre(), objecto.getApellido(), objecto.getEdad());
          
         promedio = objecto.promedio(objecto);
          cualidad = objecto.cualidad(objecto);
          
          System.out.println("" + info);
         System.out.println("La nota final es :" + promedio);
         System.out.println("Observacion: " + cualidad);
        
    }

}
