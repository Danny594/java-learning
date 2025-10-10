package Zadaniya;

import java.util.Scanner;

public class lenreg {
    public static void main(String[] args) {
        /*
        Напишите программу, которая:
        Запрашивает у пользователя ввод строки.
        Выводит длину введенной строки.
        Выводит введенную строку в верхнем регистре.
         */
        Scanner scanner = new Scanner(System.in); //
        String pull = ""; // инициализация строки.

        System.out.println("Введите строку: "); // праглашение ввода пользователя.
        pull = scanner.nextLine(); // ввод строки.
        System.out.println("Количество символов в строке: " + pull.length()); // вывод количества символов с помощью метода .length().
    }
}
