package com.epam.dojo.services;

import com.epam.dojo.domain.Digit;

import java.util.List;

public class BankOcrServiceImpl implements BankOcrService {

    @Override
    public String readDigits(List<String> inputLines) {
        assert (inputLines.size() == 3);
        int inputLength = inputLines.get(0).length();
        StringBuilder readValue = new StringBuilder();
        for (int i=0; i<inputLength/3; i++) {
            String firstReadRow = inputLines.get(0).substring(i*3, (i+1) * 3);
            String secondReadRow = inputLines.get(1).substring(i*3, (i+1) * 3);
            String thirdReadRow = inputLines.get(2).substring(i*3, (i+1) * 3);

            for (int j=0; j<=9; j++) {
                if (Digit.DIGITS.get(j).equalsWithLine(firstReadRow + secondReadRow + thirdReadRow)) {
                    readValue.append(j);
                }
            }
        }


        return readValue.toString();
    }

}
