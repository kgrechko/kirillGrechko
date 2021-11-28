package com.hillel.hw7;

public class Card {
    private String suite;
    private String value;

    public Card (String suite, String value)
    {
        this.suite = suite;
        this.value = value;
    }

    public String getSuit() {
        return suite;
    }

    public String getNum() {
        return value;
    }

    public void setSuit(String suit) {
        this.suite = suite;
    }

    public void setNum(String num) {
        this.value = value;
    }

    public String toString()
    {
       return this.value+" of "+this.suite;
    }
}

