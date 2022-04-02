/*
2-. Modelar una clase CalculoIva para realizar el cálculo del IVA. La clase deberá de tener dos métodos, el primero que 
calcule el IVA al precio de un artículo el cual deberá de recibir como parámetros el precio sin IVA y el porcentaje del IVA 
a aplicar y el segundo que reciba como parámetro el precio del articulo con IVA y el porcentaje del IVA y que devuelva el 
precio del artículo sin IVA.
 */
package Semana3Encapsulamiento;

public class CalculoIva {
    private double precArtIva;
    private double precioArticulo;
    private double iva;

    public CalculoIva(){
        
    }
   

    public CalculoIva(double precioArticulo, double iva) {
        this.precioArticulo = precioArticulo;
        this.iva = iva;
    }
    
    public double getPrecioArticulo() {
        return precioArticulo;
    }

    public void setPrecioArticulo(double precioArticulo) {
        this.precioArticulo = precioArticulo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getPrecArtIva() {
        return precArtIva;
    }

    public void setPrecArtIva(double precArtIva) {
        this.precArtIva = precArtIva;
    }
    
    
    
    double calculoIva(double precArticulo, double iva1){
        double precio = precArticulo+(precArticulo * iva1);
        return precio;
    }
    
    double calculoIva2(CalculoIva preiva, double iva){
        double precio1 = preiva.getPrecioArticulo();
        iva = this.precioArticulo * this.iva;
      double precio =  preiva.calculoIva(precio1, preiva.getIva()) - iva;
        return precio;
    }
    
}
