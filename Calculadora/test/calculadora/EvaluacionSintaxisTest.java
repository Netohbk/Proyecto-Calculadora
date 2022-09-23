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
        String formula1 = "(16)+5*8^2-4/7";//Expresión únicamente con caracteres aceptados
        String formula2 = "18-8+m+6/4";//Agrego una letra para que marque false
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
        String formula1 = "(4+(5*3(4/2)^2))";//Expresión con parentesis bien
        String formula2 = ")4+(5*3(4/2)^2))";//Expresión con un parentesis erroneo
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
        char c1 = '5';//Prueba con un numero
        char c2 = '-';//Proeba con un operador
        EvaluacionSintaxis instance = new EvaluacionSintaxis();
        boolean expResult1 = true;
        boolean expResult2 = false;
        boolean result1 = instance.esNumero(c1);
        boolean result2 = instance.esNumero(c2);
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
       
    }

    /**
     * Test of esOperador method, of class EvaluacionSintaxis.
     */
    @Test
    public void testEsOperador() {
        System.out.println("esOperador");
        char c1 = '/';//Prueba con un operador
        char c2 = '9';//Prueba con un numero
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
        char c1 = '/';//Prueba con un operador cualquiera
        char c2 = '-';//Prueba con un menos
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
        String formula1 = "4+8/6*24";//Prueba con operadores separados
        String formula2 = "166/19*/7";//Prueba con operadores juntos
        EvaluacionSintaxis instance = new EvaluacionSintaxis();
        boolean expResult1 = true;
        boolean expResult2 = false;
        boolean result1 = instance.noDobleOperador(formula1);
        boolean result2 = instance.noDobleOperador(formula2);
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        
    }

    /**
     * Test of noDobleDecimal method, of class EvaluacionSintaxis.
     */
    @Test
    public void testNoDobleDecimal() {
        System.out.println("noDobleDecimal");
        String formula1 = "47.57+23.86";//Prueba con decimales bien
        String formula2 = "96.46/3.3.3";//Prueba con doble decimal
        EvaluacionSintaxis instance = new EvaluacionSintaxis();
        boolean expResult1 = true;
        boolean expResult2 = false;
        boolean result1 = instance.noDobleDecimal(formula1);
        boolean result2 = instance.noDobleDecimal(formula2);
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
    }

    /**
     * Test of noOperadorAntesDeParentesis method, of class EvaluacionSintaxis.
     */
    @Test
    public void testNoOperadorAntesDeParentesis() {
        System.out.println("noOperadorAntesDeParentesis");
        String formula = "(4+(5*3(4/2)^2))";
        EvaluacionSintaxis instance = new EvaluacionSintaxis();
        boolean expResult1 = false;
        boolean expResult2 = false; 
        boolean result1 = instance.noOperadorAntesDeParentesis(formula);
        boolean result2 = instance.noOperadorAntesDeParentesis(formula);
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
      
    }

    /**
     * Test of expresionValida method, of class EvaluacionSintaxis.
     */
    @Test
    public void testExpresionValida() {
        System.out.println("expresionValida");
        String formula1 = "85*66-(47*85)+(48/24)^4+43";
        String formula2 = "85*66..64-(47*85)++((48m/24)";
        EvaluacionSintaxis instance = new EvaluacionSintaxis();
        boolean expResult1 = true;
        boolean expResult2 = false;
        boolean result1 = instance.expresionValida(formula1);
        boolean result2 = instance.expresionValida(formula2);
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        
    }
    
}
