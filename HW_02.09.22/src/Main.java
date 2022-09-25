public class Main {
    public static void main(String[] args) {

        cubeOfNumber(3);
        resultOfMultiplication(3);

    }
    /*
     First level: С использованием цикла while записать метод, печатающий куб числа от 0 до данного чисда n.
     Пример: на входе n=3  на выходе 0,1,8,27
    */
    public static void cubeOfNumber(int number) {

        int i = 0;

        while (i <= number) {
            System.out.print(" "+i*i*i+" ");
            i += 1;
        }
        System.out.println();
    }
    /*
     Second level: С использованием цикла while записать метод, печатающий результат  умножения данного числа n  на все целые числа от 0 до n..
      Пример: на входе n=3  на выходе 0,3,6,9
     */

    public static void resultOfMultiplication(int number){

        int i=0;

        while (i<=number){
            System.out.print(" "+i*number+" ");
            i++;
        }

    }

}