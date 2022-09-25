public class Main {
    public static void main(String[] args) {
        
        /*
        First level: 
        Дан массив целых чисел ( не пустой) . Написать метод, возвращающий наибольший элемент  этого массива .
        { 5,2,9,1} -> 9


        Second level: 
        Дан массив целых чисел ( не пустой) . Написать метод, возвращающий разницу между наибольшим и наименьшим  элементами  этого массива .
         { 5,2,9,1} -> 8
         
         */

        int[] array = {5, 2, 9, 1};
        System.out.println(arrayBiggestElement(array));

        int[] arr = {5, 2, 9, 1};
        System.out.println(differenceBetweenElement(arr));


    }

    public static int arrayBiggestElement(int[] array) {
        int maxElement = 0;

    // First exercise:

        // Calculation maximum element.

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }

        }
        return maxElement;
    }


    
    // Second exercise.
    public static int differenceBetweenElement(int[] arr) {
        int maxElement = 0;
        int minElement = arr.length;
        int difference = maxElement-minElement;

        // Calculation maximum element.

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }

        //  Calculation minimum element.

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < minElement) {
                    minElement = arr[j];
                }
            }

        //  Calculation difference.

            difference = maxElement - minElement;
        }

        return difference;
    }


}