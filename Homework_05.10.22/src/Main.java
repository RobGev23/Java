public class Main {
    public static void main(String[] args) {

        /*
         Дано 2 массива. Первый массив String[] содержит имена студентов. Второй массив double[] содержит средний балл  студентов. i-й элемент первого массива соответствует i-элементу второго массива. Длины массивов равны. Необходимо написать метод, который возвращает имя самого успешного студена. В данной задаче, если 2 и более студента имеют лучший бал, метод может вернуть имя любого из них.

         */
        String[] studentName = {"John", "Michele", "Tom", "Kate", "mike"};
        double[] studentScore = {3.5, 4.2, 4.8, 1.1, 1.9};
        System.out.println(bestScoreName(studentName,studentScore));

        bestStudentScoreAndName(studentName, studentScore,4);

    }
    private static String bestScoreName(String[] name, double[] score) {

        double max = 0;
        String maxName=null;

        for (int i = 1; i < score.length-1 ; i++) {
                if (score[i] > score[i - 1]) {
                    max=i;
                }
            }
        for (int i = 0; i < name.length; i++) {
            if (i == max){
                maxName =name[i];
            }
        }
        return maxName;
    }
    /*
    Исходные условия как у предыдущей задачи, т.е. дано два массива один с именами другой с средним баллом, но ваш метод должен выдавать строку вида имя1 - балл1:имя2 - балл2:имя3 - балл3 ….для всех студентов, чей балл выше заданного значения. Например:
     {“Jack”, “John”, “Stan”, “Ed”}, {3.5, 4.2, 4.8, “4.1”}, 4.0 ->
      “John - 4.2:Stan - 4.8:Ed - 4.1”
     */
    private static void  bestStudentScoreAndName( String[] name, double[] score,double maxScore){

        for (int i = 0; i < score.length; i++) {
            if (score[i] > maxScore){
                System.out.println( name[i] +" - " + score[i]);
            }

        }
    }
}