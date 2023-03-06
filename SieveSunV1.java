import java.util.Scanner;

public class SieveSunV1 {
    public static void main(String[] args) {
        System.out.println("What number would you like to find all primes up to? ");
        Scanner scanner = new Scanner (System.in);
        int userMaxNumber = Integer.parseInt(scanner.nextLine());

        boolean[] booleanList = new boolean[userMaxNumber];
        for (int i = 0; i < userMaxNumber; i++) {
            booleanList[i] = true;
        }
        booleanList[0] = false;
        booleanList[1] = false;
        System.out.println("Your array is: ");
        for (int j = 0; j < userMaxNumber; j++) {
            System.out.print(booleanList[j] + " ");
            System.out.println();
        }

        for (int i = 0; i < booleanList.length; i++) {            
            if (i > 1 && i / i == 1 && i / 1 == i) {
                booleanList[i] = true;
            } else {
                booleanList[i] = false;
            }
        }
        System.out.println("Your array is: ");
        for (int j = 0; j < userMaxNumber; j++) {
            System.out.print(j + " ");
        }
    }
}