import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* TODO
         Представьте, что в нашей программе мы обрабатываем массив (например, массив целых чисел или массив сотрудников,
         если хотите). В production мы запрашиваем ввод массива от пользователя (используем сканер), в тестовой среде мы
         получаем его как случайный массив или используем массив, определенный в коде. Итак, вам нужно реализовать метод
         getArray(), который в качестве аргумента принимает способ создания массива и в результате возвращает массив.
         Реализуйте эту программу (подсказка: используйте знания об интерфейсе)
      */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter < 1 > if you want Random numbers or  < 2 > if you want from existing numbers");
        int num = scanner.nextInt();

        Test test = new Test();
        test.getArray(num);

    }
}