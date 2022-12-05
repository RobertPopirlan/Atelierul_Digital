package ch1;

public class Main {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 100; i++) {


            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FIZZ+BUZZ");
                continue;
            }

            if (i % 3 == 0) {
                System.out.println("FIZZ");
                continue;
            }


            if (i % 5 == 0) {
                System.out.println("BUZZ");
                continue;
            }


            System.out.println(i);
        }

    }
}
