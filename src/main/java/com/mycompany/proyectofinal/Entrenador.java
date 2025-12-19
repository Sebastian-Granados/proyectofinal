
package com.mycompany.proyectofinal;

import java.util.ArrayList;

public class Entrenador extends Persona implements Empleado {
    private String Especialidad;
    private ArrayList<Usuario> ListaUsuarios;
    private double Salario;

    public Entrenador(String Nombre, int Documento, int Edad, double Salario,String Especialidad){
        super(Nombre, Documento, Edad);
        this.Salario=Salario;
        this.Especialidad=Especialidad;
        this.ListaUsuarios=new ArrayList<>();
        
    }
    
    public double getSalario(){
        return Salario;
    }
    public ArrayList<Usuario> getListaUsuarios() {
        return ListaUsuarios;
    }
    public void asignarUsuario(Usuario u){
        ListaUsuarios.add(u);       
    }
   

    public double calcularBonificacion(){
         if(Especialidad.equalsIgnoreCase("hipertrofia") || Especialidad.equalsIgnoreCase("resistencia") || Especialidad.equalsIgnoreCase("culturismo")){
          return 0.5 * Salario;
         }
         else{
             return 0;
         }
    }

    public double calcularSalario(){
        return Salario + calcularBonificacion(); 

    }    

    @Override
    public void mostrarInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double CalcularSalario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

    
    

