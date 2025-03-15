package com.casa.practicaed_2a;

/**
 * CLASE NIF.
 * Clase que contiene los métodos necesarios para que los objetos NIF
 * funcionen correctamente.
 * @author Alberto Vicente
 */
public class Nif {
    // Atributos
    private int numero;
    private char letra;

    //CONSTANTE: no accesible - compartido por todo - no modificable
    private static final char[] LETRAS
            = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                'C', 'K', 'E'};
    
    /**
     * Constructor NIF por defecto.
     * Constructor que inicializa los valores por defecto de los atributos
     * de NIF.
     */
    protected Nif() {
        this.numero = 0;
        this.letra = ' ';
    }
    
    /**
     * Constructor NIF con int.
     * Constructor que inicializa el valor del atributo numero haciendo uso del
     * parámetro introducido y calcula la letra correspondiente haciendo uso del
     * método calcularLetra(numero).
     * @param numero: numero que se va a asignar al NIF.
     */
    protected Nif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }
    
    /**
     * calcularLetra.
     * Método que calsula la letra en base al número pasado.
     * @param numero: número del que se quiere calcular la letra.
     * @return un char con la letra correspondiente de la operación.
     */
    private static char calcularLetra(int numero) {
        return LETRAS[numero % 23];
    }

    /**
     * toString.
     * Método que devuelve el número con un guión y su letra correspondiente
     * en formato String.
     * @return lo dicho anteriormente.
     */
    @Override
    public String toString() {
        return numero + "-" + letra;
    }

    /**
     * setNif.
     * Método que permite sobreescribir los atributos de NIF.
     * @param numero: número con el que se pretende sobreescribir el NIF existente.
     */
    protected void setNif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    /**
     * equals.
     * Método que comprueba que el objeto al que se está comparando es también
     * de tipo Nif y devuelve true o false en base a si sus atributos se corresponden.
     * @param obj: objeto a comparar.
     * @return true si son iguales, false si no lo son.
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
        final Nif other = (Nif) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return this.letra == other.letra;
    }
}
