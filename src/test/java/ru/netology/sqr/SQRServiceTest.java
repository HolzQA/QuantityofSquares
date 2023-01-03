package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import ru.netology.sqr.SQRService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/confines.csv")

    public void testQuantSqrInInterval(int expected, int leftConfine, int rightConfine) {
        SQRService service = new SQRService();

        int actual = service.quantSqr(leftConfine, rightConfine);

        Assertions.assertEquals(expected, actual);
    }
}
