package com.epam.dojo.services;

import java.util.List;

public interface BankOcrService {

    List<String> readDigits(List<String> inputLines);

    public static BankOcrService getInstance() {
        return new BankOcrServiceImpl();
    }
}
