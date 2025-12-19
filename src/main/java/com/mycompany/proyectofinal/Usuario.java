
package com.mycompany.proyectofinal;


public class Usuario extends Persona {
    private int Codigo;
    private String Estado;

    public Usuario(String Nombre,int Documento,int Edad,int Codigo){
        super(Nombre, Documento, Edad);
        this.Codigo=Codigo;              
    }
 
    public int getCodigo() {
        return Codigo;
    }
    public String getEstado() {
        return Estado;
    }

    @Override
    public void mostrarInfo() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}

    

