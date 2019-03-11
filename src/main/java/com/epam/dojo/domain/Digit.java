package com.epam.dojo.domain;

import java.util.HashMap;
import java.util.Map;

public class Digit {
    final String firstRow;
    final String secondRow;
    final String thirdRow;

    private static final int CHARACTER_WIDTH = 3;

    private Digit(String firstRow, String secondRow, String thirdRow) {
        assert(firstRow.length() == CHARACTER_WIDTH);
        assert(secondRow.length() == CHARACTER_WIDTH);
        assert(thirdRow.length() == CHARACTER_WIDTH);
        this.firstRow = firstRow;
        this.secondRow = secondRow;
        this.thirdRow = thirdRow;
    }

    public boolean equalsWithLine(String line) {
        return (firstRow + secondRow + thirdRow).equals(line);
    }

    public static final Digit ZERO = new Digit(" _ ", "| |", "|_|");
    public static final Digit ONE = new Digit("   ", "  |", "  |");
    public static final Digit TWO = new Digit(" _ ", " _|", "|_ ");
    public static final Digit THREE = new Digit(" _ ", " _|", " _|");
    public static final Digit FOUR = new Digit("   ", "|_|", "  |");
    public static final Digit FIVE = new Digit(" _ ", "|_ ", " _|");
    public static final Digit SIX = new Digit(" _ ", "|_ ", "|_|");
    public static final Digit SEVEN = new Digit(" _ ", "  |", "  |");
    public static final Digit EIGHT = new Digit(" _ ", "|_|", "|_|");
    public static final Digit NINE = new Digit(" _ ", "|_|", " _|");

    public static final Map<Integer, Digit> DIGITS = new HashMap<>();
    static {

        DIGITS.put(0, ZERO);
        DIGITS.put(1, ONE);
        DIGITS.put(2, TWO);
        DIGITS.put(3, THREE);
        DIGITS.put(4, FOUR);
        DIGITS.put(5, FIVE);
        DIGITS.put(6, SIX);
        DIGITS.put(7, SEVEN);
        DIGITS.put(8, EIGHT);
        DIGITS.put(9, NINE);

    }

}
