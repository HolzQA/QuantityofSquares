package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();

        int lConf = 200;
        int rConf = 500;
        System.out.println("Количество квадратов, входящих в диапазон от " + lConf + " до " + rConf + " равно " + service.quantSqr(lConf, rConf));
    }
}