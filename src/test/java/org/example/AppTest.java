package org.example;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    private App calculadora;

    public void escenario() {
        calculadora = new App();
    }

    public void testSuma() {
        escenario();
        assertEquals(calculadora.suma(3, 7), 10);
    }
    public void testResta() {
        escenario();
        assertEquals(calculadora.resta(7, 3), 4);
    }
    public void testmultiplicacion() {
        escenario();
        assertEquals(calculadora.multiplicacion(3, 7), 21);
    }
    public void testDivision() {
        escenario();
        assertEquals(calculadora.division(3, 7), (3/7));
    }
}
