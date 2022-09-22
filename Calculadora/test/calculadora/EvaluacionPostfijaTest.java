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
public class EvaluacionPostfijaTest {
    
    public EvaluacionPostfijaTest() {
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
     * Test of evaluaPost method, of class EvaluacionPostfija.
     */
    @Test
    public void testEvaluaPost() {
        System.out.println("evaluaPost");
        String cadena = "";
        EvaluacionPostfija instance = new EvaluacionPostfija();
        double expResult = 0.0;
        double result = instance.evaluaPost(cadena);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of operador method, of class EvaluacionPostfija.
     */
    @Test
    public void testOperador() {
        System.out.println("operador");
        char cadena = ' ';
        EvaluacionPostfija instance = new EvaluacionPostfija();
        boolean expResult = false;
        boolean result = instance.operador(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parentesis method, of class EvaluacionPostfija.
     */
    @Test
    public void testParentesis() {
        System.out.println("parentesis");
        char cadena = ' ';
        EvaluacionPostfija instance = new EvaluacionPostfija();
        boolean expResult = false;
        boolean result = instance.parentesis(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
