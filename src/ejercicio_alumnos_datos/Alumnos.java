/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_alumnos_datos;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Alumnos {

    private String nombre, curso;
    private Direccion direccion = new Direccion();

    public Alumnos(String nombre, String curso, Direccion dato) {
        this.nombre = nombre;
        this.curso = curso;
        this.direccion = dato;

    }

    public Alumnos() {
    }
    
    
    

   /* public Direccion getDireccion() {
        return direccion;
    }*/

 /*   public void setDireccion(Direccion direccion) {
        this.direccion = direccion;

    }*/

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

    /* @Override
     public String toString() {
     return "Alumnos{" + "nombre= " + nombre + ", curso= " + curso + ", direccion electronica= " + direccion.getEmail() +", telefono= "+ direccion.getTelf()+ '}';
     }*/
    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", curso=" + curso + ", direccion=" + direccion.toString() + '}';
    }

}
