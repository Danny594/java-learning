public class sumelement {
    public static void main(String[] args) {
        /*Задание 2:  Сумма элементов

        Объяви и инициализируй массив целых чисел values значениями: 5, 12, 8, 21, 3.
        Напиши код, который вычислит и выведет на экран сумму всех элементов этого массива.*/
        int[] mas1 = {5, 12, 8, 21, 3} ;
        int chet = 0;
        for (int i = 0; i < mas1.length; i++) {
            chet += mas1[i];
        }
        System.out.println("Сумма всех элементов массива: = " + chet);
    }
}