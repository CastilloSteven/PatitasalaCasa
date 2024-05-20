package Modelo;

import java.util.ArrayList;

public class Validaciones {
    
    public boolean evaluarCedula(int cedula) {
        
        return cedula > 1;
    }
    
    public boolean evaluarNombre(String nombre) {
        return nombre.matches("^[a-zA-Z\\s]+");
    }

    public boolean evaluarEdadC(int edad) {   
        return edad >= 18 && edad<=120;
    }
    
    public boolean evaluared(int edad) {   
        return edad >= 1 && edad <= 120;
    }
    public boolean evaluarFecha(date Fecha){
        return Fecha > 0;
    }
    public boolean evaluarId(int id){
        return id > 0 && id<= 1000000000;
    }
    public boolean evaluarSalario(double salario){
        return salario > 1200000 && salario <=20000000;
    }
    public boolean evaluarTelefono(double telefono){
        return telefono > 0 && telefono <=400000000;
    }
    
    }
    


