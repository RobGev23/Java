public class Main {
    public static void main(String[] args) {

        /*
        Дана строка и 2 числа int: startIndex, endIndex. Необходимо получить и вывести на экран строку, которая состоит из всех символов исходной строки, начиная с позиции startIndex (включительно) до позиции endIndex (не включительно). Если startIndex  «не попадает в строку» или больше endIndex выводим “error”. Если endIndex не «попадает в строку»,  выводим, начиная со startIndex до конца строки.  Ограничение: в данной задаче нельзя пользоваться стандартными методам String кроме charAt() и length().
         “Java is a very popular language”,  startIndex=5  endIndex=13  -> “is a ver”
         “Java is a very popular language”,  startIndex=5  endIndex=-13  -> error
         “Java is a very popular language”,  startInd=ex5  endIndex=136  -> “is a very popular language”
         */

        String str = "Java is a very popular language";

        int startIndex = 5;
        int endIndex = 14;
        String res = " ";

        if (startIndex >= str.length() || startIndex < 0 || startIndex > endIndex) {
            System.out.println("error");

        } else {
            res = " " + str.charAt(startIndex);
            for (int i = startIndex + 1; i < endIndex && i < str.length(); i += 1) {
                res += str.charAt(i);
            }
        }
        System.out.println(res);

        /*

        // Homework

        Написать программу, которая выводит на экран таблицу умножения (таблицу Пифагора). Естественно, использовать циклы.

        1  2  3  4
        2  4  6  8
        3  6  9  12
        4  8 12  16

        public class Main {
    public static void main(String[] args) {

        int i = 1;
        int j;

        while (i <= 9) {
            j = 1;
            while (j <= 9) {
                System.out.print(i*j + "  ");
                j++;
            }
            System.out.println();
            i++;
        }


    }

}
         */


        // lessons Homework.


        int row = 9;
        int col = 9;
        System.out.print("       ");
        for (int j = 1; j < col; j++) {
            System.out.printf("%5d", j);
        }
        System.out.println();
        System.out.println("----------------------------------------------------");
        for (int i = 1; i <= row; i++) {
            System.out.printf("%3d |  ", i); // Namirazia po vertikali.
            for (int j = 1; j <= col; j++) {
                System.out.printf("%5d", i * j);
            }
            System.out.println();
        }


    }
}

