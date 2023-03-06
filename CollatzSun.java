import java.util.Scanner;
    
    public class CollatzSun {
        public static void main(String[] args) {
            System.out.print("What number? ");
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            System.out.println(n);
            
            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                    System.out.println(n);
                } else if (n % 2 != 0) {
                    n = (n * 3) + 1;
                    System.out.println(n);
                }
            }
    }
}
