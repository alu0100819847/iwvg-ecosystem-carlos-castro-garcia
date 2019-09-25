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

    @Test
    void testIsPropia() {
        assertEquals(false, fraction.isPropia());
        Fraction fraction = new Fraction(5, 7);
        assertEquals(true, fraction.isPropia());
    }

    @Test
    void testIsImpropia() {
        assertEquals(true, fraction.isImpropia());
        Fraction fraction = new Fraction(5, 7);
        assertEquals(false, fraction.isImpropia());
    }

    @Test
    void testIsEquivalent() {
        assertEquals(true, fraction.isEquivalent(new Fraction(14, 10)));
    }
    @Test
    void testSum() {
        Fraction fraction = this.fraction.sum(new Fraction(3, 5));
        assertEquals(true, fraction.isEquivalent(new Fraction(10, 5)) );

        fraction = this.fraction.sum(new Fraction(6, 10));
        assertEquals(true, fraction.isEquivalent(new Fraction(10, 5)) );

    }


}
