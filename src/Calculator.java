import java.util.Random;

public class Calculator {
    public static void main(String[] args) {

        //Task 3.1

        final int LENGTH = 10;
        int[] myArray = new int[LENGTH];
        Random rd = new Random();
        int a;
        for (a = 0; a < LENGTH; a++) {
            myArray[a] = rd.nextInt();
            System.out.println(a + " " +myArray[a]);

        }

        //Task 3.2

        int[] myArray2 = new int[10];

        for (int i = 0; i <  myArray2.length; i++) {
            myArray2[i] = i + 1;
        }

        int[] myArray3= new int[10];
        int d = 0;
        for (int i = 0; i < myArray2.length; i++) {
            if (myArray2[i] % 2 == 0) {
                myArray3[d] = myArray2[i];
                d++;
            }
        }
        int e = 0;
        while (a < myArray3.length) {
            System.out.println(e + " " +myArray3[a]);
            e++;
        }
    }
}
