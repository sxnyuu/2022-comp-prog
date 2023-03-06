import java.util.Scanner; 

public class ConvertDozen {
    public static void main(String[] args){
        System.out.print("How many?");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int answer = number;
        int dozens = converToDozens(number);
    }
    public static double converToDozens(int number) {
        double number = 0;
        return number / 12;
    }
} 