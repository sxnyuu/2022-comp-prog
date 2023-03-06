import java.util.Scanner;

public class DrawingSun {
    public static void main(String[] args) {

        System.out.print("What shape? ");
        Scanner scanner = new Scanner(System.in);
        String shapeName = scanner.nextLine();

        if (shapeName.equals("rectangle")) {
            System.out.print("Width ");
            int width = Integer.parseInt(scanner.nextLine());
            System.out.print("Length ");
            int length = Integer.parseInt(scanner.nextLine());
            if (length >= 20 || width >= 20) {
                System.out.println("Dimensions are too large");
            } else {
                for (int i = 0; i < length; i++) {
                    for (int j = 1; j < width; j++) {
                        System.out.print("*");
                    }
                    System.out.println("*");
                }
            }   
        } else if (shapeName.equals("triangle")) {
            System.out.print("Height ");
            int height = Integer.parseInt(scanner.nextLine());
            height += 1;
            if (height >= 21) {
                System.out.println("Dimensions too large");

            } else {
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                System.out.println("");
                }
            }
                
        }
            
        
    }
}
