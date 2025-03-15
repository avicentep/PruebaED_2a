/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.casa.practicaed_2a;

import java.time.LocalDate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alber
 */
public class PersonaTest {
    
    public PersonaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getNombre method, of class Persona.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGenero method, of class Persona.
     */
    @Test
    public void testGetGenero() {
        System.out.println("getGenero");
        Persona instance = new Persona();
        char expResult = ' ';
        char result = instance.getGenero();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNacimiento method, of class Persona.
     */
    @Test
    public void testGetNacimiento() {
        System.out.println("getNacimiento");
        Persona instance = new Persona();
        LocalDate expResult = LocalDate.of(1990, 1, 1);
        LocalDate result = instance.getNacimiento();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Persona.
     */
    @Test
    public void testEquals_Persona() {
        System.out.println("equals");
        Persona a = null;
        Persona instance = new Persona();
        boolean expResult = false;
        boolean result = instance.equals(a);
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Persona.
     */
    @Test
    public void testEquals_Object() {
        System.out.println("equals");
        Object obj = null;
        Persona instance = new Persona();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }    
}
