/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import proyecto1.entidades.Alumno;
import proyecto1.servicios.AlumnoServicio;

/**
 *
 * @author Usuario
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AlumnoServicio alumserv = new AlumnoServicio();
        
        Alumno alumno = alumserv.crearAlumno(true);
        alumserv.informacionSobreCurso(alumno);
        
        Alumno alumno2 = alumserv.crearAlumno(false);
        alumserv.informacionSobreCurso(alumno2);
        
        // ctrl + F6
        
    }
    
}
