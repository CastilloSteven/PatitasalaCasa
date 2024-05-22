package Modelo;

import Vista.InOut;
import java.util.ArrayList;
import java.util.Date;

public class PatitasALaCasa {

    //Atributos
    ArrayList <Mascota> mascotas = new ArrayList <Mascota>();
    ArrayList <Mascota> mascotasAdoptadas = new ArrayList <Mascota>();
    ArrayList <Mascota> fechaLlegada = new ArrayList <Mascota>();
    ArrayList <Mascota> fechaAdopcion = new ArrayList <Mascota>();
    ArrayList <Adoptante> adoptante = new ArrayList <Adoptante>();
    ArrayList <PatitasALaCasa> adoptante_Mascota = new ArrayList <PatitasALaCasa>();
    ArrayList <Administrador> administrador = new ArrayList <Administrador>();
    ArrayList<Integer> idsPersonas = new ArrayList<>();
    ArrayList<Integer> idsMascotas = new ArrayList<>();
    InOut oe=new InOut();
    Validaciones v=new Validaciones();
    
    public PatitasALaCasa(){
        
    }
    
    public void crearAdmin(){
        int ced, edad, num, res;
        String nom, ape, correo;
        Administrador admin;
        res=oe.pedirEntero("Crear Administrador \n 1. Ingresar nuevo administrador \n Otro numero para salir");
        while(res==1){
            do{
                nom=oe.pedirString("Ingrese el nombre del administrador");
            }while(!v.evaluarNombre(nom));
            
            do{
                ape=oe.pedirString("Ingrese el apellido del administrador");
            }while(!v.evaluarNombre(ape));
            
            do{
                ced=oe.pedirEntero("Ingrese el numero de cedula del administrador");
            }while(!v.evaluarIdPersona(idsPersonas, ced) && !v.evaluarCedula(ced));
            idsPersonas.add(ced);
            
            do{
                edad=oe.pedirEntero("Ingrese la edad del administrador");
            }while(!v.evaluarEdadC(edad));
            
            do{
                num=oe.pedirEntero("Ingrese el numero del administrador \n +57 3");
            }while(!v.evaluarTelefono(num));
            
            do{
                correo=oe.pedirString("Ingrese el correo del administrador");
            }while(!v.evaluarCorreo(correo));
            
            admin = new Administrador(ced,nom,ape,edad,correo,num);
            administrador.add(admin);
        }
    }
    
    public void crearMascota(){
        int id, edad, res;
        String nom,raza,esp;
        Date fLlegada;
        Mascota masc;
        res=oe.pedirEntero("Crear Administrador \n 1. Ingresar nuevo administrador \n Otro numero para salir");
        while(res==1){
            do{
                nom=oe.pedirString("Ingrese el nombre de la mascota");
            }while(!v.evaluarNombre(nom));
            
            do{
                esp=oe.pedirString("Ingrese el tipo de especie");
            }while(!v.evaluarNombre(esp));
            
            do{
                id=oe.pedirEntero("Ingrese el ID de la mascota");
            }while(!v.evaluarIdMascotas(idsPersonas, id) && !v.evaluarId(id));
            idsMascotas.add(id);
            
            do{
                edad=oe.pedirEntero("Ingrese la edad de la mascota");
            }while(!v.evaluarEdadM(edad));
            
            do{
                raza=oe.pedirString("Ingrese la raza de la mascota");
            }while(!v.evaluarNombre(raza));
            
            do{
                fLlegada=oe.pedirDate("Ingrese la fecha en la que ingresa la mascota a la fundacion");
            }while(!v.evaluarFecha(fLlegada));
            
            masc = new Mascota(nom, id, fLlegada,esp,raza,edad);
            mascotas.add(masc);
        }
        
    }
    
    public void crearAdoptante(){
        int ced, edad, num, res;
        String nom, ape, correo;
        double salario = 0;
        Adoptante adop;
        res=oe.pedirEntero("Crear Adoptante \n 1. Ingresar nuevo adoptante \n Otro numero para salir");
        while(res==1){
            do{
                nom=oe.pedirString("Ingrese el nombre del adoptante");
            }while(!v.evaluarNombre(nom));
            
            do{
                ape=oe.pedirString("Ingrese el apellido del adoptante");
            }while(!v.evaluarNombre(ape));
            
            do{
                ced=oe.pedirEntero("Ingrese el numero de cedula del adoptante");
            }while(!v.evaluarIdPersona(idsPersonas, ced) && !v.evaluarCedula(ced));
            idsPersonas.add(ced);
            
            do{
                edad=oe.pedirEntero("Ingrese la edad del adoptante");
            }while(!v.evaluarEdadC(edad));
            
            do{
                num=oe.pedirEntero("Ingrese el numero del adoptante \n +57 3");
            }while(!v.evaluarTelefono(num));
            
            do{
                correo=oe.pedirString("Ingrese el correo del adoptante");
            }while(!v.evaluarCorreo(correo));
            
            do{
                salario=oe.pedirEntero("Ingrese su salario actual");
            }while(!v.evaluarSalario(salario));
        
            adop = new Adoptante(ced,nom,ape,edad,correo,num,salario);
            adoptante.add(adop);
        }
    }
}
