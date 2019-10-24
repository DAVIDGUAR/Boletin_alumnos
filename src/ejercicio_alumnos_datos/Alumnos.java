/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_alumnos_datos;

/**
 *
 * @author david
 */
public class Alumnos {
    
  private  String nombre,curso;
   

    public Alumnos(String nombre, String curso,String email,String telf ) {
        this.nombre = nombre;
        this.curso = curso;
      Direccion datos = new Direccion(email, telf);
       
       
    }

 

    public Alumnos() {
    }
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", curso=" + curso + '}';
    }

  
    }
    
    
    
    
    
    
    
    

