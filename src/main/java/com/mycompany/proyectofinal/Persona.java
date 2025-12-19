
package com.mycompany.proyectofinal;


public abstract class Persona {
    private String Nombre;
    private int Documento;
    private int Edad;

    public Persona(String Nombre,int Documento,int Edad){
        this.Nombre=Nombre;
        this.Documento=Documento;
        this.Edad=Edad;       
    }
    public String getNombre(){
        return Nombre;
    }
    public int getDocumento() {
        return Documento;
    }
    public int getEdad() {
        return Edad;
    }
    public abstract void mostrarInfo(); 
}
    

