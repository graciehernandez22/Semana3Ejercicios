
package Semana3Encapsulamiento;

import java.util.Scanner;

public class MainCalculoIva {
    public static void main(String[] args) {
        double calcIVA1 = 0.0;
        double calciva2 = 0.0;
        CalculoIva caliva = new CalculoIva();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introdusca el Precio :");
        caliva.setPrecioArticulo(leer.nextDouble());
        System.out.println("Introdusca el IVA :");
        caliva.setIva(leer.nextDouble());
        System.out.println("-------------------------------");
        
        calcIVA1 = caliva.calculoIva(caliva.getPrecioArticulo(),caliva.getIva());
        calciva2 = caliva.calculoIva2(caliva, caliva.getIva());
        
        System.out.println("Precio con IVA : $"+calcIVA1);
        System.out.println("Precio sin IVA : $"+calciva2);
    }
}
