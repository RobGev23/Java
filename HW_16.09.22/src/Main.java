
public class Main {
    public static void main(String[] args) {

       /*
       First level: Написать метод, возвращающий целое число равное двойной длине строки, принимаемой в качестве аргумента метода.  Пример: hello -> 10


       Second level: Написать 2 метода:  один метод переставляет первую букву в конец строки (abcd-> bcda).
        Второй  метод переставляет последнюю букву в начало строки (abcd->dabc)
        */
        
        System.out.println(doubleWord("Hello"));
        System.out.println(firstLetterToEnd("abcd"));
        System.out.println(lastLetterToFirst("abcd"));

    }

    public static int doubleWord  (String string) {
        return 2* string.length();

    }

    public static String firstLetterToEnd (String string){
        String str1 = string.substring(1);
        String str2= string.substring(0,1);
        return str1+str2;

    }
    public static String lastLetterToFirst (String string){
        String str1 = string.substring(string.length()-1);
        String str2 = string.substring(0,string.length()-1);
        return str1+str2;
    }
}