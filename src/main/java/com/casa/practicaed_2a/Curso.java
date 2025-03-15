package com.casa.practicaed_2a;

import java.util.TreeSet;

/**
 * CLASE CURSO.
 * Clase que contiene los métodos necesarios para que los objetos Clase
 * funcionen correctamente.
 * @author Alberto Vicente
 */
public class Curso {
    // Atributos
    private String nombre;
    private TreeSet<Persona> listaAlumnos;

    /**
     * Constructor Curso.
     * Costructor de la clase curso que inicializa los valores de sus atributos.
     * @param nombre: valor que se le quiere asignar al atributo nombre.
     */
    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }
    
    /**
     * getNombre.
     * Método que devuelve el valor del atributo nombre.
     * @return el valor del atributo nombre.
     */
    protected String getNombre() {
        return nombre;
    }
    
    /**
     * toString.
     * Método que devuelve el conjunto de valores que componen al atributo 
     * listaAlumnos en formato tabulado haciendo uso del método propio de la clase 
     * Persona toString().
     * @return un String que contiene los datos de todos los elementos del TreeSet
     *         listaAlumnos.
     */
    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }

    /**
     * aniadirAlumno.
     * Método que permite añadir nuevos alumnos a listaAlumnos.
     * @param p: alumno a introducir en la lista.
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }
}
