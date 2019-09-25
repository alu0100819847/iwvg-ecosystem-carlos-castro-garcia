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

        System.out.println(this.getNumerator() +" , "+ fraction.getDenominator());
        System.out.println(this.getDenominator());
        System.out.println(fraction.getNumerator());
        System.out.println(this.getDenominator() * fraction.getNumerator());
        if((this.getNumerator() * fraction.getDenominator()) == (this.getDenominator() * fraction.getNumerator())){
            return true;
        }
        return false;
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
