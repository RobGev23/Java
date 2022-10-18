public class Main {
    public static void main(String[] args) {

        /*
        1.Реализовать метод, который создает и заполняет массив числами int в диапазоне от minValue до maxValue

        2.Дан массив int. Реализовать метод, который считает сумму положительных  элементов массива.
          {3, 2, -1, 5, -3} ->10

         */
        array(4,10);

    }
    public static int [] array (int minValue,int maxValue){
        int[] res = new int[minValue+maxValue];
        for (int i = minValue; i < maxValue; i++) {
            res[i]=maxValue;
            maxValue++;
        }
        return res;
    }

}