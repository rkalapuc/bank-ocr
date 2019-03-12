package com.epam.dojo.services;

import java.util.List;

public interface BankOcrService {

    String readDigits(List<String> inputLines);

    static BankOcrService getInstance() {
        return new BankOcrServiceImpl();
    }
}
