/*
1-. Modelar una clase Casa con los atributos número de casa, numero de pasaje y nombre de la calle. El número de la 
casa debe ser alfanumérico para contemplar las casas que tengan números como “27A”). Cuando la casa se crea se asigna 
tanto el número de la casa, el número de pasaje y la calle. La clase tiene que tener definido un método para imprimir los valores 
asignados.
 */
package Semana3Encapsulamiento;

public class Casa {
    private int noCasa;
    private int noPasaje;
    private String nomCalle;

    public Casa() {
    }

    public Casa(int noCasa, int noPasaje, String nomCalle) {
        this.noCasa = noCasa;
        this.noPasaje = noPasaje;
        this.nomCalle = nomCalle;
    }

    public int getNoCasa() {
        return noCasa;
    }

    public void setNoCasa(int noCasa) {
        this.noCasa = noCasa;
    }

    public int getNoPasaje() {
        return noPasaje;
    }

    public void setNoPasaje(int noPasaje) {
        this.noPasaje = noPasaje;
    }

    public String getNomCalle() {
        return nomCalle;
    }

    public void setNomCalle(String nomCalle) {
        this.nomCalle = nomCalle;
    }
    
    String infoCasa(){
        String datos = "";
        datos +="N° de casa :"+this.getNoCasa()+"\n";
        datos +="N° de pasaje :"+this.getNoPasaje()+"\n";
        datos +="Nombre de la calle :"+this.getNomCalle()+"\n";
        return datos;
    }
}
