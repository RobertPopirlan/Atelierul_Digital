package ch2;

public class Main {

    public static void main(String[] args) {
        int[] myArray = new int[]{3, 2, -3, -2, 3, 0};
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        int[] newArray = new int[myArray.length];
        int nr = 0;
        boolean added = false;
        for (int i = 0; i < myArray.length; i++) {
            added= false;
            for (int j = 0; j < nr; j++) {
                if (myArray[i] == newArray[j]) {
                    added = true;
                }
            }

                if (added == false) {
                    newArray[nr++] = myArray[i];
                }

        }
        System.out.println(" ");
        for (int i = 0; i < nr; i++) {
            System.out.println(newArray[i] + " ");
        }
        int contror=0;
        Pair[] pairs = new Pair[nr - 1];
        for (int i = 0; i < nr; i++) {
            for (int j = i+1; j < nr; j++) {
                if (newArray[i] + newArray[j] == 0) {
                    pairs[contror++] = new Pair(newArray[i], newArray[j]);
                    System.out.println(pairs[contror-1]);
                }

            }


        }
        System.out.println("Number of pairs"+contror);
    }
}