import java.util.Scanner;
public class DivisibleBySeven {
    public static void main(String[] args) {
    System.out.println("Whats your integer");
    Scanner scanner = new Scanner(System.in);

    int userInteger = Integer.parseInt(scanner.nextLine());
    
    if (userInteger % 7 == 0) {
        System.out.println("yay");
    } else if (userInteger % 7 != 0) {
        System.out.println("oh well");
    }
    }
}