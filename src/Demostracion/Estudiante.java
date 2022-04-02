package Demostracion;

public class Estudiante extends Notas {
    int carnet;
    String nombre;
    String apellido;
    int edad;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellido = apellidos;
    }

    public Estudiante(int carnet, String nombre, String apellido, int edad) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
                
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
  
    String informacion(){
        String datos ="\n";
        datos += "El nombre del estudiante es:  " + this.nombre + "\n";
        datos += "El apellido del estudiante es:  " + this.apellido + "\n";
        datos += "El edad del estudiante es:  " + this.edad + "\n";
        datos += "El carnet del estudiante es:  " + this.carnet + "\n";
        return datos;
    }
    
    String info1(){
        String datos ="*************\n";
        datos += "El nombre del estudiante es:  " + this.getNombre() + "\n";
        datos += "El apellido del estudiante es:  " + this.getApellido() + "\n";
        datos += "El edad del estudiante es:  " + this.getEdad() + "\n";
        datos += "El carnet del estudiante es:  " + this.getCarnet() + "\n";
        datos +=  "****************\n";
        return datos;
    }
    
    String info2(int c, String n, String a, int e){
        String datos = "";
        datos += "El nombre del estudiante es:  " + n + "\n";
        datos += "El apellido del estudiante es:  " + a + "\n";
        datos += "El edad del estudiante es:  " + e + "\n";
        datos += "El carnet del estudiante es:  " + c + "\n";
        return datos;
    }
    
    String info3(Estudiante d){
        String datos = "%%%%%%%%%%%%%%%\n";
        datos += "El nombre del estudiante es:  " + d.getNombre() + "\n";
        datos += "El apellido del estudiante es:  " + d.getApellido() + "\n";
        datos += "El edad del estudiante es:  " + d.getEdad() + "\n";
        datos += "El carnet del estudiante es:  " + d.getCarnet() + "\n";
        datos +=  "%%%%%%%%%%%%%%%%%\n";
        return datos;
    }
    
     
    
}
