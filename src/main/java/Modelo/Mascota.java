package Modelo;

public class Mascota {
    private String nombre;
    private int id;
    private Date Fllegada; //arreglar el Date porque no se como se hace :D
    private String especie;
    private String raza;
    private int edad;
    
    public Mascota(String nombre,int id, Date Fllegada, String especie, String raza, int edad){
    this.nombre=nombre;
    this.id=id;
    this.Fllegada=Fllegada;
    this.especie=especie;
    this.raza=raza;
    this.edad=edad;
   
}
    public String getNombre(){
        return nombre;
    }
    public int getId(){
        return id;
    }
    public int getEdad(){
        return edad;
    }
    public String getEspecie(){
        return especie;
    }
    public String getRaza(){
        return raza;
    }
    public Date getFllegada(){
        return Fllegada;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setEspecie(String especie){
        this.especie=especie;
    }
    public void setRaza(String raza){
        this.raza=raza;
    }
    public void setFllegada(Date Fllegada){
        this.Fllegada=Fllegada;
    }
}
