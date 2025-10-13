public class initialandout {
    public static void main(String[] args) {
        /*Задание 1: Инициализация и вывод

        Объяви массив целых чисел numbers размером 5.
        Инициализируй его значениями: 10, 20, 30, 40, 50.
        Выведи все элементы массива на экран, каждый на новой строке.*/

        int[] masfive = new int[5];
        masfive[0] = 10;
        masfive[1] = 20;
        masfive[2] = 30;
        masfive[3] = 40;
        masfive[4] = 50;

        System.out.println("Вывод элементов массива состоящего из 5 элементов.");

        for (int i = 0; i < masfive.length; i++)
            System.out.println("Индекс №" + i + " = " + masfive[i]);
    }
}
