/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto1.entidades;

import java.util.Objects;

public class Alumno {
    
    private String nombre;
    private int edad;
    private boolean alumnoDeSpring;
    
    // teclas alt + insert

    public Alumno() {
    }

    public Alumno(String nombre, int edad, boolean alumnoDeSpring) {
        this.nombre = nombre;
        this.edad = edad;
        this.alumnoDeSpring = alumnoDeSpring;
    }
    
    public Alumno(boolean alumnoDeSpring) {
        this.alumnoDeSpring = alumnoDeSpring;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isAlumnoDeSpring() {
        return alumnoDeSpring;
    }

    public void setAlumnoDeSpring(boolean alumnoDeSpring) {
        this.alumnoDeSpring = alumnoDeSpring;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + this.edad;
        hash = 59 * hash + (this.alumnoDeSpring ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (this.alumnoDeSpring != other.alumnoDeSpring) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre:" + nombre + ", edad=" + edad + ", alumnoDeSpring:" + alumnoDeSpring + '}';
    }

}
