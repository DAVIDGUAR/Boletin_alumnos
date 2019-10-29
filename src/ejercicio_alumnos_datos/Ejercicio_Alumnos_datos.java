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
public class Ejercicio_Alumnos_datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       //Alumnos alumno2 = new Alumnos("david","asir",new Direccion("", ""));
        Alumnos alumno1 = new Alumnos(JOptionPane.showInputDialog("Introduce nombre empleado"),(JOptionPane.showInputDialog("Introduce nombre curso")),new Direccion());
       // Direccion dir1 = new Direccion("VFV","FG0001FD");
     System.out.println(alumno1.toString());
       //System.out.println(alumno2.toString());
       // Alumnos alumno2 = new Alumnos("ANTONIO", "ASIR", new Direccion());
      //  alumno1.setDireccion(new Direccion("dgfag","654321987"));
       // System.out.println(alumno1.toString());
       // alumno1.setDireccion(dir1);
       // System.out.println(alumno1.toString());
       // System.out.println(alumno1.getDireccion());
    }
    
    
    
    
    
}
