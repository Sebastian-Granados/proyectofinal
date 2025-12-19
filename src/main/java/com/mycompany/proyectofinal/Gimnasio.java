
package com.mycompany.proyectofinal;

import java.util.ArrayList;

public class Gimnasio {
    private String NombreGym;
    private ArrayList<Usuario> UsuariosGym;
    private ArrayList<Entrenador> EntrenadoresGym;
    
    
    public Gimnasio(String NombreGym){
        this.NombreGym=NombreGym;
        this.UsuariosGym=new ArrayList<>();
        this.EntrenadoresGym= new ArrayList<>(); 
    }

    public ArrayList<Usuario> getUsuariosGym(){
      return UsuariosGym;
    }

    public ArrayList<Entrenador> getEntrenadoresGym(){
        return EntrenadoresGym;
    }
    
    public  Usuario registrarUsuario(String Nombre,int Documento,int Edad,int Codigo){
        Usuario nuevoUsuario= new Usuario(Nombre, Documento, Edad,Codigo);
        UsuariosGym.add(nuevoUsuario);
        return nuevoUsuario;
    }
    public Entrenador registrarEntrenador(String Nombre,int Documento,int Edad,double Salario,String Especialidad){
        Entrenador nuevoEntrenador= new Entrenador(Nombre,Documento,Edad,Salario,Especialidad);
        EntrenadoresGym.add(nuevoEntrenador);
        return nuevoEntrenador;           
    }




}
    

