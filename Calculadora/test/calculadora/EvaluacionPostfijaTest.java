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
 * @author Ernesto Palma
 */
public class EvaluacionPostfijaTest {
    
    /**
     * Constructor por omisión
     */
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
        String cadena = "56*89/74-(89+58)-85+(56-85)"; //expresion larga y con diferentes jerarquias
        String cadena2="(7)+(5)*(4)/(6)"; // valuacion de varios parentesis
        EvaluacionPostfija instance = new EvaluacionPostfija();
        double expResult = -193.6486;
        double expResult2 = 10.3332;
        double result = instance.evaluaPost(cadena);
        double result2 = instance.evaluaPost(cadena2);
        assertEquals(expResult, result, 0.2);
        assertEquals(expResult2, result2, 0.0);
    }

    /**
     * Test of operador method, of class EvaluacionPostfija.
     */
    @Test
    public void testOperador() {
        System.out.println("operador");
        char cadena = '{';
        char cadena2 = '^';
        EvaluacionPostfija instance = new EvaluacionPostfija();
        boolean expResult = false; //caso falso
        boolean expResult2 = true; // caso verdadero
        boolean result = instance.operador(cadena);
        boolean result2 = instance.operador(cadena2);
        assertEquals(expResult, result);
        assertEquals(expResult2, result2);
    }

    /**
     * Test of parentesis method, of class EvaluacionPostfija.
     */
    @Test
    public void testParentesis() {
        System.out.println("parentesis");
        char cadena = '4';
        char cadena2 = '(';
        EvaluacionPostfija instance = new EvaluacionPostfija();
        boolean expResult = false; //caso falso
        boolean expResult2 = true; // caso verdadero
        boolean result = instance.parentesis(cadena);
        boolean result2 = instance.parentesis(cadena2);
        assertEquals(expResult, result);
        assertEquals(expResult2, result2);
    }
    
}    

