/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto1.servicios;

import java.util.Scanner;
import proyecto1.entidades.Alumno;

public class AlumnoServicio {
    
    public Alumno crearAlumno(boolean esAlumnoSpring) {
        
        Alumno alumno = new Alumno(esAlumnoSpring);
        
        Scanner leer = new Scanner(System.in);
        
        // sout + Tab
        System.out.println("Ingrese su nombre");
        // ctrl + espacio para ver métodos o autocompletar
        String nombre = leer.next();
        
        System.out.println("Ingrese edad");
        int edad = leer.nextInt();
        
        alumno.setNombre(nombre);
        alumno.setEdad(edad);
        
        return alumno;
        
    }
    
    public void informacionSobreCurso(Alumno alumno) {
        
        if(alumno.isAlumnoDeSpring()) {
            System.out.println("Felicitaciones, estás inscripto correctamente");
        } else {
            System.out.println("Inscribite, todavia tenes tiempo");
        }
        
    }

}
