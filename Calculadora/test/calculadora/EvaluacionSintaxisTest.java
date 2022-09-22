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
public class EvaluacionSintaxisTest {
    
    public EvaluacionSintaxisTest() {
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
     * Test of noCaracteresNoAceptados method, of class EvaluacionSintaxis.
     */
    @Test
    public void testNoCaracteresNoAceptados() {
        System.out.println("noCaracteresNoAceptados");
        String formula1 = "(16)+5*8^2-4/7";
        String formula2 = "18-8+m+6/4";
        EvaluacionSintaxis instance = new EvaluacionSintaxis();
        boolean expResult1 = true;
        boolean expResult2 = false;
        boolean result1 = instance.noCaracteresNoAceptados(formula1);
        boolean result2 = instance.noCaracteresNoAceptados(formula2);
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        
    }

    /**
     * Test of parentesisBalanceados method, of class EvaluacionSintaxis.
     */
    @Test
    public void testParentesisBalanceados() {
        System.out.println("parentesisBalanceados");
        String formula1 = "(4+(5*3(4/2)^2))";
        String formula2 = "(4+(5*3(4/2)^2))";
        EvaluacionSintaxis instance = new EvaluacionSintaxis();
        boolean expResult1 = true;
        boolean expResult2 = false;
        boolean result1 = instance.parentesisBalanceados(formula1);
        boolean result2 = instance.parentesisBalanceados(formula2);
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
       
    }

    /**
     * Test of esNumero method, of class EvaluacionSintaxis.
     */
    @Test
    public void testEsNumero() {
        System.out.println("esNumero");
        char c1 = '5';
        char c2 = '-';
        EvaluacionSintaxis instance = new EvaluacionSintaxis();
        boolean expResult1 = true;
        boolean expResult2 = false;
        boolean result1 = instance.esNumero(c1);
        boolean result2 = instance.esNumero(c2);
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esOperador method, of class EvaluacionSintaxis.
     */
    @Test
    public void testEsOperador() {
        System.out.println("esOperador");
        char c1 = '/';
        char c2 = '9';
        EvaluacionSintaxis instance = new EvaluacionSintaxis();
        boolean expResult1 = true;
        boolean expResult2= false;
        boolean result1 = instance.esOperador(c1);
        boolean result2 = instance.esOperador(c2);
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        
    }

    /**
     * Test of esOperadorSinMenos method, of class EvaluacionSintaxis.
     */
    @Test
    public void testEsOperadorSinMenos() {
        System.out.println("esOperadorSinMenos");
        char c1 = '/';
        char c2 = '-';
        EvaluacionSintaxis instance = new EvaluacionSintaxis();
        boolean expResult1 = true;
        boolean expResult2 = false;
        boolean result1 = instance.esOperadorSinMenos(c1);
        boolean result2 = instance.esOperadorSinMenos(c2);
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        
    }

    /**
     * Test of noDobleOperador method, of class EvaluacionSintaxis.
     */
    @Test
    public void testNoDobleOperador() {
        System.out.println("noDobleOperador");
        String formula = "";
        EvaluacionSintaxis instance = new EvaluacionSintaxis();
        boolean expResult = false;
        boolean result = instance.noDobleOperador(formula);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of noDobleDecimal method, of class EvaluacionSintaxis.
     */
    @Test
    public void testNoDobleDecimal() {
        System.out.println("noDobleDecimal");
        String formula = "";
        EvaluacionSintaxis instance = new EvaluacionSintaxis();
        boolean expResult = false;
        boolean result = instance.noDobleDecimal(formula);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of noOperadorAntesDeParentesis method, of class EvaluacionSintaxis.
     */
    @Test
    public void testNoOperadorAntesDeParentesis() {
        System.out.println("noOperadorAntesDeParentesis");
        String formula = "";
        EvaluacionSintaxis instance = new EvaluacionSintaxis();
        boolean expResult = false;
        boolean expResult2 = false; 
        boolean expResult3 = false;
        boolean result = instance.noOperadorAntesDeParentesis(formula);
        boolean result2 = instance.noOperadorAntesDeParentesis(formula);
        boolean result3 = instance.noOperadorAntesDeParentesis(formula);
        assertEquals(expResult, result);
        assertEquals(expResult2, result2);
      
    }

    /**
     * Test of expresionValida method, of class EvaluacionSintaxis.
     */
    @Test
    public void testExpresionValida() {
        System.out.println("expresionValida");
        String formula = "";
        EvaluacionSintaxis instance = new EvaluacionSintaxis();
        boolean expResult = false;
        boolean result = instance.expresionValida(formula);
        assertEquals(expResult, result);
        
    }
    
}
