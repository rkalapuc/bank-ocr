import com.epam.dojo.domain.Digit;
import com.epam.dojo.domain.DigitSequence;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class TestCreator {

    @Test
    public void testWriteToFile() throws IOException {
        BufferedWriter writeIn = new BufferedWriter(new FileWriter("testIn.txt"));
        BufferedWriter writeOut = new BufferedWriter(new FileWriter("testOut.txt"));
        Random rand = new Random();
        for (int i=0; i<100; i++) {
            DigitSequence ds = new DigitSequence();
            StringBuilder out = new StringBuilder();
            for (int j=1; j<=4; j++){
                Integer value = rand.nextInt(9);
                ds.addDigit(Digit.DIGITS.get(value));
                out.append(value);
            }
            writeIn.write(ds.getDisplayValue());
            writeIn.write("\n");
            writeOut.write(out.toString());
            writeOut.write("\n");
        }

        writeIn.close();
        writeOut.close();
    }

    @Test
    public void testZeroOne() {
        DigitSequence ds = new DigitSequence();

        ds.addDigit(Digit.ZERO);
        ds.addDigit(Digit.ONE);
        ds.addDigit(Digit.TWO);
        ds.addDigit(Digit.THREE);
        ds.addDigit(Digit.FOUR);
        ds.addDigit(Digit.FIVE);
        ds.addDigit(Digit.SIX);
        ds.addDigit(Digit.SEVEN);
        ds.addDigit(Digit.EIGHT);
        ds.addDigit(Digit.NINE);

        System.out.println(ds.getDisplayValue());
    }

}
