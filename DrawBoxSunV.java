import java.lang.Math;
import java.util.Scanner;

public class DrawBoxSunV {
    public static void main(String[] args) {
        System.out.print("Rectangle or square? ");
        Scanner scanner = new Scanner(System.in);
        String shapeName = scanner.nextLine();
        int width = 0;
        int height = 0;
        
        if (shapeName.equalsIgnoreCase("rectangle")) {
            System.out.println("What is the width?");
            width = Integer.parseInt(scanner.nextLine());
            System.out.println("What is the height?");
            height = Integer.parseInt(scanner.nextLine());
        } else if (shapeName.equalsIgnoreCase("square")) {
            System.out.println("What is the side length?");
            width = Integer.parseInt(scanner.nextLine());
            height = width;
        }
        drawQuad(height, width);
        System.out.println("The longest line is " + getHypotenuse(height,  width));
    }
    
    /* draws quadrilateral
    * @param height the height of the quadrilateral
    * @param width the width of the quadrilateral
    */ 
    public static void drawQuad(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 1; j < width; j++) {
                System.out.print("*");
            }
        System.out.println("*");
        }
    }
    
    /* gives the length of the hypotenuse
    * @param height height of the quadrilateral
    * @param width the width of the quadrilateral
    * @return prints the number length of the hypotenuse
    */
    public static double getHypotenuse(int height, int width) {
        return Math.sqrt(width * width + height * height);
    }
}