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
class Direccion {

    private String email, telf;

    public Direccion(String email, String telf) {

        boolean punto = false;
        int arroba = 0;
        boolean a = false;
        boolean b = false;

        while (a == false) {
            email = JOptionPane.showInputDialog("Introduce correo electronico");

            for (int i = 0; i < email.length(); i++) {

                if (email.charAt(i) == '@') {

                    arroba++;

                }

                if (email.charAt(i) == '.') {

                    punto = true;

                }
            }

            if (arroba == 1 && punto == true) {

                System.out.println("Email correcto ");

                this.email = email;

                a = true;

            } else {
                System.out.println("Correo electronico incorrecto");

            }

            arroba = 0;
            punto = false;
        }

        while (b == false) {

            telf = JOptionPane.showInputDialog("Introduce telefono");

            if (telf.length() == 9) {

                System.out.println("Telefono correcto ");
                this.telf = telf;

                b = true;

            } else {
                System.out.println("El telefono introducido es incorrecto");

            }

        }
    }

    public Direccion() {

        email = JOptionPane.showInputDialog("Introduce correo electronico");
        telf = JOptionPane.showInputDialog("Introduce telefono");
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

/*  
 boolean punto = false;
 int arroba = 0;
 boolean a = false;
 // boolean b = false;
        
        
 while (a == false) {

 // email = JOptionPane.showInputDialog("Introduce correo electronico");

 for (int i = 0; i < email.length(); i++) {

 if (email.charAt(i) == '@') {

 arroba++;

 }

 if (email.charAt(i) == '.') {

 punto = true;

 }
 }

 if (arroba == 1 && punto == true) {

 System.out.println("Correcto");

               

 a = true;

 } else {
 System.out.println("Correo electronico incorrecto");
 }

 arroba = 0;
 punto = false;
 }
 //  while (b == false) {

 // telf = JOptionPane.showInputDialog("Introduce telefono");

 if (telf.length() == 9) {

                
 //  b = true;
 } else {
 System.out.println("El telefono introducido es incorrecto");
 }

 //  }*/
