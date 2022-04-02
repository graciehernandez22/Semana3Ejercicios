
package Semana3Encapsulamiento;

import java.util.Scanner;

public class MainEmpleado {
    public static void main(String[] args) {
        String nombre, apellido, direccion;
        double noNit, salarioDevengado, salarioDescuento;
        String bandera = "";
        String info = "";
        double descu = 0.0;
        Empleado empleado = new Empleado();
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de NIT :");
        empleado.setNit(Double.parseDouble(leer.nextLine()));
        System.out.println("Ingresa el nombre :");
        empleado.setNombre(leer.nextLine());
        System.out.println("Ingrese el Apellido :");
        empleado.setApellido(leer.nextLine());
        System.out.println("Direccion del Empleado :");
        empleado.setDireccion(leer.nextLine());
        System.out.println("Salario devengado : ");
        empleado.setSalario(leer.nextDouble());
        System.out.println("Escriba si el empleado esta activo o inactivo :");
        empleado.setBandera(leer.nextInt());
        //empleado.setBandera(Boolean.toString(leer.hasNextBoolean())); 
        info = empleado.informacion(empleado);
        descu = empleado.descuentoRenta();
        
        
        System.out.println("------------------------------------");
        System.out.println(""+info);
        System.out.println("El salario con descuento de renta es : $"+ descu);
        empleado.bandera();
       
    }
}
