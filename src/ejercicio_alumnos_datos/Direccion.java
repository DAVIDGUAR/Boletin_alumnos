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
class Direccion {
    
   private String email,telf;
   
    public Direccion(String email, String telf) {
        this.email = email;
        this.telf = telf;
        
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    @Override
    public String toString() {
        return "Direccion{" + "email=" + email + ", telf=" + telf + '}';
    }
    
    
    
}
