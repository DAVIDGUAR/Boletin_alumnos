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
public class Ejercicio_Alumnos_datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Alumnos alumno1 = new Alumnos("daVID","SFD","SDGF","DSG");
        
        alumno1.getCurso();
      alumno1.setCurso("jgsdKJF");
        
        System.out.println("" +  alumno1.getCurso());
        
        
        System.out.println(""+alumno1.toString());
        
        
    }
    
    
    
    
    
}