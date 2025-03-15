package com.casa.practicaed_2a;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 * CLASE PERSONA.
 * Clase que contiene los métodos necesarios para que los objetos Persona
 * funcionen correctamente.
 * @author Alberto Vicente
 */
public class Persona implements Comparable<Persona> {
    // Atributos
    private Nif nif;
    private String nombre;
    private char genero;
    private LocalDate nacimiento;

    /**
     * Constructor Persona por defecto.
     * Constructor que inicializa los atributos de persona a sus valores por defecto.
     */
    public Persona() {
        nif = new Nif();
        nombre = "";
        genero = ' ';
        nacimiento = LocalDate.of(1990, 1, 1);
    }

    /**
     * Constructor Persona con nif.
     * Constructor que inicializa el valor de nif con el int pasado haciendo uso
     * del constructor propio de la clase Nif y los demás valores por defeto.
     * @param nif: valor numérico usado para inicializar el objeto de la clase Nif.
     */
    public Persona(int nif) {
        this();
        this.nif = new Nif(nif);
    }

    /**
     * Constructor completo Persona.
     * Constructor al que se le pasan los valores de todos los atributos de la
     * clase Persona.
     * @param nif: valor numérico para el constructor de nif.
     * @param nombre: String que va a ocupar el atributo nombre.
     * @param genero: String que va a ocupar el atributo genero.
     * @param dia: valor empleado para utilizar LocalDate.of() en conjunto con mes
     *             y ano.
     * @param mes: valor empleado para utilizar LocalDate.of() en conjunto con dia
     *             y ano.
     * @param ano: valor empleado para utilizar LocalDate.of() en conjunto con dia
     *             y mes.
     */
    public Persona(int nif, String nombre, char genero,
            int dia, int mes, int ano) {
        this.nif = new Nif(nif);
        this.nombre = nombre;
        this.genero = genero;
        this.nacimiento = LocalDate.of(ano, mes, dia);
    }

    /**
     * getNif.
     * Método que devuelve el valor del atributo Objeto nif.
     * @return lo dicho anteriormente.
     */
    public Nif getNif() {
        return nif;
    }

    /**
     * setNif.
     * Método que cambia el valor del atributo nif a partir del introducido.
     * @param nif: nuevo nif que va a sobreescribir al antiguo.
     */
    public void setNif(Nif nif) {
        this.nif = nif;
    }

    /**
     * getNombre.
     * Método que devuelve el valor del atributo nombre.
     * @return lo dicho anteriormente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setNombre.
     * Método que sobreescribe el valor del atributo nombre.
     * @param nombre: nuevo valor del atributo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * getGenero.
     * Método que devuelve el valor del atributo genero.
     * @return lo dicho anteriormente.
     */
    public char getGenero() {
        return genero;
    }

    /**
     * setGenero.
     * Método que sobreescribe el valor del atributo genero.
     * @param genero: nuevo valor del atributo genero.
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * getNacimiento.
     * Método que devuelve el valor del atributo LocalDate nacimiento.
     * @return lo dicho anteriormente.
     */
    public LocalDate getNacimiento() {
        return nacimiento;
    }

    /**
     * setNacimiento.
     * Método que sobreescribe el atributo Objeto nacimiento con uno nuevo del
     * mismo tipo.
     * @param nacimiento: nuevo Objeto que sustituye al atributo anterior.
     */
    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    /**
     * getEdad.
     * Método que devuelve el valor del atributo edad.
     * @return lo dicho anteriormente.
     */
    public int getEdad() {
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    /**
     * toString.
     * Método que devuelve el nif, el nombre, el apellido si lo tiene y la edad
     * en formato tabulado.
     * @return lo dicho anteriormente en formato String.
     */
    @Override
    public String toString() {
        if (nombre.split(" ").length > 1) {
            return nif + "\t" + nombre.split(" ")[0]
                    + '\t' + nombre.split(" ")[1] + "\t\t" + getEdad();
        } else {
            return nif + "\t" + nombre + "\t\t\t" + getEdad();
        }
    }

    /**
     * equals Persona-Persona.
     * Método que compara dos Objetos de la clase Persona si el que se pasa no es 
     * nulo.
     * @param a: Objeto a comparar.
     * @return true si son iguales, false si son distintos.
     */
    public boolean equals(Persona a) {
        if (a == null) {
            return false;
        }
        return a.nif.toString().equals(this.nif.toString());
    }

    /**
     * equals Persona-Objeto.
     * Método que comprueba si el Objeto pasado es de la clase Persona y si es el
     * caso, realiza la comparación entre ambos.
     * @param obj: Objeto a comparar.
     * @return true si son iguales, false si son distintos.
     */
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
        final Persona other = (Persona) obj;

        return Objects.equals(this.nif, other.nif);
    }

    /**
     * compareTo.
     * Método que compara dos Objeto de la clase Persona y devuelve el resultado
     * como un int.
     * @param o: Objeto a comparar.
     * @return 1 si el Objeto pasado es mayor léxicamente, 0 si son iguales y -1
     *         si el Objeto pasado es menor léxicamente.
     */
    @Override
    public int compareTo(Persona o) {
        return this.nif.toString().compareTo(o.nif.toString());
    }
}
