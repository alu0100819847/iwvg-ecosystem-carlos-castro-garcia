package es.upm.miw.iwvg.practica;

public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public boolean isPropia() {
        if (this.numerator < this.denominator) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isImpropia(){
        if(this.numerator > this.denominator){
            return true;
        } else {
            return false;
        }
    }

    public boolean isEquivalent(Fraction fraction){
        if((this.getNumerator() * fraction.getDenominator()) == (this.getNumerator() * fraction.getDenominator())){
            return true;
        } else {
            return false;
        }
    }
    public Fraction sum(Fraction fraction){
        if(this.denominator == fraction.getDenominator()){
            return new Fraction(this.numerator + fraction.getNumerator(), this.denominator);
        }
        int numeratorThis = this.numerator * fraction.getDenominator();
        int numeratorFraction = fraction.numerator * this.getDenominator();
        int denominator = this.denominator * fraction.getDenominator();
        return new Fraction(numeratorThis + numeratorFraction, denominator);
    }
}
