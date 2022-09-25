public class Main {
    public static void main(String[] args) {

        /*
        Дан массив целых чисел. Реализовать метод, который возвращает минимальное значение в данном массиве. Например: {1,3,6,-1,4,-5,9} -> -5
         */
        int[] array = {1, 3, 6, -1, 4, -5, 9};
        System.out.println(getMinNumber(array));
        

    }

    //  First exercise.
    public static int getMinNumber(int[] array) {
        int minValue = array.length;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    // Second exercise.

    /*
     Дан массив строк. Реализовать метод, который возвращает индекс самой длинной строки в данном массиве. Например: {“qwe”,”axcvbn”,”qwertyuio”,”qas”} -> 2
     */




}