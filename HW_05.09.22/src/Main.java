public class Main {
    public static void main(String[] args) {

        /*
        Дана строка строка, состоящая из нескольких слов разделенных пробелам, необходимо сформировать и вывести на экран строку вида содержащую первое и последнее слово исходной строки. Примечание: слова разделены одним пробелом, строка не содержит знаков препинания. Ограничение: в данной задаче нельзя пользоваться стандартными методам String кроме charAt() и length(). Например:

        “Java is a very popular language” ->  “Java language”

         */

        String str = "Java is a very popular language";

        String lastWord = "";
        int leftIndex = 0;
        int rightIndex = str.length() - 1;

        while (leftIndex < rightIndex && str.charAt(leftIndex) != ' ') {
            System.out.print(str.charAt(leftIndex));
            leftIndex++;

        }
        System.out.print(" ");

        while (rightIndex >= leftIndex && str.charAt(rightIndex) != ' ') {
            lastWord = str.charAt(rightIndex) + lastWord;
            rightIndex -= 1;
        }
        System.out.println(lastWord);

    }
}