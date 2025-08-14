package vallegrande.edu.pe.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    private Calculadora cal;

    @BeforeEach
    void setup() {
        System.out.println("\n===== Iniciando prueba =====");
        cal = new Calculadora();
    }

	

    @Test
    void testSumar() {
        System.out.println("Probando sumar: 5 + 3 = 8");
        assertEquals(8, cal.sumar(5, 3));
    }

    // === AQUÍ SE HIZO PARA RESTAR TEST - Probar con valores positivos ===
    @Test
    void testRestarPositivos() {
        System.out.println("Probando restar: 10 - 4 = 6");
        assertEquals(6, cal.restar(10, 4));
    }

    // === AQUÍ SE HIZO PARA RESTAR TEST - Probar con valores negativos ===
    @Test
    void testRestarNegativos() {
        System.out.println("Probando restar: -5 - (-3) = -2");
        assertEquals(-2, cal.restar(-5, -3));
    }

    // === AQUÍ SE HIZO PARA MULTIPLICACIÓN TEST - Probar con números positivos ===
    @Test
    void testMultiplicarPositivos() {
        System.out.println("Probando multiplicar: 4 * 3 = 12");
        assertEquals(12, cal.multiplicar(4, 3));
    }

    // === AQUÍ SE HIZO PARA MULTIPLICACIÓN TEST - Probar con cero ===
    @Test
    void testMultiplicarConCero() {
        System.out.println("Probando multiplicar: 4 * 0 = 0");
        assertEquals(0, cal.multiplicar(4, 0));
    }

    // === AQUÍ SE HIZO PARA MULTIPLICACIÓN TEST - Probar con números negativos ===
    @Test
    void testMultiplicarNegativos() {
        System.out.println("Probando multiplicar: -2 * 3 = -6");
        assertEquals(-6, cal.multiplicar(-2, 3));
    }

    @Test
    void testDividirNormal() {
        System.out.println("Probando dividir: 10 / 2 = 5");
        assertEquals(5, cal.dividir(10, 2));
    }

    @Test
    void testDividirPorCero() {
        System.out.println("Probando dividir entre cero → excepción esperada");
        assertThrows(ArithmeticException.class, () -> cal.dividir(10, 0));
    }

    // === AQUÍ SE HIZO PARA PORCENTAJE TEST - Probar caso normal ===
    @Test
    void testPorcentajeNormal() {
        System.out.println("Probando porcentaje: 25 de 200 = 12.5%");
        assertEquals(12.5, cal.porcentaje(25, 200));
    }

    // === AQUÍ SE HIZO PARA PORCENTAJE TEST - Probar excepción con total = 0 ===
    @Test
    void testPorcentajeDivisionPorCero() {
        System.out.println("Probando porcentaje con total = 0 → excepción esperada");
        assertThrows(ArithmeticException.class, () -> cal.porcentaje(10, 0));
    }

    // === AQUÍ SE HIZO PARA RAÍZ CUADRADA TEST (EXTRA CHALLENGE) - Probar caso positivo ===
    @Test
    void testRaizCuadradaPositivo() {
        System.out.println("Probando raíz cuadrada de 16 = 4");
        assertEquals(4, cal.raizCuadrada(16));
    }

    // === AQUÍ SE HIZO PARA RAÍZ CUADRADA TEST (EXTRA CHALLENGE) - Probar excepción con número negativo ===
    @Test
    void testRaizCuadradaNegativo() {
        System.out.println("Probando raíz cuadrada negativa → excepción esperada");
        assertThrows(IllegalArgumentException.class, () -> cal.raizCuadrada(-9));
    }

}
