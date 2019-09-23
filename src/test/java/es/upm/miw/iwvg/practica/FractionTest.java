package es.upm.miw.iwvg.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(7, 5);
    }

    @Test
    void testFractionIntInt() {
        assertEquals(7, fraction.getNumerator());
        assertEquals(5, fraction.getDenominator());
    }

    @Test
    void testFraction() {
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(1.4, fraction.decimal());
    }

    @Test
    void testGetNumerator() {
        assertEquals(7, fraction.getNumerator());
    }

    @Test
    void testGetDenominator() {
        assertEquals(5, fraction.getDenominator());
    }


}
