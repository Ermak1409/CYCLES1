package ru.netology.sqr;

public class SQRService {
    public int calculateSqr(int limit1, int limit2) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= limit1) {
                if (i * i <= limit2) {
                    count = count + 1;
                }
            }
        }
        return count;
    }
}
