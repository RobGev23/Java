public class Main {
    public static void main(String[] args) {

        //Написать метод String replace(String str, char oldChar, char newChar) который в переданной строке str меняет все символы  oldChar на символы newChar.  Например: replace(«саша», ‘c’, ‘м’) -> «маша»

        String str = "sasha";
        char oldChar = 's';
        char newChar = 'm';
        System.out.println(replace(str,oldChar,newChar));

    }


    public static String replace(String str ,char oldChar,char newChar) {
        
        return str.replace(oldChar,newChar);
        }

    }


