import java.security.PublicKey;

public class Main {
    public static void main(String[] args) {

        // Задание 1
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int a = 10; a > 0; a--) {
            System.out.print(a + " ");

            //
        }
        // Задание 2

        int friday = 1;
        for (; i < 31; i = i + 7) {
            friday = friday + 7;
            System.out.println();
            System.out.println("Сегодня пятница,  день " + friday + "  необходимо подготовить отчет");
            System.out.println();
        }

        // Задание 3

        int start = 1822;
        for (int year = 1822; year <= 2122; year++) {
            if (year % 79 == 0) {
                System.out.println(year);


            }
        }
    }
}























