package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(
            value = {
                    "Range 100 to 200, 100, 200, 5",
                    "Range 200 to 300, 200, 300, 3",
                    "Range 100 to 500, 100, 500, 13",
                    "Range 300 to 400, 300, 400, 3",
                    "Range 500 to 2000, 500, 2000, 22",
                    "Range 3000 to 9000, 3000, 9000, 40",
            },
            delimiter = ','
    )
    void shouldCalculate(String testName, int rangeLowerBorder, int rangeUpperBorder, int expected) {
        SQRService testService = new SQRService();
        int foundCnt = testService.getSquareRootCount(rangeLowerBorder, rangeUpperBorder);
        assertEquals(expected, foundCnt);
    }
}
