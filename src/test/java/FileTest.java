import com.epam.dojo.services.BankOcrService;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileTest {

    @Test
    public void useTestFiles() throws IOException {
        BufferedReader testInput = new BufferedReader(new FileReader("testIn.txt"));
        BufferedReader testOutput = new BufferedReader(new FileReader("testOut.txt"));

        BankOcrService service = BankOcrService.getInstance();

        String expectedOutput;
        while ((expectedOutput = testOutput.readLine()) != null) {
            String actualOutput = service.readDigits(readRowsContainingDigits(testInput));
            TestCase.assertEquals(actualOutput, expectedOutput);
        }
    }

    @Test
    public void testSpeed() throws IOException {
        BufferedReader testInput = new BufferedReader(new FileReader("testIn.txt"));
        BufferedReader testOutput = new BufferedReader(new FileReader("testOut.txt"));

        BankOcrService service = BankOcrService.getInstance();

        String expectedOutput;
        long startTime = System.nanoTime();
        int caseCount = 0;
        while ((expectedOutput = testOutput.readLine()) != null) {
            String actualOutput = service.readDigits(readRowsContainingDigits(testInput));
            TestCase.assertEquals(actualOutput, expectedOutput);
            caseCount++;
        }
        long endTime = System.nanoTime();
        System.out.println("Time it took to run " + caseCount + " test cases: " + ((float) (endTime - startTime) /1000000000) + "s");

    }



    private List<String> readRowsContainingDigits(BufferedReader reader) throws IOException {
        List<String> digits = new ArrayList<>();

        for (int i=0; i<3; i++) {
            digits.add(reader.readLine());
        }

        return digits;
    }

}
