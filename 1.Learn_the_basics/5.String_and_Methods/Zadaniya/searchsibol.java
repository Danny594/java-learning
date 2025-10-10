package Zadaniya;

import java.util.Scanner;

public class searchsibol {
    public static void main(String[] args) {
        /*
        Задача 2: Поиск символа
        Напишите программу, которая:
        Имеет предопределенную строку (например, "Программирование").
        Находит и выводит индекс первого вхождения буквы 'р' в этой строке.
        Находит и выводит индекс последнего вхождения буквы 'р'.
        Если буква не найдена, выводит соответствующее сообщение.
         */
        String word = "Программирование";
        for (int i = 0; i < word.length(); i++ ) {
            System.out.println("Индекс " + i + " ---- " + word.charAt(i));


        }

    }
}
