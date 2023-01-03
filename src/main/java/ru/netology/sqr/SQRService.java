package ru.netology.sqr;

public class SQRService {

    public int quantSqr(int leftConfine, int rightConfine) {

        int n = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i > rightConfine) {
                return n;
            }
            if (i * i >= leftConfine) {
                n = n + 1;
            }
        }
        return n;
    }
}
