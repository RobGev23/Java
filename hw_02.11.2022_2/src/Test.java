import java.util.Random;

public class Test implements CreateArray{

    int[] arr = new int [10];


    @Override
    public void getArray(int a) {
        if (a == 1){
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (new Random()).nextInt(10);
                System.out.print(arr[i] + " ");
            }
        }
        if (a == 2){
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i;
                System.out.print(arr[i] + " ");
            }
        }
    }



}
