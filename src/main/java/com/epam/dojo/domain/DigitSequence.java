package com.epam.dojo.domain;

import java.util.ArrayList;
import java.util.List;

public class DigitSequence {

    private List<Digit> digitList = new ArrayList<Digit>();

    public void addDigit(Digit digit) {
        this.digitList.add(digit);
    }

    public String getDisplayValue(){
        StringBuilder firstRow = new StringBuilder();
        StringBuilder secondRow = new StringBuilder();
        StringBuilder thirdRow = new StringBuilder();

        for (Digit d: digitList) {
          firstRow.append(getDigitRow(d.firstRow));
          secondRow.append(getDigitRow(d.secondRow));
          thirdRow.append(getDigitRow(d.thirdRow));
        }

        return String.valueOf(firstRow) + "\n" + secondRow + "\n" + thirdRow;
    }

    private StringBuilder getDigitRow(String digitRow) {
        return new StringBuilder(digitRow);
    }
}
