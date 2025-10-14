package Primeri;

public class firstvariables {
    public static void main(String[] args){
        // целые числа
        byte b1 = 10; // данные числа входят в диапазон byte.
        byte b2 = 20;
        byte b3 = 100;

        short a1 = 5; // данные числа входят в диапазон short
        short a2 = 10;
        short a3 = -10;

        int i1 = 500; // тип инт является целочисленным типом по дефолту в java.

        long l1 = 1000;
        long l2 = 10000000000L; // так как тип лонг не является дефолтным, необходимо указывать в конце числа букву L
        long l3 = 511L;

        // дробные числа
        float f1 = 3.14F; // float не является дефолтным, поэтому надо указывать букву F.
        float f2 = 2.5f;

        double d1 = 5.5D; // тип double является дефолтным, поэтому можно указывать как с буквой, таи и без нее.
        double d2 = 87.65d;
        double d3 = 123.78;

        // символьные
        char c1 = 'a';
        char c2 = 'A';
        char c3 = '7';
        char c4 = ' ';
        char c5 = 500; // мы берем код и таблицы юникода 10 ричной системы счисления
        char c6 = '\u0500'; // мы берем код и таблицы юникода 16 ричной системы счисления

        // логический
        boolean bool1 = true;
        boolean bool2 = false;

        int w1 = 60; // запись в десятеричной системе счисления (dec)
        int w2 = 0b111100; // запись в двоичной системе счисления (bin)
        int w3 = 074; // запись в восьмеричной системе счисления (oct)
        int w4 = 0x3c; // запись в шеснадцатеричной системе счисления (hex)

        System.out.println("Целые числа:");
        System.out.println("byte: " + b1 + ", " + b2 + ", " + b3);
        System.out.println("short: " + a1 + ", " + a2 + ", " + a3);
        System.out.println("int: " + i1);
        System.out.println("long: " + l1 + ", " + l2 + ", " + l3);
        System.out.println();
        System.out.println("Дробные числа: ");
        System.out.println("byte: " + f1 + ", " + f2);
        System.out.println("short: " + d1 + ", " + d2 + ", " + d3);
        System.out.println();
        System.out.println("Символы: ");
        System.out.println("char: " + c1 + ", " + c2 + ", " + c3 + ", " + c4 + ", " + c5 + ", " + c6);
        System.out.println();
        System.out.println("Логический: ");
        System.out.println(bool1);
        System.out.println(bool2);
        System.out.println();
        System.out.println("Запись в различных системах счисления");
        System.out.println("dec: " + w1 + ", bin: " + w2 + ", oct: " + w3 + ", hex: " + w4);
    }
}
