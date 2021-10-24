package com.company;

public class Coin implements Comparable  {

    private final double value;
    private final String currency;

    public Coin(double value, String currency) {
        this.value = value;
        this.currency = currency;
    }


    public double getValue() {
        return value;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public boolean equals(Object obj) {
        final Coin other = (Coin) obj;
        if (this.value != other.value || this.currency != other.currency) {
            System.out.println(false);
        }
        if (this.value == other.value && this.currency == other.currency) {
            System.out.println(true);
        }

        return true;

    }

    @Override
    public String toString() {

        return "Coin { " +
                "value -> " + value +
                ", currency -> '" + currency + '\'' +
                '}';


    }

    @Override
    public int compareTo(Object o) {
        Coin other = (Coin) o;
        if (this.value < other.value) {
            return -1;
        }
        if (this.value > other.value) {
            return 1;
        }
        return 0;
    }
}
