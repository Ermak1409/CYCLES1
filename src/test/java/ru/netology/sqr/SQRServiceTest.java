package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void shouldCalculateSqrInLimit_100_500() {

        SQRService service = new SQRService();
        int limit1 = 100;
        int limit2 = 500;
        int expected = 13;

        int actual = service.calculateSqr(limit1, limit2);
        assertEquals(expected, actual);

    }
    @Test
    public void shouldCalculateSqrInLimit_1_99() {

        SQRService service = new SQRService();
        int limit1 = 1;
        int limit2 = 99;
        int expected = 0;

        int actual = service.calculateSqr(limit1, limit2);
        assertEquals(expected, actual);

    }
    @Test
    public void shouldCalculateSqrInLimit_1_10000() {

        SQRService service = new SQRService();
        int limit1 = 1;
        int limit2 = 10_000;
        int expected = 90;

        int actual = service.calculateSqr(limit1, limit2);
        assertEquals(expected, actual);
    }
}