public class Main {
    public static void main(String[] args) {
        /*
    First level: C помощью цикла for написать метод, печатающий цифры от 1 до  числа  n
    */

        int number = 7;
        System.out.println(countOfNumbers(number));
        System.out.println(sumOfNumbers(number));


    }


    public static int countOfNumbers(int number) {
        for (int i = 1; i < number;i++) {
            System.out.print(i+ " ");
        }
        return number;
    }


     /*
    Second level: C помощью цикла for написать метод возвращающий сумму цифр от 1 до числа n
     */
    public static int sumOfNumbers (int number){
        int sum= 0;

        for (int i = 1; i <= number; i++) {
            sum=sum+i;

        }
        return sum;
    }
}


