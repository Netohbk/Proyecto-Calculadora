/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calculadora;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rmull
 */
public class PosfijoTest {
    
    public PosfijoTest() {
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
     * Test of pesoOp method, of class Posfijo.
     */
    @Test
    public void testPesoOp() {
        System.out.println("pesoOp");
        Character n = '+';
        Posfijo instance = new Posfijo();
        int expResult = 1;
        int result = instance.pesoOp(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadena method, of class Posfijo.
     */
    @Test
    public void testCadena() {
        System.out.println("cadena");
        String expresion = "4+5";
        Posfijo instance = new Posfijo();
        String expResult = "(4)(5)+";//Es un caso sencillo
        String result = instance.cadena(expresion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
