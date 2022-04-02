/*
1-. Crear la clase Empleado utilizando ENCAPSULAMIENTO con las siguientes características:
Atributos: (No Nit, Apellidos, Nombres, Dirección, Salario Devengado, Salario Con Descuento, Bandera de Empleado Activo o 
Inactivo)
Métodos:
a) Crear un método para calcular el Salario con Descuento que es Salario Devengado –
b) Descuento del 10% de Renta
c) Crear un método para Imprimir el Nombre Completo del Contribuyente
d) Imprimir Todos los Atributos
e) Crear el método main para probar el funcionamiento de la clase y realizar sus pruebas.
 */
package Semana3Encapsulamiento;

public class Empleado {

    private double nit;
    private String nombre;
    private String apellido;
    private String direccion;
    private double salario;
    private int bandera;

    public Empleado() {
    }

    public Empleado(double nit, String nombre, String apellido, String direccion, double salario, int bandera) {
        this.nit = nit;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.salario = salario;
        this.bandera = bandera;
    }

    public double getNit() {
        return nit;
    }

    public void setNit(double nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getBandera() {
        return bandera;
    }

    public void setBandera(int bandera) {
        this.bandera = bandera;
    }

    public double descuentoRenta() {
        double salarioConDescuento = this.salario - (this.salario * 0.10);
        return salarioConDescuento;
    }

    public void bandera() {
        if(this.bandera == 1){
            System.out.println("Activo");
        }else{
            System.out.println("Inactivo");
        }
    }

    public String informacion(Empleado A) {
        String datos = "";

        datos += "Introdusca el N° de NIT :" + A.getNit() + "\n";
        datos += "Introdusca el Nombre del Empleado : " + A.getNombre() + "\n";
        datos += "Introdusca el Apellido del Empleado : " + A.getApellido() + "\n";
        datos += "Introdusca la direccion : " + A.getDireccion() + "\n";
        datos += "El salario Devengado es : $" + A.getSalario() + "\n";
        return datos;
    }

}
