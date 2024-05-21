
package Modelo;


public class Adoptante extends Persona{
    private double salario;

    public Adoptante(int cedula, String nombre, String apellido, int edad, String correo, int numero) {
        super(cedula, nombre, apellido, edad, correo, numero);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
